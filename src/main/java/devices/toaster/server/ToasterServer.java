package devices.toaster.server;
import devices.toaster.model.Toaster;

public interface ToasterServer {
    void start(int port, Toaster toaster);
}
