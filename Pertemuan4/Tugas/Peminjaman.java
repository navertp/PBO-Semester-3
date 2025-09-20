package Pertemuan4.Tugas;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private Petugas petugas;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(Anggota anggota, Buku buku, Petugas petugas,
                      String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.petugas = petugas;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public String info() {
        return "=== Data Peminjaman ===\n"
             + anggota.info() + "\n"
             + buku.info() + "\n"
             + petugas.info() + "\n"
             + "Pinjam: " + tanggalPinjam + "\nKembali: " + tanggalKembali + "\n";
    }
}