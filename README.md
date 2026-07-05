# Proyek Akhir Pemrograman Berbasis Objek 1

# Sistem Pemesanan Tiket Bus

---

# Deskripsi

Proyek ini merupakan aplikasi **Sistem Pemesanan Tiket Bus** yang dibuat menggunakan bahasa pemrograman **Java** sebagai tugas akhir (Ulangan Akhir Semester) mata kuliah **Pemrograman Berbasis Objek 1**.

Aplikasi ini dirancang untuk membantu proses pengelolaan data pemesanan tiket bus secara sederhana melalui tampilan berbasis **console**. Program memiliki sistem login sehingga hanya pengguna yang memiliki username dan password yang dapat mengakses menu utama. Setelah login berhasil, pengguna dapat melakukan pengelolaan data tiket mulai dari menambahkan data baru, melihat seluruh data, mencari data berdasarkan kode tiket, mengubah data yang telah tersimpan, hingga menghapus data apabila sudah tidak diperlukan.

Data yang dikelola pada aplikasi ini meliputi identitas penumpang seperti kode tiket, nama penumpang, NIK, nomor telepon, serta informasi perjalanan seperti nama bus, kota asal, kota tujuan, kelas bus, nomor kursi, dan harga tiket. Seluruh data tersebut disimpan menggunakan array object sehingga dapat diproses selama program dijalankan.

Selain berfungsi sebagai aplikasi pengelolaan data, project ini juga dibuat untuk menerapkan konsep-konsep **Object Oriented Programming (OOP)** yang telah dipelajari selama perkuliahan. Konsep tersebut meliputi Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

Dengan adanya pembagian class sesuai fungsinya masing-masing, struktur program menjadi lebih rapi, mudah dipahami, mudah dipelihara, serta dapat dikembangkan menjadi aplikasi berbasis GUI maupun database pada masa mendatang.

---

# Struktur Project

```text
uaspbo1bus
│
├── DataTiket.java
├── DataBus.java
├── KelolaTiket.java
└── ProgramBus.java
```

---

# Penjelasan Setiap Class

## 1. DataTiket.java

Class **DataTiket** merupakan class induk (parent class) yang digunakan untuk menyimpan informasi dasar mengenai data penumpang. Class ini memiliki beberapa atribut penting yaitu kode tiket, nama penumpang, NIK, dan nomor HP.

Selain menyimpan atribut, class ini juga memiliki constructor, method getter, setter, serta method untuk menampilkan data. Seluruh atribut dibuat menggunakan access modifier **private** sehingga data tidak dapat diakses secara langsung dari luar class. Hal tersebut merupakan penerapan konsep **Encapsulation**.

Potongan kode:

```java
public class DataTiket {

    private String kodeTiket;
    private String namaPenumpang;
    private String nik;
    private String noHp;

}
```

Penjelasan:

Potongan kode di atas menunjukkan bahwa class DataTiket digunakan sebagai tempat penyimpanan data dasar penumpang. Setiap atribut memiliki fungsi yang berbeda, misalnya `kodeTiket` digunakan sebagai identitas unik, sedangkan `namaPenumpang`, `nik`, dan `noHp` digunakan sebagai identitas penumpang.

---

## 2. DataBus.java

Class **DataBus** merupakan class turunan (child class) dari **DataTiket**. Class ini mewarisi seluruh atribut dan method yang dimiliki oleh class DataTiket melalui konsep **Inheritance**.

Selain atribut yang diwariskan, DataBus juga memiliki atribut tambahan berupa nama bus, asal, tujuan, kelas bus, nomor kursi, dan harga tiket.

Potongan kode:

```java
public class DataBus extends DataTiket {

    private String namaBus;
    private String asal;
    private String tujuan;
    private String kelasBus;
    private String nomorKursi;
    private double harga;

}
```

Penjelasan:

Dengan menggunakan inheritance, class DataBus tidak perlu membuat ulang atribut yang sudah dimiliki DataTiket. Hal ini membuat program menjadi lebih ringkas dan mudah dikembangkan. Class ini juga melakukan overriding terhadap method `tampilData()` sehingga informasi yang ditampilkan menjadi lebih lengkap.

---

