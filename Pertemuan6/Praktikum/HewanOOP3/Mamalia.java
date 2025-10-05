package Pertemuan6.Praktikum.HewanOOP3;

class Mamalia extends Hewan {
    public Mamalia(String nama, int umur) {
        super(nama, umur);
    }
    void menyusui() {
        System.out.println("Menyusui anaknya...");
    }
}
