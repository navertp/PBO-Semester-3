package Pertemuan6.Praktikum.HewanOOP1;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        kucing.bersuara();
        kucing.mengeong();

        Anjing anjing = new Anjing("Yoshi");
        anjing.bersuara();
        anjing.menggonggong();
    }
}
