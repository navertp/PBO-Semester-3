package Pertemuan9.Praktikum;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total Sudut (1 parameter) : " + segitiga.totalSudut(60));
        System.out.println("Total Sudut (2 parameter) : " + segitiga.totalSudut(45, 30));
        System.out.println("Keliling (3 parameter) : " + segitiga.keliling(10, 15, 20));
        System.out.println("Keliling (2 parameter) : " + segitiga.keliling(3, 4));
    }
}
