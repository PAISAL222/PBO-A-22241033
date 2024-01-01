package com.tutorial;


class player {
    // Data Member
    String name; // defult, bisa dibaca dan ditulis diluar class
    public int exp;//public, bisa dibaca dan ditulis diluar class 
    private int healt; //private, hanya bisa dibaca oleh class itu sendiri

    //Konstruktor
    player (String name, int exp, int healt){
        this.namne = name;
        this.exp = exp;
        this.health = health;
    }

    void display(){
    system.out.println("Hero 1 : " + this.name);
    system.out.println("Hero healt : " + this.health);
    system.out.println("Hero healt : " + this.exp);
    }
}

public class Main {
    
    public static void main(String[] args){
        // membuat objek atau instansiasi objek
        player hero_1 = new player(name:"Den bagus", exp:20, health:50)

        // default
        system.out.println(hero_1.name);
        hero_1.name = "ucup";
        system.out.println(hero_1.name);

        // public
        system.out.println(hero_1.exp); 
        hero_1.exp = 50;
        system.out.println(hero_1.exp);

        //private
        hero_1.display
    }
}