## 3. KelolaTiket.java

Class **KelolaTiket** merupakan class yang bertugas mengelola seluruh data pemesanan tiket bus. Semua proses CRUD (Create, Read, Update, Delete) dilakukan pada class ini.

Beberapa fitur yang tersedia pada class ini yaitu:

- Menambah data tiket
- Menampilkan seluruh data
- Mencari data
- Mengubah data
- Menghapus data

Selain itu class ini juga menggunakan Scanner, Array Object, Perulangan, Percabangan, dan Error Handling.

Potongan kode:

```java
public class KelolaTiket {

    Scanner input = new Scanner(System.in);

    DataBus[] daftar = new DataBus[100];

    int jumlahData = 0;

}
```

Penjelasan:

Array object digunakan sebagai media penyimpanan seluruh data tiket bus. Variabel `jumlahData` digunakan untuk menghitung jumlah data yang telah tersimpan sehingga proses penambahan maupun penghapusan data menjadi lebih mudah.

---

## 4. ProgramBus.java

Class **ProgramBus** merupakan class utama yang memiliki method `main()` sebagai titik awal program dijalankan.

Potongan kode:

```java
public class ProgramBus {

    public static void main(String[] args){

        KelolaTiket kelola = new KelolaTiket();

        kelola.login();

        kelola.menu();

    }

}
```

Penjelasan:

Object `kelola` dibuat dari class KelolaTiket. Setelah object berhasil dibuat, program akan menjalankan method `login()` terlebih dahulu. Apabila login berhasil, pengguna akan diarahkan menuju menu utama sehingga seluruh fitur pada aplikasi dapat digunakan.

---

# Penjelasan Kode

## 1. Class

Class merupakan blueprint atau cetakan yang digunakan untuk membuat object. Class berisi atribut dan method yang nantinya akan digunakan untuk menjalankan suatu proses.

Pada project ini terdapat empat class utama yaitu DataTiket, DataBus, KelolaTiket, dan ProgramBus.

Potongan kode:

```java
public class DataTiket {

}

public class DataBus extends DataTiket {

}

public class KelolaTiket {

}

public class ProgramBus {

}
```

Penjelasan:

Keempat class tersebut memiliki tanggung jawab yang berbeda. DataTiket digunakan untuk menyimpan data dasar penumpang, DataBus menyimpan informasi perjalanan, KelolaTiket mengelola proses CRUD, sedangkan ProgramBus menjalankan seluruh aplikasi. Pembagian class seperti ini membuat struktur program menjadi lebih terorganisir.

---

## 2. Object

Object merupakan hasil dari pembuatan sebuah class. Object digunakan untuk memanggil atribut maupun method yang terdapat pada class.

Potongan kode:

```java
KelolaTiket kelola = new KelolaTiket();
```

Penjelasan:

Pada potongan kode tersebut dibuat sebuah object bernama `kelola` yang berasal dari class `KelolaTiket`. Object ini digunakan untuk menjalankan seluruh fitur seperti login, menu utama, tambah data, lihat data, cari data, edit data, dan hapus data.

Tanpa adanya object, method yang terdapat pada class tidak dapat dijalankan. Oleh karena itu object menjadi bagian penting dalam konsep Object Oriented Programming.

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh sebuah class dan digunakan untuk menyimpan data.

Potongan kode:

```java
private String kodeTiket;
private String namaPenumpang;
private String nik;
private String noHp;
```

Penjelasan:

Atribut di atas digunakan untuk menyimpan identitas penumpang. Setiap atribut memiliki fungsi yang berbeda sehingga data yang tersimpan menjadi lebih lengkap dan terstruktur.

Penggunaan access modifier `private` bertujuan untuk menjaga keamanan data agar tidak dapat diakses secara langsung dari luar class.

---

## 4. Constructor

Constructor merupakan method khusus yang akan dijalankan secara otomatis ketika object dibuat.

Potongan kode:

```java
public DataTiket(String kodeTiket,
                 String namaPenumpang,
                 String nik,
                 String noHp){

    this.kodeTiket = kodeTiket;
    this.namaPenumpang = namaPenumpang;
    this.nik = nik;
    this.noHp = noHp;

}
```

