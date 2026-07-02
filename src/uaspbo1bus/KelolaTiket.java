package uaspbo1bus;

import java.util.Scanner;

public class KelolaTiket {

    Scanner input = new Scanner(System.in);

    Bus[] daftar = new Bus[100];
    int jumlah = 0;
    int nomor = 1;

    // TAMBAH TIKET
    public void tambahTiket() {

        try {

            String kode = "TB00" + nomor;

            System.out.println("\n===== TAMBAH TIKET =====");

            System.out.print("Nama Penumpang : ");
            String nama = input.nextLine();

            System.out.print("NIK            : ");
            String nik = input.nextLine();

            System.out.print("No HP          : ");
            String noHp = input.nextLine();

            // Pilih Bus
            System.out.println("\nPilih Nama Bus");
            System.out.println("1. Damri");
            System.out.println("2. Rosalia Indah");
            System.out.println("3. Harapan Jaya");
            System.out.print("Pilih : ");
            int pilihBus = Integer.parseInt(input.nextLine());

            String namaBus = "";

            if (pilihBus == 1) {
                namaBus = "Damri";
            } else if (pilihBus == 2) {
                namaBus = "Rosalia Indah";
            } else {
                namaBus = "Harapan Jaya";
            }

            // Pilih Jurusan
            System.out.println("\nPilih Jurusan");
            System.out.println("1. Banjarmasin - Balikpapan");
            System.out.println("2. Banjarmasin - Samarinda");
            System.out.println("3. Banjarmasin - Palangkaraya");
            System.out.print("Pilih : ");
            int pilihJurusan = Integer.parseInt(input.nextLine());

            String asal = "";
            String tujuan = "";

            if (pilihJurusan == 1) {
                asal = "Banjarmasin";
                tujuan = "Balikpapan";
            } else if (pilihJurusan == 2) {
                asal = "Banjarmasin";
                tujuan = "Samarinda";
            } else {
                asal = "Banjarmasin";
                tujuan = "Palangkaraya";
            }

            // Pilih Kelas
            System.out.println("\nPilih Kelas Bus");
            System.out.println("1. Ekonomi");
            System.out.println("2. Bisnis");
            System.out.println("3. Executive");
            System.out.print("Pilih : ");
            int pilihKelas = Integer.parseInt(input.nextLine());

            String kelas = "";

            if (pilihKelas == 1) {
                kelas = "Ekonomi";
            } else if (pilihKelas == 2) {
                kelas = "Bisnis";
            } else {
                kelas = "Executive";
            }

            System.out.print("Nomor Kursi : ");
            int kursi = Integer.parseInt(input.nextLine());

            daftar[jumlah] = new Bus(
                    kode,
                    nama,
                    nik,
                    noHp,
                    namaBus,
                    asal,
                    tujuan,
                    kelas,
                    kursi);

            jumlah++;
            nomor++;

            System.out.println("\nData berhasil ditambahkan.");

        } catch (Exception e) {

            System.out.println("Input tidak valid!");

        }

    }

    // LIHAT TIKET
    public void lihatTiket() {

        if (jumlah == 0) {

            System.out.println("Belum ada data.");

        } else {

            for (int i = 0; i < jumlah; i++) {

                daftar[i].tampilData();

            }

        }

    }

    // CARI TIKET
    public void cariTiket() {

        System.out.print("Masukkan Kode Tiket : ");
        String kode = input.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < jumlah; i++) {

            if (daftar[i].getKodeTiket().equalsIgnoreCase(kode)) {

                daftar[i].tampilData();
                ketemu = true;
                break;

            }

        }

        if (!ketemu) {

            System.out.println("Data tidak ditemukan.");

        }

    }
    
    // EDIT TIKET
    public void editTiket() {

        System.out.print("Masukkan Kode Tiket : ");
        String kode = input.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < jumlah; i++) {

            if (daftar[i].getKodeTiket().equalsIgnoreCase(kode)) {

                ketemu = true;

                System.out.println("\n===== EDIT TIKET =====");

                System.out.print("Nama Baru : ");
                daftar[i].setNamaPenumpang(input.nextLine());

                System.out.print("NIK Baru : ");
                daftar[i].setNik(input.nextLine());

                System.out.print("No HP Baru : ");
                daftar[i].setNoHp(input.nextLine());

                // Pilih Nama Bus
                System.out.println("\nPilih Nama Bus");
                System.out.println("1. Damri");
                System.out.println("2. Rosalia Indah");
                System.out.println("3. Harapan Jaya");
                System.out.print("Pilih : ");
                int pilihBus = Integer.parseInt(input.nextLine());

                if (pilihBus == 1) {
                    daftar[i].setNamaBus("Damri");
                } else if (pilihBus == 2) {
                    daftar[i].setNamaBus("Rosalia Indah");
                } else {
                    daftar[i].setNamaBus("Harapan Jaya");
                }

                // Pilih Jurusan
                System.out.println("\nPilih Jurusan");
                System.out.println("1. Banjarmasin - Balikpapan");
                System.out.println("2. Banjarmasin - Samarinda");
                System.out.println("3. Banjarmasin - Palangkaraya");
                System.out.print("Pilih : ");
                int pilihJurusan = Integer.parseInt(input.nextLine());

                if (pilihJurusan == 1) {
                    daftar[i].setAsal("Banjarmasin");
                    daftar[i].setTujuan("Balikpapan");
                } else if (pilihJurusan == 2) {
                    daftar[i].setAsal("Banjarmasin");
                    daftar[i].setTujuan("Samarinda");
                } else {
                    daftar[i].setAsal("Banjarmasin");
                    daftar[i].setTujuan("Palangkaraya");
                }

                // Pilih Kelas
                System.out.println("\nPilih Kelas Bus");
                System.out.println("1. Ekonomi");
                System.out.println("2. Bisnis");
                System.out.println("3. Executive");
                System.out.print("Pilih : ");
                int pilihKelas = Integer.parseInt(input.nextLine());

                if (pilihKelas == 1) {
                    daftar[i].setKelasBus("Ekonomi");
                } else if (pilihKelas == 2) {
                    daftar[i].setKelasBus("Bisnis");
                } else {
                    daftar[i].setKelasBus("Executive");
                }

                System.out.print("Nomor Kursi Baru : ");
                daftar[i].setNomorKursi(Integer.parseInt(input.nextLine()));

                System.out.println("\nData berhasil diubah.");
                break;

            }

        }

        if (!ketemu) {

            System.out.println("Data tidak ditemukan.");

        }

    }

    // HAPUS TIKET
    public void hapusTiket() {

        System.out.print("Masukkan Kode Tiket : ");
        String kode = input.nextLine();

        boolean ketemu = false;

        for (int i = 0; i < jumlah; i++) {

            if (daftar[i].getKodeTiket().equalsIgnoreCase(kode)) {

                for (int j = i; j < jumlah - 1; j++) {

                    daftar[j] = daftar[j + 1];

                }

                jumlah--;
                ketemu = true;

                System.out.println("Data berhasil dihapus.");
                break;

            }

        }

        if (!ketemu) {

            System.out.println("Data tidak ditemukan.");

        }

    }

}