package uaspbo1bus;

import java.util.Scanner;

public class ProgramBus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        KelolaTiket kelola = new KelolaTiket();

        String username;
        String password;
        int pilihan;

        System.out.println("====================================");
        System.out.println("   SISTEM PEMESANAN TIKET BUS");
        System.out.println("====================================");

        // Login
        while (true) {

            System.out.print("Username : ");
            username = input.nextLine();

            System.out.print("Password : ");
            password = input.nextLine();

            if (username.equals("admin") && password.equals("123")) {

                System.out.println("\nLogin Berhasil!");
                break;

            } else {

                System.out.println("Username atau Password salah!\n");

            }

        }

        // Menu
        do {

            System.out.println("\n====================================");
            System.out.println("         MENU UTAMA");
            System.out.println("====================================");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Lihat Tiket");
            System.out.println("3. Cari Tiket");
            System.out.println("4. Edit Tiket");
            System.out.println("5. Hapus Tiket");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");

            try {

                pilihan = Integer.parseInt(input.nextLine());

                switch (pilihan) {

                    case 1:
                        kelola.tambahTiket();
                        break;

                    case 2:
                        kelola.lihatTiket();
                        break;

                    case 3:
                        kelola.cariTiket();
                        break;

                    case 4:
                        kelola.editTiket();
                        break;

                    case 5:
                        kelola.hapusTiket();
                        break;

                    case 6:
                        System.out.println("\nTerima kasih telah menggunakan aplikasi pesan tiket bus.");
                        break;

                    default:
                        System.out.println("Menu tidak tersedia.");

                }

            } catch (Exception e) {

                System.out.println("Input harus berupa angka!");
                pilihan = 0;

            }

        } while (pilihan != 6);

        input.close();

    }

}