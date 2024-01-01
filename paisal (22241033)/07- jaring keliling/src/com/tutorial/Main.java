package com.tutorial;


class Lingkaran {
    float r;
    float diameter;

    public Lingkaran (float r, float diameter){
        this.r = r;
        this.diameter = diameter;
}

void display(){
    float luas = (float)(Math.PI*r*r);
    float keliling = (float) (2*3.14*r);
    System.out.println("keliling lingkaran" + luas);
    System.out.println("Luas Lingkaran" + keliling);
}


public class main {

}


    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(50, 40);
        System.out.println("jari-jari : " + lingkaran.r);
        System.out.println("Diameter : " + lingkaran.diameter);
        lingkaran.display();
    }
}
