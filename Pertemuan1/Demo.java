package Pertemuan1;

public class Demo {
    public static void main(String[] args) {
        HP hp = new HP("Samsung S10", "Snapdragon 855");
        WirelessEarphone tws = new WirelessEarphone("Redmi Buds 3 Pro", 36);
        MouseOffice mouseOffice = new MouseOffice("Logitech M175", 1000, "Wireless 2.4", "Hitam");
        MouseGaming mouseGaming = new MouseGaming("Ajazz", 26000, true, 2);

        hp.nyalakan();
        hp.kirimPesan("Selamat Pagi");
        hp.cetakInfo();

        System.out.println();
        tws.connectBluetooth();
        tws.aktifkanAnc();
        tws.cetakInfo();

        System.out.println();
        mouseOffice.scrollDokumen();
        mouseOffice.hematBaterai();
        mouseOffice.cetakInfo();
        
        System.out.println();
        mouseGaming.nyalakanRGB();
        mouseGaming.gunakanSideButton();
        mouseGaming.cetakInfo();
    }
}
