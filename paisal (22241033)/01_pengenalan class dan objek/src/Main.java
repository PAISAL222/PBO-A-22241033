package com.tutorial;


class Mahasiswa {
    String Nama;
    String Nim;
    String Prodi;
}

public class Main {

    public static void main(String[] args){
        // instansiasi pembuatan objek
        Mahasiswa mhs1 = new Mahasiswa();

        // objek mhs1 diberi atribut
        mhs1.Nama = "Muhammad.paisal";
        mhs1.Nim = "22241033";
        mhs1.Prodi = "Teknologi Informasi";

        System.out.println("Nama Mahasiswa:" + mhs1.Nama);
        System.out.println("Nim Mahasiswa:" + mhs1.Nim);
        System.out.println("Prodi Mahasiswa:" + mhs1.Prodi);


        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.Nama = "Muhammad.paisal";
        mhs2.Nim = "22241033";
        mhs2.Prodi = "Teknologi Informasi";

        System.out.println("Nama Mahasiswa:" + mhs2.Nama);
        System.out.println("Nim Mahasiswa:" + mhs2.Nim);
        System.out.println("Prodi Mahasiswa:" + mhs2.Prodi);

    }
    
    
}
