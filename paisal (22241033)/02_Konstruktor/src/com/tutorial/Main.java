package com.tutorial;

// clzss tanpa konstruktor
class polos {
    string dataString;
    int dataInteger;

}

// class dengan konstruktor
 class Mahasiswa {
    string nama;
    string nim;
    string prodi;
    // membuat konstruktor tanpa parameter


        Mahasiswa() {
        System.out.println("Ini adalah konstruktor");
        }


        // // membuat konstruktor dengan parameter
        // Mahasiswa (String inputnama, String inputnim, String inputprodi) {

        
    }

    public class main {

        public static void main(String[] args) {
            // instansiasi objek dari kelas polos
            // Polos pls = new Polos();

            // // isi ciri pada objek pls
            // pls.dataString = "POLOS";
            // pls.dataInteger = 10;

            // // cetak data
            // System.out.println("Isi data String : " + pls.dataString);
            // System.out.println("Isi data Integer : " + pls.dataInteger" +pls.dataInteger);

            Mahasiswa mhs1 = new Mahasiswa();

            // memanggil konstruktor
        
        }
    }
