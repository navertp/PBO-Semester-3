package Pertemuan6.Praktikum.HewanOOP3;

class Anjing extends Mamalia {
    private boolean bisaMelacak;

    public Anjing(String nama, int umur) {
        super(nama, umur);
        this.bisaMelacak = true;
    }

    public void menggonggong() {
        System.out.println("Guk Guk");
    }
}
