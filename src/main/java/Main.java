import devices.toaster.ToasterController;
import mainframe.MainframeController;

public class Main {
    public static void main(String[] args) throws Exception {
        ToasterController.run(3000, "Toaster001");
        MainframeController.run();
    }
}
