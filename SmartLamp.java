public class SmartLamp extends SmartDevice implements Connectable {

    public SmartLamp(String ipAddress) {
        super(ipAddress);
    }

    @Override
    public void turnOn() {
        System.out.println("Lampu menyala terang dengan IP [" + ipAddress + "]");
    }

    @Override
    public void connectWifi() {
        System.out.println("Lampu terhubung ke WiFi rumah");
    }
}