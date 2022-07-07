package Praktikum2.tugas;

public class Apps {
    public static void main(String[] args) {
        salam(0);
        System.out.println("hasillya : "+perkalian(3,5,6));
    }
    public static void salam(int masukkanAngka){
        if (masukkanAngka == 1){
            System.out.println("salammmm");
        } else if (masukkanAngka == 0) {
            System.out.println("terimaksih");
        } else {
            System.out.println("isi yang bener oiii");
        }
    }
    public static int perkalian(int angka,int angka1,int angka2){
        return angka*angka1*angka2;
    }
}
