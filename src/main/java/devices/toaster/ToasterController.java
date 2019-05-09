package devices.toaster;

import devices.toaster.server.http.ToasterHttpServer;
import devices.toaster.model.Toaster;

public class ToasterController {

    public static void run(int port, String name) {
        Toaster toaster = new Toaster(name);
        ToasterHttpServer toasterHttpServer = new ToasterHttpServer();
        toasterHttpServer.start(port, toaster);
        System.out.println("Toaster is running...");
    }

}