Penjelasan:

Constructor digunakan untuk memberikan nilai awal pada setiap atribut. Keyword `this` digunakan untuk membedakan antara atribut class dengan parameter constructor.

Dengan adanya constructor, proses pembuatan object menjadi lebih mudah karena seluruh data dapat langsung diisi melalui parameter tanpa harus memanggil setter satu per satu.

# 5. Mutator (Setter)

Mutator atau **Setter** merupakan method yang digunakan untuk mengubah nilai suatu atribut yang terdapat di dalam class. Setter sangat penting dalam konsep **Encapsulation** karena atribut yang bersifat `private` tidak dapat diubah secara langsung dari luar class. Oleh sebab itu, perubahan data dilakukan melalui method setter yang telah disediakan.

Pada aplikasi **Sistem Pemesanan Tiket Bus**, setter digunakan ketika pengguna ingin melakukan proses **Edit Data**. Saat pengguna memilih menu edit, data lama akan diganti dengan data baru melalui method setter.

### Potongan Kode

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

### Penjelasan

Method `setNamaPenumpang()` digunakan untuk mengubah nama penumpang yang sebelumnya telah tersimpan.

Method `setNik()` digunakan untuk memperbarui nomor identitas (NIK) penumpang.

Method `setNoHp()` digunakan untuk mengubah nomor telepon penumpang apabila terjadi perubahan data.

Keyword **this** digunakan untuk menunjukkan bahwa atribut yang berada di dalam class akan diisi menggunakan nilai parameter yang dikirimkan.

Contoh penggunaannya ketika proses edit data:

```java
dataBus.setNamaPenumpang(namaBaru);
dataBus.setNik(nikBaru);
dataBus.setNoHp(noHpBaru);
```

Dengan adanya setter, perubahan data menjadi lebih aman karena hanya atribut tertentu yang dapat diubah melalui method yang telah disediakan.

---

# 6. Accessor (Getter)

Accessor atau **Getter** merupakan method yang digunakan untuk mengambil atau membaca nilai suatu atribut. Getter digunakan karena atribut dibuat bersifat `private` sehingga tidak dapat diakses secara langsung dari luar class.

Pada aplikasi ini getter digunakan ketika program ingin menampilkan data penumpang maupun saat proses pencarian data berdasarkan kode tiket.

### Potongan Kode

```java
public String getKodeTiket(){
    return kodeTiket;
}

public String getNamaPenumpang(){
    return namaPenumpang;
}

public String getNik(){
    return nik;
}

public String getNoHp(){
    return noHp;
}
```

### Penjelasan

Method `getKodeTiket()` digunakan untuk mengambil nilai kode tiket.

Method `getNamaPenumpang()` digunakan untuk mengambil nama penumpang.

Method `getNik()` digunakan untuk mengambil nomor identitas penumpang.

Method `getNoHp()` digunakan untuk mengambil nomor telepon penumpang.

Contoh penggunaan getter:

```java
System.out.println(dataBus.getNamaPenumpang());
```

Getter memungkinkan data tetap dapat dibaca tanpa harus membuka akses langsung terhadap atribut.

---

# 7. Encapsulation

Encapsulation merupakan konsep menyembunyikan data agar tidak dapat diakses secara langsung dari luar class. Konsep ini bertujuan untuk menjaga keamanan data sehingga perubahan maupun pengambilan data hanya dapat dilakukan melalui method tertentu.

Pada project ini seluruh atribut dibuat menggunakan access modifier `private`.

### Potongan Kode

```java
private String kodeTiket;
private String namaPenumpang;
private String nik;
private String noHp;
```

Kemudian disediakan getter dan setter.

```java
public String getNamaPenumpang(){
    return namaPenumpang;
}

public void setNamaPenumpang(String namaPenumpang){
    this.namaPenumpang = namaPenumpang;
}
```

### Penjelasan

Dengan menggunakan Encapsulation, data menjadi lebih aman karena pengguna tidak dapat mengubah isi atribut secara langsung.

Sebagai contoh, apabila atribut dibuat `public`, maka seluruh bagian program dapat mengubah nilainya tanpa kontrol. Namun dengan Encapsulation, seluruh perubahan harus melalui setter sehingga programmer dapat mengatur bagaimana data diproses.

