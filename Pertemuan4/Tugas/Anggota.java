package Pertemuan4.Tugas;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;

    public Anggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String info() {
        return "ID Anggota: " + idAnggota + "\nNama: " + nama + "\nAlamat: " + alamat + "\n";
    }
}