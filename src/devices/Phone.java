package devices;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phone extends Device {

    private static final String serverAddress = "ArekadiuszGames.com";
    private static final String defaultProtocol = "HTTP";
    private static final String defaultVersionName = "Update no.";
    private List<Application> applications = new ArrayList<>();

    private int version;
    private String urlString;
    private List<String> appsToInstall;
    private URL url;

    public Phone(String name, String make, double value, double money) {
        super(name, make, value, money);
    }

    public double InstallAnApp(double ownerMoney, String name, String version, double price) {
        var application = new Application();
        application.Name = name;
        application.Version = version;
        application.Price = price;

        if (application.Price <= ownerMoney) {
            this.applications.add(application);
            System.out.println("App bought.");
            return ownerMoney -= application.Price;
        } else {
            System.out.println("Not enough money for this app.");
            return ownerMoney;
        }
    }

    public boolean CheckIfApplicationIsInstalled(Application appName) {
        for (var app : applications) {
            if (app.Name.equals(appName.Name)) {
                return true;
            }
        }
        return false;
    }

    public boolean CheckIfApplicationIsInstalled(String appName) {
        for (var app : applications) {
            if (app.Name.equals(appName)) {
                return true;
            }
        }
        return false;
    }

    public void getAllFreeApps() {
        for (var app : applications) {
            if (app.Price == 0) {
                System.out.println(app.Name);
            }
        }
    }

    public double getAllAppsValue() {
        double returnValue = 0;
        for (var app : applications) {
            returnValue += app.Price;
        }
        return returnValue;
    }

    public void getAllAppsInAlphabeticOrder() {
        List<String> sortedList = applications.stream().map(t -> t.Name).sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void getAllAppsPricesInAscOrder() {
        List<Double> sortedList = applications.stream().map(t -> t.Price).sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
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
