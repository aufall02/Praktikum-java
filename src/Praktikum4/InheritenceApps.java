package Praktikum4;

public class InheritenceApps {

    public static void main(String[] args) {
        ParentClass monster = new ParentClass("Monster");
        monster.sayHello("Aufal");

        monster = new ChildClass1("Tengkorak");
        monster.sayHello("Aufal");

        monster = new ChildClass2("Naga");
        monster.sayHello("Aufal");
    }
}
