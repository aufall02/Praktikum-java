package Praktikum4.Tugas;

public class HeroApps {
    public static void main(String[] args) {
        Archer archer = new Archer();
        archer.sayHero("Aufal");

        archer = new CrossBowman();
        archer.sayHero("Aufal");

        archer = new Arbalester();
        archer.sayHero("Aufal");
    }
}
