package Praktikum4.Tugas;

public class CrossBowman extends Archer{
    CrossBowman(){
        this.hitPoint += 5;
        this.accuracy += 5;
    }

    void sayHero(String name){
        System.out.println("Hi "+name+" , saya adalah CrowsBowman Dengan Hit point : "+this.hitPoint +", dan Akurasi saya : "+this.accuracy +"%");
    }
}
