package uaspbo1bus;

public class InformasiTiket {

    // Atribut
    private String kodeTiket;
    private String namaPenumpang;
    private String nik;
    private String noHp;

    // Constructor
    public InformasiTiket(String kodeTiket, String namaPenumpang, String nik, String noHp) {

        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.nik = nik;
        this.noHp = noHp;

    }

    // Getter
    public String getKodeTiket() {
        return kodeTiket;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getNik() {
        return nik;
    }

    public String getNoHp() {
        return noHp;
    }

    // Setter
    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    // Menampilkan data penumpang
    public void tampilData() {

        System.out.println("--------------------------------");
        System.out.println("Kode Tiket     : " + kodeTiket);
        System.out.println("Nama           : " + namaPenumpang);
        System.out.println("NIK            : " + nik);
        System.out.println("No HP          : " + noHp);

    }

}