Konsep ini merupakan salah satu prinsip utama dalam Object Oriented Programming yang membuat program menjadi lebih aman, rapi, dan mudah dipelihara.

---

# 8. Inheritance

Inheritance merupakan konsep pewarisan dimana sebuah class dapat mewarisi atribut maupun method dari class lain.

Pada aplikasi ini class **DataBus** mewarisi class **DataTiket**.

### Potongan Kode

```java
public class DataBus extends DataTiket{

}
```

### Penjelasan

Keyword **extends** menunjukkan bahwa DataBus merupakan turunan dari DataTiket.

Artinya seluruh atribut dan method yang terdapat pada DataTiket secara otomatis dapat digunakan oleh DataBus tanpa harus ditulis kembali.

Hal ini membuat kode menjadi lebih singkat dan mengurangi pengulangan penulisan program.

Selain mewarisi atribut, constructor DataBus juga memanggil constructor milik DataTiket menggunakan keyword **super()**.

### Potongan Kode

```java
super(kodeTiket,
      namaPenumpang,
      nik,
      noHp);
```

### Penjelasan

Keyword **super()** digunakan untuk menjalankan constructor yang terdapat pada class induk.

Dengan demikian seluruh atribut milik DataTiket akan langsung terisi ketika object DataBus dibuat.

Penerapan Inheritance membuat hubungan antar class menjadi lebih jelas sehingga project lebih mudah dikembangkan apabila di kemudian hari ingin menambahkan jenis kendaraan lain.

---

# 9. Polymorphism

Polymorphism merupakan kemampuan sebuah object untuk memiliki banyak bentuk.

Pada aplikasi ini konsep Polymorphism diterapkan menggunakan **Method Overriding**.

Method `tampilData()` yang terdapat pada DataBus menggantikan method yang dimiliki DataTiket sehingga informasi yang ditampilkan menjadi lebih lengkap.

### Potongan Kode

```java
@Override
public void tampilData(){

    super.tampilData();

    System.out.println("Nama Bus : " + namaBus);
    System.out.println("Asal : " + asal);
    System.out.println("Tujuan : " + tujuan);
    System.out.println("Kelas Bus : " + kelasBus);
    System.out.println("Nomor Kursi : " + nomorKursi);
    System.out.println("Harga Tiket : Rp" + harga);

}
```

### Penjelasan

Annotation `@Override` menunjukkan bahwa method tersebut menggantikan method yang terdapat pada class induk.

Method `super.tampilData()` digunakan untuk menampilkan data dasar penumpang yang berasal dari class DataTiket.

Setelah itu program akan menampilkan informasi tambahan seperti nama bus, asal perjalanan, tujuan, kelas bus, nomor kursi, dan harga tiket.

Dengan menggunakan Polymorphism, method yang sama dapat menghasilkan keluaran yang berbeda sesuai dengan class yang menjalankannya.

Konsep ini membuat program lebih fleksibel serta memudahkan proses pengembangan apabila nantinya terdapat jenis kendaraan lain selain bus.

# 10. Seleksi (Percabangan)

Seleksi atau percabangan merupakan salah satu struktur kendali dalam bahasa pemrograman yang digunakan untuk menentukan tindakan berdasarkan suatu kondisi tertentu. Dengan adanya seleksi, program dapat memilih proses yang berbeda sesuai dengan kondisi yang dimasukkan oleh pengguna.

Pada aplikasi **Sistem Pemesanan Tiket Bus**, konsep seleksi digunakan pada beberapa bagian program, seperti proses login, pemilihan menu utama, penentuan harga tiket berdasarkan kelas bus, serta proses pencarian data.

### Potongan Kode

```java
if (kelasBus.equalsIgnoreCase("Ekonomi")) {

    harga = 150000;

} else if (kelasBus.equalsIgnoreCase("Bisnis")) {

    harga = 250000;

} else if (kelasBus.equalsIgnoreCase("VIP")) {

    harga = 350000;

} else {

    System.out.println("Kelas bus tidak tersedia.");

}
```

### Penjelasan

