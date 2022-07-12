package Praktikum4.Tugas;

public class Archer {
    int hitPoint, accuracy;
    Archer(){
        this.hitPoint = 30;
        this.accuracy = 80;
    }
    void sayHero(String name){
        System.out.println("Hi "+name+", saya adalah Archer Dengan Hit point : "+this.hitPoint+", dan Akurasi saya : "+this.accuracy +"%");
    }
}
