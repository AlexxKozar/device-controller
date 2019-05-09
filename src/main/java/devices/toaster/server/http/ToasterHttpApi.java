package devices.toaster.server.http;

import devices.toaster.model.Toaster;
import spark.Request;
import spark.Response;

class ToasterHttpApi {

    private Toaster toaster;

    ToasterHttpApi(Toaster toaster){
        this.toaster = toaster;
    }

    String info(Request request, Response response){
        return "Here will be all available commands in JSON";
    }

    String turnOn(Request request, Response response){
        this.toaster.turnOn();
        response.body(this.toaster.getState());
        return "OK";
    }

    String turnOff(Request request, Response response){
        this.toaster.turnOff();
        response.body(this.toaster.getState());
        return "OK";
    }

    String getName(Request request, Response response){
        response.body(this.toaster.getName());
        return "OK";
    }

    String getState(Request request, Response response){
        response.body(this.toaster.getState());
        return "OK";
    }
}
