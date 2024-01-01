package com.tutorial;


class Mahasiswa{
    // Data Member
    String nama;
    String nim;
    String prodi;

    // construktor dengan parameter
    Mahasiswa(String Nama, String Nim, String Prodi){
    this.nama = Nama;
    this.nim = Nim;
    this.prodi = Prodi;
    }

    // Method tanpa parameter dan tanpa return
    void show(){
        System.out.println("Nama :" + this.nama);
        System.out.println("Nim :" + this.nim);
        System.out.println("Prodi :" + this.prodi);
    }

    // method tanpa returen dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }
    // method dengan returen tanpa parameter
    String getNama(){
        return this.nama;
    }
    // method dengan return dan parameter
    String sayHi(String pesan){
        return pesan + "Assalammualaikum" + this.nama;
    }

}

public class Main {

    public static void main(String[] args) {
       // Instansiasi Objek
       Mahasiswa mhs1 = new Mahasiswa("Ahmad", "22241041","PTI");

       mhs1.show();
       mhs1.setNama("Hamdani");
       mhs1.show();
       System.out.println(mhs1.getNama());

       String pesan = mhs1.sayHi("waalaikumsalam");
       System.out.println(pesan);


    }
}
