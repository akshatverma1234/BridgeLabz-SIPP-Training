package Introduction_To_Inheritence;

class Device {
    String deviceId;
    String status;
}

class Thermostat extends Device {
    int temperatureSetting;
    void displayStatus() {
        System.out.println(deviceId + " " + status + " " + temperatureSetting);
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = "A1000";
        t.status = "ON";
        t.temperatureSetting = 20;
        t.displayStatus();
    }
}
