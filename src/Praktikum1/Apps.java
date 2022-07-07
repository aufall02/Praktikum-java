package Praktikum1;
import Praktikum1.Panggil.TestPanggil;
class Percobaan{
    int angka2 = 5 ;
    /*
    public void setAngka1(int angka1) {
        this.angka2 = angka1;
        System.out.println("ini angka " + angka1);
    }

    public int getAngka1() {
        return angka2;
    }

     */

}
public class Apps {
    int angka;

    public static void main(String[] args) {
        Apps Ob = new Apps();
        Ob.angka = 5;
        Ob.angka += 10;
        System.out.println("ini angka dari Pemanggilan objek dari dalam class : "+Ob.angka);
        Percobaan Ob1 = new Percobaan();
        Ob1.angka2 += 10;
        System.out.println("ini angka dari Pemanggilan objek diluar Class : "+Ob1.angka2);
        Kelas1 Ob2 = new Kelas1();
        Ob2.angka1 += 10;
        System.out.println("ini angka dari Pemanggilan objek diluar class yang beda file : "+Ob2.angka1);
        TestPanggil Ob3 = new TestPanggil();
        Ob3.angka3 += 10;
        System.out.println("ini angka dari Pemanggilan objek diluar folder : "+Ob3.angka3);
    }
}
