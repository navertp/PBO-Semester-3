package Pertemuan4.Tugas;

public class Petugas {
    private String idPetugas;
    private String nama;

    public Petugas(String idPetugas, String nama) {
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    public String info() {
        return "ID Petugas: " + idPetugas + "\nNama: " + nama + "\n";
    }
}