Pada potongan kode di atas program akan membandingkan nilai yang dimasukkan oleh pengguna dengan nama kelas bus.

Apabila pengguna memilih **Ekonomi**, maka harga tiket akan disimpan sebesar Rp150.000.

Apabila memilih **Bisnis**, harga tiket menjadi Rp250.000.

Sedangkan apabila memilih **VIP**, harga tiket menjadi Rp350.000.

Jika pengguna memasukkan kelas yang tidak tersedia, maka program akan menampilkan pesan bahwa kelas bus tidak ditemukan.

Konsep seleksi membuat program mampu mengambil keputusan secara otomatis sesuai kondisi yang terjadi.

---

# 11. Perulangan (Looping)

Perulangan digunakan ketika program ingin menjalankan suatu proses secara berulang tanpa harus menuliskan kode yang sama berkali-kali.

Pada aplikasi ini, perulangan digunakan ketika menampilkan seluruh data tiket, mencari data, maupun menghapus data.

### Potongan Kode

```java
for (int i = 0; i < jumlahData; i++) {

    daftar[i].tampilData();

}
```

### Penjelasan

Perulangan dimulai dari indeks ke-0 hingga indeks terakhir sesuai jumlah data yang tersimpan.

Setiap object DataBus yang terdapat di dalam array akan dipanggil method `tampilData()` sehingga seluruh informasi tiket dapat ditampilkan.

Selain itu, perulangan juga digunakan ketika proses pencarian data.

```java
for(int i=0;i<jumlahData;i++){

    if(daftar[i].getKodeTiket().equalsIgnoreCase(kodeCari)){

        daftar[i].tampilData();

    }

}
```

Dengan menggunakan looping, program dapat memproses seluruh data secara otomatis tanpa harus memanggil setiap object satu per satu.

---

# 12. Input Output Sederhana

Input Output merupakan proses menerima data dari pengguna kemudian menampilkan hasil pengolahan data tersebut.

Pada aplikasi ini input dilakukan menggunakan class **Scanner**, sedangkan output ditampilkan menggunakan **System.out.println()**.

### Potongan Kode

```java
Scanner input = new Scanner(System.in);

System.out.print("Masukkan Nama Penumpang : ");

String nama = input.nextLine();
```

### Penjelasan

Scanner digunakan untuk membaca data yang dimasukkan melalui keyboard.

Method `nextLine()` digunakan ketika program menerima input berupa teks.

Setelah data berhasil diterima, program akan menampilkan hasil menggunakan perintah berikut.

```java
System.out.println("===== DATA PEMESANAN TIKET BUS =====");
```

Output digunakan untuk memberikan informasi kepada pengguna mengenai hasil proses yang telah dilakukan.

Input dan Output merupakan bagian yang sangat penting karena menjadi media komunikasi antara pengguna dengan program.

---

# 13. Array

Array merupakan struktur data yang digunakan untuk menyimpan banyak object dengan tipe data yang sama.

Pada aplikasi ini array digunakan sebagai tempat penyimpanan seluruh data pemesanan tiket bus.

### Potongan Kode

```java
DataBus[] daftar = new DataBus[100];
```

### Penjelasan

Array tersebut mampu menyimpan hingga 100 object DataBus.

Setiap object akan ditempatkan pada indeks tertentu sesuai urutan penyimpanannya.

Proses penambahan data dilakukan sebagai berikut.

```java
daftar[jumlahData] = new DataBus(...);

jumlahData++;
```

Ketika pengguna menambahkan data baru, object akan disimpan pada indeks berikutnya, kemudian nilai `jumlahData` akan bertambah satu.

Array juga digunakan ketika proses penghapusan data.

```java
for(int i=index;i<jumlahData-1;i++){

    daftar[i]=daftar[i+1];

}

jumlahData--;
```

Perulangan tersebut digunakan untuk menggeser seluruh data setelah indeks yang dihapus sehingga tidak terdapat data kosong di tengah array.

---

# 14. Error Handling

Error Handling digunakan untuk menangani kesalahan yang terjadi ketika program sedang berjalan.

Pada aplikasi ini Error Handling diterapkan menggunakan blok **try-catch**.

### Potongan Kode

