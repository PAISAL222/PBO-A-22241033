package com.tutorial;

// clzss tanpa konstruktor
class polos {
    String dataString;
    int dataInteger;

}

// class dengan konstruktor
 class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    // membuat konstruktor tanpa parameter


        // Mahasiswa() {
        // System.out.println("Ini adalah konstruktor");
        // }


    // membuat konstruktor dengan parameter
    Mahasiswa (String inputnama, String inputnim, String inputprodi) {
        nama = inputnama;
        nim = inputnim;
        prodi = inputprodi;

        System.out.println("Ahmad :" + nama);
        System.out.println("22241041 :" + nim);
        System.out.println("pti :" + prodi);
        
    }
}

    public class Main{

        public static void main(String[] args) {
            // instansiasi objek dari kelas polos
            // Polos pls = new Polos();

            // // isi ciri pada objek pls
            // pls.dataString = "POLOS";
            // pls.dataInteger = 10;

            // // cetak data
            // System.out.println("Isi data String : " + pls.dataString);
            // System.out.println("Isi data Integer : " + pls.dataInteger" +pls.dataInteger);

            Mahasiswa mhs1 = new Mahasiswa("Ahmad", "22241041", "pti");

            // memanggil konstruktor
        
        
        }
    }

    

