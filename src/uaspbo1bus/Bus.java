package uaspbo1bus;

public class Bus extends Tiket {

    // Atribut
    private String namaBus;
    private String asal;
    private String tujuan;
    private String kelasBus;
    private int nomorKursi;
    private double harga;

    // Constructor
    public Bus(String kodeTiket, String namaPenumpang, String nik,
               String noHp, String namaBus, String asal,
               String tujuan, String kelasBus, int nomorKursi) {

        super(kodeTiket, namaPenumpang, nik, noHp);

        this.namaBus = namaBus;
        this.asal = asal;
        this.tujuan = tujuan;
        this.kelasBus = kelasBus;
        this.nomorKursi = nomorKursi;

        hitungHarga();
    }

    // Method menghitung harga
    public void hitungHarga() {

        if (kelasBus.equalsIgnoreCase("Ekonomi")) {
            harga = 150000;
        } else if (kelasBus.equalsIgnoreCase("Bisnis")) {
            harga = 250000;
        } else {
            harga = 350000;
        }

    }

    // Getter
    public String getNamaBus() {
        return namaBus;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getKelasBus() {
        return kelasBus;
    }

    public int getNomorKursi() {
        return nomorKursi;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setNamaBus(String namaBus) {
        this.namaBus = namaBus;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setKelasBus(String kelasBus) {
        this.kelasBus = kelasBus;
        hitungHarga();
    }

    public void setNomorKursi(int nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    // Menampilkan data tiket
    @Override
    public void tampilData() {

        super.tampilData();

        System.out.println("Nama Bus       : " + namaBus);
        System.out.println("Asal           : " + asal);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Kelas Bus      : " + kelasBus);
        System.out.println("Nomor Kursi    : " + nomorKursi);
        System.out.println("Harga Tiket    : Rp " + harga);
        System.out.println("------------------------------------");

    }

}