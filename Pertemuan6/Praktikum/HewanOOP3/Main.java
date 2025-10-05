package Pertemuan6.Praktikum.HewanOOP3;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        kucing.berjalan();
        kucing.menyusui();

        Anjing anjing = new Anjing("Yoshi", 3);
        anjing.berjalan();
        anjing.menyusui();
        anjing.menggonggong();
    }
}
