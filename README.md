# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana **Sistem Pemesanan Tiket Bus** yang dibuat menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah **Pemrograman Berbasis Objek 1**.

---

# Deskripsi

Aplikasi ini dibuat untuk membantu proses pengelolaan data pemesanan tiket bus secara sederhana melalui terminal (console). Pengguna diwajibkan melakukan login terlebih dahulu sebelum dapat mengakses menu utama. Setelah berhasil login, pengguna dapat melakukan proses tambah data, melihat data, mencari data, mengubah data, serta menghapus data tiket.

Data yang dikelola meliputi:

- Kode Tiket
- Nama Penumpang
- NIK
- Nomor HP
- Nama Bus
- Asal Keberangkatan
- Tujuan
- Kelas Bus
- Nomor Kursi
- Harga Tiket

Program ini dibuat dengan menerapkan konsep-konsep dasar Pemrograman Berbasis Objek (Object Oriented Programming/OOP) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

---

# Struktur Project

```
uaspbo1bus
│
├── Tiket.java
├── Bus.java
├── KelolaTiket.java
└── ProgramBus.java
```

---

# Penjelasan Class

## 1. Tiket.java

Class **Tiket** merupakan class induk yang digunakan untuk menyimpan data dasar setiap penumpang. Class ini berisi atribut utama seperti kode tiket, nama penumpang, NIK, dan nomor HP. Selain itu class ini juga memiliki constructor, getter, setter, serta method untuk menampilkan data penumpang.

Class ini menjadi dasar yang nantinya diwarisi oleh class **Bus**.

---

## 2. Bus.java

Class **Bus** merupakan turunan dari class **Tiket** menggunakan konsep inheritance.

Pada class ini ditambahkan atribut yang berkaitan dengan perjalanan bus, seperti nama bus, asal, tujuan, kelas bus, nomor kursi, dan harga tiket.

Selain itu class ini juga melakukan override terhadap method `tampilData()` sehingga informasi yang ditampilkan menjadi lebih lengkap.

---

## 3. KelolaTiket.java

Class **KelolaTiket** berfungsi sebagai pengelola seluruh data tiket.

Seluruh proses CRUD dilakukan pada class ini, yaitu:

- Tambah Tiket
- Lihat Tiket
- Cari Tiket
- Edit Tiket
- Hapus Tiket

Class ini juga menerapkan penggunaan array object, perulangan, percabangan, scanner, dan error handling.

---

## 4. ProgramBus.java

Class **ProgramBus** merupakan class utama yang memiliki method `main()`.

Program dimulai dari proses login. Setelah login berhasil, pengguna akan diarahkan ke menu utama untuk memilih fitur yang tersedia.

---

# Penjelasan Kode

Berikut merupakan penjelasan penerapan konsep-konsep Pemrograman Berbasis Objek pada project ini.

---

## 1. Class

Class merupakan blueprint atau cetakan untuk membuat object. Pada project ini terdapat empat class utama yaitu `Tiket`, `Bus`, `KelolaTiket`, dan `ProgramBus`. Masing-masing class memiliki tugas yang berbeda sehingga program menjadi lebih terstruktur.

Contoh deklarasi class:

```java
public class Tiket {

}

public class Bus extends Tiket {

}

public class KelolaTiket {

}

public class ProgramBus {

}
```

---

## 2. Object

Object merupakan hasil dari pembuatan sebuah class. Pada aplikasi ini object digunakan untuk menjalankan proses pengelolaan data tiket serta membuat data bus baru.

Contoh:

```java
KelolaTiket kelola = new KelolaTiket();
```

Object tersebut digunakan pada class `ProgramBus` untuk memanggil seluruh method CRUD.

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh suatu class.

Pada class Tiket terdapat beberapa atribut utama sebagai berikut.

```java
private String kodeTiket;
private String namaPenumpang;
private String nik;
private String noHp;
```

Atribut tersebut digunakan untuk menyimpan identitas setiap penumpang.

---

## 4. Constructor

Constructor merupakan method yang pertama kali dijalankan ketika object dibuat.

Pada class Tiket constructor digunakan untuk menginisialisasi seluruh data penumpang.

```java
public Tiket(String kodeTiket,
             String namaPenumpang,
             String nik,
             String noHp) {

    this.kodeTiket = kodeTiket;
    this.namaPenumpang = namaPenumpang;
    this.nik = nik;
    this.noHp = noHp;

}
```

