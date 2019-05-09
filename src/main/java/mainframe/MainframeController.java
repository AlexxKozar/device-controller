package mainframe;

import mainframe.client.MainframeHttpClient;

public class MainframeController {
    public static void run(){
        MainframeHttpClient mainframeClient = new MainframeHttpClient();
        mainframeClient.addDevice("http://localhost:3000/api/info/");
    }
}
