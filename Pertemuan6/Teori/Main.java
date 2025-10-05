package Pertemuan6.Teori;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("John Zulfikar", "001", "244101010101", "TI");
        Dosen dosen1 = new Dosen("Pak Budi", "002", "160806", "Teknologi Informasix");

        TataTertib tt1 = new TataTertib("Tidak memakai almamater", "Teguran tertulis");
        TataTertib tt2 = new TataTertib("Terlambat masuk kelas", "Peringatan dosen");

        SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();
        Pelanggaran p1 = new Pelanggaran(mhs1, tt1, "02-10-2025");
        Pelanggaran p2 = new Pelanggaran(dosen1, tt2, "03-10-2025");

        sistem.catatPelanggaran(p1);
        sistem.catatPelanggaran(p2);

        sistem.lihatRiwayatPelanggaran(mhs1);
        sistem.lihatRiwayatPelanggaran(dosen1);
    }
}