```java
try{

    pilihan = input.nextInt();

}catch(Exception e){

    System.out.println("Input harus berupa angka.");

    input.nextLine();

}
```

### Penjelasan

Blok `try` digunakan untuk menjalankan kode yang berpotensi menghasilkan error.

Apabila pengguna memasukkan input yang tidak sesuai, maka program akan langsung berpindah ke blok `catch`.

Pada blok `catch`, program menampilkan pesan kesalahan sehingga pengguna mengetahui penyebab terjadinya error.

Method `input.nextLine()` digunakan untuk membersihkan buffer Scanner sehingga program dapat menerima input kembali.

Dengan adanya Error Handling, aplikasi menjadi lebih stabil dan tidak langsung berhenti ketika pengguna melakukan kesalahan input.

# Usulan Nilai

| No | Materi | Nilai |
|:--:|----------------------------|:----:|
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

Berikut langkah-langkah menjalankan aplikasi Sistem Pemesanan Tiket Bus.

### 1. Membuka Project

Buka project menggunakan **Apache NetBeans IDE** atau IDE Java lainnya yang mendukung bahasa pemrograman Java.

Pastikan seluruh file berikut berada pada package yang sama.

```text
DataTiket.java
DataBus.java
KelolaTiket.java
ProgramBus.java
```

---

### 2. Menjalankan Program

Jalankan file **ProgramBus.java** karena class tersebut merupakan class utama yang memiliki method `main()`.

```java
public static void main(String[] args){

    KelolaTiket kelola = new KelolaTiket();

    kelola.login();

    kelola.menu();

}
```

Ketika program dijalankan, sistem akan menampilkan halaman login.

---

### 3. Login

Masukkan username dan password yang telah ditentukan pada program.

Apabila data login benar maka pengguna akan diarahkan menuju menu utama.

Apabila salah, program akan meminta pengguna mengulangi proses login.

---

### 4. Menggunakan Menu

Setelah login berhasil, pengguna dapat memilih menu yang tersedia.

Menu yang dapat digunakan antara lain:

- Tambah Data
- Lihat Data
- Cari Data
- Edit Data
- Hapus Data
- Keluar

Setiap menu memiliki fungsi yang berbeda sesuai dengan kebutuhan pengguna dalam mengelola data pemesanan tiket bus.

---

### 5. Keluar Program

Apabila seluruh proses telah selesai, pilih menu **Keluar** sehingga program akan berhenti dengan normal.

---

# Kesimpulan

Berdasarkan hasil pembuatan dan pengujian program, aplikasi **Sistem Pemesanan Tiket Bus** telah berhasil dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep-konsep **Object Oriented Programming (OOP)**.

Program mampu mengelola data pemesanan tiket bus mulai dari proses login, penambahan data, menampilkan data, pencarian data, perubahan data, hingga penghapusan data melalui menu yang tersedia.

Dalam pengembangannya telah diterapkan berbagai konsep penting seperti **Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling**. Penerapan konsep-konsep tersebut membuat struktur program menjadi lebih rapi, mudah dipahami, serta mudah dikembangkan kembali pada masa mendatang.

Walaupun aplikasi ini masih menggunakan tampilan berbasis console dan penyimpanan data menggunakan array, seluruh fungsi utama telah berjalan dengan baik sesuai tujuan pembuatan project. Ke depannya program ini masih dapat dikembangkan menjadi aplikasi berbasis GUI maupun database agar memiliki fitur yang lebih lengkap.

Melalui project ini, penulis memperoleh pengalaman dalam menerapkan konsep Pemrograman Berbasis Objek secara langsung ke dalam sebuah studi kasus sederhana sehingga pemahaman terhadap materi perkuliahan menjadi lebih baik.

---

# Pembuat

**Nama** : Fajar Wijanarko

**NPM** : 2410010571

**Kelas** : 4B Non Reguler Banjarmasin

**Mata Kuliah** : Pemrograman Berbasis Objek 1

**Fakultas** : Fakultas Teknologi Informasi

**Program Studi** : Teknik Informatika

**Universitas** : Universitas Islam Kalimantan Muhammad Arsyad Al-Banjari (UNISKA MAB)
