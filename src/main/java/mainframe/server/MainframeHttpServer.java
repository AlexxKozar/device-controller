package mainframe.server;

import static spark.Spark.*;


public class MainframeHttpServer {

    private MainframeHttpApi mainframeHttpApi;

    public void start(int port){
        this.mainframeHttpApi = new MainframeHttpApi();
        port(port);
        path("/api", () -> {
            get("/", (req, res) -> "Mainframe is working");
        });

    }

}
