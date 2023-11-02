package com.tutorial;

// class tanpa konstruktor
class polos {
    String dataString;
    String dataIntergen;
}

// class dengan konstruktor
class mahasiswa {
    String Nama;
    String NIM;
    String prodi;

    // membuat konstruktor tanpa parameter
    //mahasiswa() {
    //System.out.println("ini adalah konstruktor");
  // }

   // membuat konstruktor tanpa parameter
mahasiswa (String inputnama, String inputNIM, String inputprodi) {
    Nama = inputnama;
    NIM = inputNIM;
    prodi = inputprodi;
}
}

public class main  {
    public static void main(String args[]) {
        // // instansiasi objek dari class polos 
        // polos pls =new polos();

        // // isi ciri pada objek pls
        // pls.dataString ="polos";
        // pls.dataIntergen = "10";

        // // cetak data 
        // System.out.println("isi data String :" + pls.dataString);
        // System.out.println("isi data interger :" + pls.dataIntergen);
        mahasiswa mhs1 =new mahasiswa(null, null, null);

        // memanggil konstuktor
    }
}