package Pertemuan1;

class HP {
    String merk;
    String chipset;

    HP(String merk, String chipset) {
        this.merk = merk;
        this.chipset = chipset;
    }

    void nyalakan() {
        System.out.println(merk + " dengan chipset " + chipset + " menyala...");
    }

    void kirimPesan(String pesan) {
        System.out.println("Mengirim pesan : " + pesan + " dari " + merk);
    }

    void cetakInfo() {
        System.out.println("HP Merk : " + merk + ", Chipset : " + chipset);
    }
}

class WirelessEarphone {
    String tipe;
    int batteryLife;

    WirelessEarphone(String tipe, int batteryLife) {
        this.tipe = tipe;
        this.batteryLife = batteryLife;
    }

    void connectBluetooth() {
        System.out.println(tipe + " tersambung ke perangkat.");
    }

    void aktifkanAnc() {
        System.out.println("ANC diaktifkan pada " + tipe);
    }

    void cetakInfo() {
        System.out.println("Wireless Earphone Tipe : " + tipe + ", Baterai : " + batteryLife + " jam");
    }
}

class Mouse {
    String merk;
    int dpi;

    Mouse(String merk, int dpi) {
        this.merk = merk;
        this.dpi = dpi;
    }

    void klikKiri() {
        System.out.println("Klik kiri dengan mouse " + merk);
    }

    void klikKanan() {
        System.out.println("Klik kanan dengan mouse " + merk);
    }

    void cetakInfo() {
        System.out.println("Mouse Merk: " + merk + ", DPI: " + dpi);
    }
}

class MouseOffice extends Mouse {
    String konektifitas;
    String warna;

    MouseOffice(String merk, int dpi, String konektifitas, String warna) {
        super(merk, dpi);
        this.konektifitas = konektifitas;
        this.warna = warna;
    }

    void scrollDokumen() {
        System.out.println("Scrolling dokumen dengan mouse office " + merk);
    }

    void hematBaterai() {
        System.out.println("Mode hemat baterai diaktifkan pada mouse office " + merk);
    }

    void cetakInfo() {
        super.cetakInfo();
        System.out.println("Konektivitas: " + konektifitas + ", Warna: " + warna);
    }
}

class MouseGaming extends Mouse {
    boolean rgb;
    int sideButton;

    MouseGaming(String merk, int dpi, boolean rgb, int sideButton) {
        super(merk, dpi);
        this.rgb = rgb;
        this.sideButton = sideButton;
    }

    void nyalakanRGB() {
        if (rgb) {
            System.out.println("RGB dinyalakan pada mouse gaming " + merk);
        } else {
            System.out.println("Mouse gaming " + merk + " tidak mendukung RGB.");
        }
    }

    void gunakanSideButton() {
        System.out.println("Menggunakan " + sideButton + " tombol samping pada mouse gaming " + merk);
    }

    void cetakInfo() {
        super.cetakInfo();
        System.out.println("RGB: " + (rgb ? "Ya" : "Tidak") + ", Side Button: " + sideButton);
    }
}