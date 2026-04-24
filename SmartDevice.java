public abstract class SmartDevice {
    protected String ipAddress;

    public SmartDevice(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public abstract void turnOn();
}