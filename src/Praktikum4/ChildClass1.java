package Praktikum4;

public class ChildClass1 extends ParentClass{
    ChildClass1(String nama){
        super(nama);
    }

    @Override
    void sayHello(String nama) {
        System.out.println("Hi "+nama+", saya adalah monster "+name);
    }
}
