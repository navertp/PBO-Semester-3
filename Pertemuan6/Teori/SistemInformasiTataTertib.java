package Pertemuan6.Teori;

import java.util.ArrayList;

class SistemInformasiTataTertib {
    private ArrayList<Pelanggaran> daftarPelanggaran = new ArrayList<>();

    public void catatPelanggaran(Pelanggaran pelanggaran) {
        daftarPelanggaran.add(pelanggaran);
        System.out.println("Pelanggaran dicatat: " + pelanggaran.getPelanggar().getNama());
    }

    public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
        System.out.println("Riwayat Pelanggaran " + anggota.getNama() + ":");
        for (Pelanggaran p : daftarPelanggaran) {
            if (p.getPelanggar().equals(anggota)) {
                System.out.println("- " + p.getPeraturanDilanggar().getPeraturan() + 
                                   " pada " + p.getTanggal() + 
                                   " (Sanksi: " + p.getPeraturanDilanggar().getSanksi() + ")");
            }
        }
    }
}
