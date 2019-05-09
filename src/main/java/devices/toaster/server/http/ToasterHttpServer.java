package devices.toaster.server.http;

import static spark.Spark.*;

import devices.toaster.server.ToasterServer;
import devices.toaster.model.Toaster;

public class ToasterHttpServer implements ToasterServer {

    private ToasterHttpApi toasterHttpApi;

    public ToasterHttpServer(){
    }

    @Override
    public void start(int port, Toaster toaster){
        this.toasterHttpApi = new ToasterHttpApi(toaster);
        port(port);
        path("/api", () -> {
            path("/info", () -> {
                get("/", (req, res) -> this.toasterHttpApi.info(req, res));
            });
            path("/turn", () -> {
                post("/on/", (req, res) -> this.toasterHttpApi.turnOn(req, res));
                post("/off/", (req, res) -> this.toasterHttpApi.turnOff(req, res));
            });
            path("/name", () -> {
                get("/", (req, res) -> toasterHttpApi.getName(req, res));
            });
            path("/state", () -> {
                get("/", (req, res) -> this.toasterHttpApi.getState(req, res));
            });
        });
    }
}