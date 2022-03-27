package devices;

import com.company.Human;
import com.company.Salleable;

import java.net.URL;
import java.util.List;

public class Phone extends Device {

    private static final String serverAddress = "ArekadiuszGames.com";
    private static final String defaultProtocol = "HTTP";
    private static final String defaultVersionName = "Update no.";

    private int version;
    private String urlString;
    private List<String> appsToInstall;
    private URL url;

    public Phone(String name, String make, double value) {
        super(name, make, value);
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    public void installAnnApp(String appName){
        this.Name = appName;
    }

    public void installAnnApp(String appName, int version){
        this.Name = appName;
        this.version = version;
    }

    public void installAnnApp(String appName, int version, String urlString){
        this.Name = appName;
        this.version = version;
        this.urlString = urlString;
    }

    public void installAnnApp(List<String> appsToInstall){
        this.appsToInstall = appsToInstall;
    }

    public void installAnnApp(URL url){
        this.url = url;
    }

    public void getAllData() {
        System.out.println("App name: " + this.Name + " App version: " + this.version + " App url: " + this.urlString
                + " App apps list: " + this.appsToInstall.toString() + " App url: " + this.url.toString());
    }
}