Dengan adanya constructor, data dapat langsung diberikan ketika object dibuat sehingga proses pengisian data menjadi lebih mudah.

---

## 5. Mutator (Setter)

Mutator digunakan untuk mengubah nilai atribut yang telah dimiliki object.

Contoh method setter pada class Tiket yaitu:

```java
public void setNamaPenumpang(String namaPenumpang){
    this.namaPenumpang = namaPenumpang;
}

public void setNik(String nik){
    this.nik = nik;
}

public void setNoHp(String noHp){
    this.noHp = noHp;
}
```

Method tersebut digunakan ketika pengguna melakukan proses edit data tiket.

## 6. Accessor (Getter)

Accessor atau getter digunakan untuk mengambil nilai dari suatu atribut yang bersifat private. Dengan adanya getter, data tetap dapat diakses dari luar class tanpa harus mengubah nilai atribut secara langsung. Hal ini merupakan salah satu bentuk penerapan konsep encapsulation.

Contoh method getter pada class **Tiket** sebagai berikut.

```java
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
```

Getter tersebut digunakan pada class lain ketika ingin menampilkan informasi tiket maupun melakukan proses pencarian data.

---

## 7. Encapsulation

Encapsulation merupakan konsep untuk menyembunyikan data sehingga atribut tidak dapat diakses secara langsung dari luar class. Seluruh atribut dibuat **private**, sedangkan akses dilakukan menggunakan method getter dan setter.

Contoh penerapan encapsulation pada class **Tiket**.

```java
private String kodeTiket;
private String namaPenumpang;
private String nik;
private String noHp;
```

Kemudian atribut tersebut diakses melalui method berikut.

```java
getKodeTiket();
setNamaPenumpang();
```

Dengan demikian keamanan data menjadi lebih terjaga karena perubahan data hanya dapat dilakukan melalui method yang telah disediakan.

---

## 8. Inheritance

Inheritance atau pewarisan digunakan agar sebuah class dapat mewarisi atribut dan method dari class lain.

Pada project ini, class **Bus** merupakan turunan dari class **Tiket** sehingga seluruh atribut dan method pada class Tiket dapat digunakan kembali tanpa harus ditulis ulang.

Contoh implementasi inheritance.

```java
public class Bus extends Tiket
```

Dengan adanya inheritance, program menjadi lebih ringkas dan mudah dikembangkan apabila nantinya ingin menambahkan fitur baru.

---

## 9. Polymorphism

Polymorphism merupakan kemampuan suatu method memiliki bentuk yang berbeda. Pada project ini digunakan **Method Overriding**, yaitu menimpa method yang berasal dari class induk.

Method `tampilData()` pada class **Bus** digunakan untuk menampilkan informasi yang lebih lengkap dibandingkan class **Tiket**.

Contoh.

```java
@Override
public void tampilData() {
    super.tampilData();

    System.out.println("Nama Bus      : " + namaBus);
    System.out.println("Asal          : " + asal);
    System.out.println("Tujuan        : " + tujuan);
    System.out.println("Kelas Bus     : " + kelasBus);
    System.out.println("Nomor Kursi   : " + nomorKursi);
    System.out.println("Harga Tiket   : Rp" + harga);
}
```

Method tersebut akan dipanggil secara otomatis ketika object bertipe **Bus** digunakan.

---

## 10. Seleksi

Seleksi digunakan untuk menentukan keputusan berdasarkan kondisi tertentu.

Pada project ini digunakan percabangan **if-else** untuk menentukan harga tiket berdasarkan kelas bus.

Contoh.

```java
if (kelasBus.equalsIgnoreCase("Ekonomi")) {
    harga = 150000;
} else if (kelasBus.equalsIgnoreCase("Bisnis")) {
    harga = 250000;
} else {
    harga = 350000;
}
```

Selain itu digunakan juga **switch-case** pada menu utama untuk menentukan proses yang dipilih oleh pengguna.

```java
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
        System.out.println("Terima kasih.");
        break;

    default:
        System.out.println("Menu tidak tersedia.");
}
```

Dengan adanya seleksi, program dapat memberikan respon sesuai pilihan pengguna.

## 11. Perulangan

Perulangan digunakan untuk menjalankan suatu proses secara berulang tanpa harus menuliskan kode yang sama berkali-kali. Pada aplikasi ini, perulangan digunakan ketika menampilkan seluruh data tiket yang telah disimpan di dalam array serta ketika menu utama ditampilkan selama pengguna belum memilih keluar dari program.

