package Praktikum3;

public class Constructor {
    public Constructor(String name,int hp,int att){
//        System.out.println("hasil perkalian "+angka+" * "+angka1+" * "+angka2+" = "+angka*angka1*angka2);
        System.out.println("nama saya " + name+" nyawa saya "+hp+" damage "+att);


    }

    public static void main(String[] args) {
       Constructor pahlawan = new Constructor("pantimura",100,80);
    }
}
