package Praktikum2;

public class Apps {
    public static void main(String[] args) {
        Print Ob = new Print();
        Ob.Print("aufal");
        System.out.println("ini hasilnya : "+tambah(3,6));

    }



    public static void print(){
        System.out.println("method 1");
    }
    public void print1(){
        System.out.println("method 2");
    }
    public static void print2(){
        System.out.println("method 3");
    }
    public static int tambah(int angka,int angka1){
        int hasil = angka + angka1;
        return hasil;
    }
}


class Print{
    public void Print(String nama){
        System.out.println("saya adalah : "+nama);
    }

}
