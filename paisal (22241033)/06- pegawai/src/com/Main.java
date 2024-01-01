package com.tutorial;
    
class pegawai{
  public string nama;
  public string jabatan;
  public float pajak;
  public float gajipokok;
  private float gajibersih;  

  pegawai (string nama, string jabatan,float pajak,float gajipokok){
    this.nama = nama;
    this.jabatan = jabatan;
    this.pajak = pajak/100;
    this.gajipokok = gajipokok;

  }

public float setpajak(float pajak){
    return this.pajak = pajak/100;
}

public float gajibersih(){
    return this.gajipokok -(this.gajipokok*this.pajak);
}

public void display(){
    System.out.printl("Nama karyawan:" + this.nama);
    System.out.printl("jabatan:"  + this.jabatan);
    System.out.printl("gajibesih" + this.gajibersih());
}

}
public class main {
public static void main(String[] args) {
    pegawai gaji = new pegawai(Muhammad paisal, dosen, 10, 35000000);
    gaji.display();
    gaji.setpajak(pajak*30);
    gaji.display();

    
}
}