Contoh penggunaan perulangan **for** pada proses menampilkan data tiket.

```java
for (int i = 0; i < jumlahData; i++) {
    daftar[i].tampilData();
    System.out.println("-----------------------------");
}
```

Sedangkan perulangan **do-while** digunakan pada menu utama agar program tetap berjalan sampai pengguna memilih menu keluar.

```java
do {

    // menampilkan menu

} while (pilihan != 6);
```

Dengan adanya perulangan, program menjadi lebih efisien karena tidak perlu menuliskan perintah secara berulang.

---

## 12. Input Output Sederhana

Input Output (I/O) sederhana merupakan proses menerima data dari pengguna dan menampilkan hasil ke layar.

Pada project ini digunakan class **Scanner** untuk menerima input dari keyboard.

```java
Scanner input = new Scanner(System.in);
```

Contoh menerima input.

```java
System.out.print("Masukkan Nama Penumpang : ");
String nama = input.nextLine();

System.out.print("Masukkan NIK : ");
String nik = input.nextLine();
```

Sedangkan output menggunakan method berikut.

```java
System.out.println("=== DATA TIKET BUS ===");
```

Konsep ini digunakan hampir di seluruh bagian program karena aplikasi bersifat interaktif.

---

## 13. Array

Array digunakan untuk menyimpan banyak object Bus dalam satu variabel sehingga data dapat dikelola dengan lebih mudah.

Contoh deklarasi array object.

```java
Bus[] daftar = new Bus[100];
```

Kemudian setiap data baru akan disimpan ke dalam array.

```java
daftar[jumlahData] = new Bus(
        kodeTiket,
        namaPenumpang,
        nik,
        noHp,
        namaBus,
        asal,
        tujuan,
        kelasBus,
        nomorKursi
);

jumlahData++;
```

Dengan menggunakan array, aplikasi mampu menyimpan banyak data tiket selama kapasitas array masih tersedia.

---

## 14. Error Handling

Error Handling digunakan untuk menangani kesalahan yang mungkin terjadi ketika program dijalankan. Dengan adanya Error Handling, program tidak langsung berhenti apabila pengguna melakukan kesalahan input.

Contoh penggunaan **try-catch**.

```java
try {

    pilihan = input.nextInt();

} catch (Exception e) {

    System.out.println("Input harus berupa angka.");

    input.nextLine();

}
```

Error Handling membuat program menjadi lebih aman dan memberikan pesan kesalahan yang mudah dipahami oleh pengguna.

---

# Usulan Nilai

| No | Materi | Nilai |
| :-: | ---------------- | :---: |
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Atribut | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | Input Output Sederhana | 10 |
| 13 | Array | 15 |
| 14 | Error Handling | 15 |
| | **TOTAL** | **100** |

---

# Cara Menjalankan Program

1. Buka project menggunakan NetBeans IDE.
2. Pastikan seluruh file Java berada dalam package yang sama.
3. Jalankan class **ProgramBus.java**.
4. Masukkan username dan password sesuai yang telah ditentukan pada program.
5. Setelah login berhasil, pilih menu yang tersedia.
6. Gunakan fitur Tambah, Lihat, Cari, Edit, atau Hapus data tiket sesuai kebutuhan.
7. Pilih menu Keluar apabila ingin mengakhiri program.

---

# Kesimpulan

Aplikasi **Sistem Pemesanan Tiket Bus** berhasil dibuat dengan menerapkan konsep-konsep dasar Pemrograman Berbasis Objek (Object Oriented Programming). Program mampu mengelola data tiket bus melalui proses tambah, lihat, cari, edit, dan hapus data. Selain itu, aplikasi juga telah menerapkan konsep Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling sehingga sesuai dengan materi yang dipelajari pada mata kuliah Pemrograman Berbasis Objek 1.

Walaupun aplikasi ini masih sederhana, program sudah dapat digunakan sebagai dasar untuk pengembangan sistem pemesanan tiket bus yang lebih lengkap di masa mendatang, misalnya dengan menggunakan database, GUI, maupun laporan cetak.

---

# Pembuat

**Nama :** Fajar Wijanarko

**NPM :** 2410010571

**Kelas :** 4B Non-Reguler Banjarmasin

**Mata Kuliah :** Pemrograman Berbasis Objek 1

**Program Studi :** Sistem Informasi

**Falkultas :** Teknik Informatika

**Universitas :** Universitas Islam Kalimantan Muhammad Arsyad Al-Banjari (UNISKA MAB)
