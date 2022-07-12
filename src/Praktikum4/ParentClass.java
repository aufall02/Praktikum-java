package Praktikum4;

class ParentClass {
    String name;
    ParentClass(String nama){
        this.name = nama;
    }
    void sayHello(String nama){
        System.out.println("Hi "+nama+", saya adalah "+name);
    }
}
