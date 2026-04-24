public class MainHub {
    public static void main(String[] args) {
        // 1. Instansiasi dan Upcasting
        // Objek SmartLamp disimpan dalam wadah (tipe data) SmartDevice
        SmartDevice myLamp = new SmartLamp("192.168.1.10");

        // 2. Panggil method turnOn
        myLamp.turnOn();

        // 3. Downcasting
        // Karena wadah SmartDevice tidak punya method connectWifi, 
        // kita perlu mengubahnya kembali ke tipe SmartLamp (atau Connectable).
        if (myLamp instanceof SmartLamp) {
            SmartLamp castedLamp = (SmartLamp) myLamp;
            castedLamp.connectWifi();
        }
    }
}