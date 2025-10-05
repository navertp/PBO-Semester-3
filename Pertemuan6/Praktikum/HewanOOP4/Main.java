package Pertemuan6.Praktikum.HewanOOP4;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.info();
        kucing.berjalan();
        //System.out.println(kucing.nama);
        System.out.println(kucing.umur);

        System.out.println();

        Anjing anjing = new Anjing("Yoshi", 3, "Lebat");
        anjing.info();
        anjing.berjalan();
        System.out.println("Jenis Bulu: " + anjing.getJenisBulu());
    }
}
