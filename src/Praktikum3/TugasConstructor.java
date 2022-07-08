package Praktikum3;

public class TugasConstructor {
    String id,character;
    int hp,damage;
    public TugasConstructor(String id){
       switch (id){
           case "0" -> System.out.println("nama character : petani \nhp : 20 \ndamage : 10");
           case "1" -> System.out.println("nama character : pemanah \nhp : 50 \ndamage : 50");
           case "2" -> System.out.println("nama character : pasukan berkuda \nhp : 70 \ndamage : 90");
           default -> {
               System.out.println("kode salah");
           }
       }
    }
}
class Apps2{
    public static void main(String[] args) {
    TugasConstructor character = new TugasConstructor("8");
//        System.out.println(new TugasConstructor("3"));
    }
}
