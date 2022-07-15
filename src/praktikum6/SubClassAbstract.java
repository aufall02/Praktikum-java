package praktikum6;

public class SubClassAbstract extends AbstractClass{

    @Override
    void lari() {
        System.out.println("lariiiiiiii");
    }

    @Override
    void lompat() {
        System.out.println("lompattttt");
    }

    @Override
    void makan() {
        System.out.println("makannnnnnn");
    }

    @Override
    void kali(int a, int b) {
        int hasil = a*b;
        System.out.println("hasil dari "+a+" * "+b+" = "+hasil);
    }
}
