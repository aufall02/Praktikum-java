package Praktikum2;

public class Apps {
    public static void main(String[] args) {
        print();
        print1();
        print2();
        Print Ob = new Print();
        Ob.print("aufal",7,9);
        System.out.println("ini hasilnya : "+tambah(3,6));

    }



    public static void print(){
        System.out.println("method 1");
    }
    public static void print1(){
        System.out.println("method 2");
    }
    public static void print2(){
        System.out.println("method 3");
    }
    public static int tambah(int angka,int angka1){
        return angka + angka1;
    }
}


class Print{
    public void print(String nama,int angka,int angka1){
        System.out.println("nama saya  : "+nama);
        int hasil = angka * angka1;
        System.out.println("hasil perkalian dari "+angka +" * "+angka1+" = " + hasil);

    }


}
