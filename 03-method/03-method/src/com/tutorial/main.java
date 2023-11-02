package com.tutorial;

class mahasiswa{
    // Data Member
    String nama;
    String nim;
    String prodi;

    // contruktor dengan parameter
    mahasiswa(String inputNama, String inputNIM, String inputprodi){
        nama = inputNama;
        nim = inputNIM;
        prodi = inputprodi; 
    }

    //method tanpa parameter dan tanpa return
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("prodi : " + this.prodi);
    }

    // method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // mathod dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    // method dengan return dan paramener
    String sayhi(String pesan){
        return pesan + "assalamualaikum"+ this.nama;
    }

    }

public class main {
    public static void main(String[] args) {
        // instansiansi objek 
        mahasiswa mhs1 = new mahasiswa("faesal", "22241033",
         "pti");

         mhs1.show();
         mhs1.setNama("sadboy");
         mhs1.show();
         System.out.println(mhs1.getNama());

         String pesan = mhs1.sayhi("hallo");
         System.out.println(pesan);


    }
}