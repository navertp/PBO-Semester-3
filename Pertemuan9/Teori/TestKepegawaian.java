package Pertemuan9.Teori;

public class TestKepegawaian {
    public static void main(String[] args) {
        Manajer man = new Manajer("Bill Gates", 5000000);
        Supervisor spv = new Supervisor("Susanto", 1000000);
        SalesManajer slman = new SalesManajer("Jessica", "IT", 2000000);

        man.naikkanGaji();
        spv.naikkanGaji();
        slman.naikkanGaji();

        man.cetakStatus();
        System.out.println();
        spv.cetakStatus();
        System.out.println();
        slman.cetakStatus();
    }
}
