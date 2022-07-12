package Praktikum4.Tugas;

public class Arbalester extends CrossBowman{
    Arbalester(){
        this.hitPoint += 5;
        this.accuracy += 5;

    }
    void sayHero(String name){
        System.out.println("Hi "+name+" , saya adalah Arbalester Dengan Hit point : "+this.hitPoint+", dan Akurasi saya : "+this.accuracy +"%");
    }
}
