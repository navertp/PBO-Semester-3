package Pertemuan9.Praktikum;

public class MainManusia {
    public static void main(String[] args) {
        Manusia m;

        m = new Dosen();
        m.makan();
        m.bernafas();

        System.out.println();

        m = new Mahasiswa();
        m.makan();
        m.bernafas();
    }
}
