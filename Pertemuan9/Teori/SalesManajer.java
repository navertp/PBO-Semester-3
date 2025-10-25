package Pertemuan9.Teori;

class SalesManajer extends Manajer {
    private String departemen;

    public SalesManajer(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    @Override
    public void naikkanGaji() {
        gaji += 1000000;
    }

    @Override
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
}
