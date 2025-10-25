package Pertemuan9.Teori;

class GasStation {
    void isiBahanBakar(MobilKuno mk, int bayar) {
        int hargaPertalite = 5000;
        int liter = bayar / hargaPertalite;
        System.out.println("Mobil tua diisi pertalite sebanyak " + liter + " liter");
    }

    void isiBahanBakar(MobilMewah mm, int bayar) {
        int hargaPertamax = 10000;
        int liter = bayar / hargaPertamax;
        System.out.println("Mobil mewah diisi pertamax sebanyak " + liter + " liter");
    }
}
