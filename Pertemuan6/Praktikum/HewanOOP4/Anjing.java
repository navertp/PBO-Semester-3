package Pertemuan6.Praktikum.HewanOOP4;

class Anjing extends Hewan {
    private String jenisBulu;

    public Anjing(String nama, int umur, String jenisBulu) {
        super(nama, umur);
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu() {
        return this.jenisBulu;
    }
}
