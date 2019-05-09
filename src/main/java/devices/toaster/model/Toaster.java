package devices.toaster.model;

public class Toaster {

    private final String name;
    private String state;

    public Toaster(String name){
        this.name = name;
        this.state = "Off";
        System.out.println("Toaster " + this.name + " is created");
    }

    public String getName() {
        System.out.println("Name: " + this.name);
        return this.name;
    }

    public String getState() {
        System.out.println("State: " + this.state);
        return this.state;
    }

    public void turnOn(){
        System.out.println("Turn on");
        this.state = "On";
    }

    public void turnOff(){
        System.out.println("Turn off");
        this.state = "Off";
    }
}
