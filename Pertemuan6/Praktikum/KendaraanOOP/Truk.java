package Pertemuan6.Praktikum.KendaraanOOP;

class Truk extends Kendaraan {
    int kapasitasMuatan;

    public Truk(String merk, int tahunProduksi, int kapasitasMuatan) {
        super(merk, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    void jalankan() {
        System.out.println("Truk " + merk + " berjalan dengan muatan berat.");
    }

    @Override
    void info() {
        super.info();
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + " ton");
    }
}
