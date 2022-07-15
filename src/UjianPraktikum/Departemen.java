package UjianPraktikum;
import java.util.Scanner;
class Departemen {
    static int tunjanganAnakIstri,gajiTambahan,totalGajiPokok,gajiBersih,pajak;;
    static final Scanner input = new Scanner(System.in);
    static int gajiPokok = 3_000_000;
    Departemen (){
        System.out.println("+++++++++++++++Selamat Datang+++++++++++");
        System.out.print("Masukkan Departemen Anda [Rnd / HRD]: ");
        String userChoice = input.nextLine();
        switch (userChoice) {
            case "Rnd" -> departemenRnd();
            case "HRD" -> departemenHRD();
            default -> System.out.println("Invalid Input! \n"+ new Departemen());
        }
    }
    void departemenRnd(){
        System.out.println("1. Operator ");
        System.out.println("2. Programamer ");
        System.out.println("3. System Analisis ");
        System.out.print("pilih posisi Anda [1-3]: ");
        String userChoice = input.nextLine();
        switch (userChoice) {
            case "1" -> DepartemenRnd.operator();
            case "2" -> DepartemenRnd.programer();
            case "3" -> DepartemenRnd.systemAnalys();
            default -> System.out.println("Invalid Input! \n");
        }

    }
    void departemenHRD(){
        System.out.println("1. CDO ");
        System.out.println("2. VPHR ");
        System.out.println("3. CHRO");
        System.out.print("pilih posisi Anda [1-3]: ");
        String userChoice = input.nextLine();
        switch (userChoice) {
            case "1" -> DepartemenHRD.CDO();
            case "2" -> DepartemenHRD.VPHR();
            case "3" -> DepartemenHRD.CHRO();
            default -> System.out.println("Invalid Input! \n");
        }

    }
    static int tunjanganAnakIstri(){
        tunjanganAnakIstri = gajiPokok *10/100;
        return tunjanganAnakIstri;
    }
    static int totalGajiPokok(){
        totalGajiPokok = gajiPokok + gajiTambahan;
        return totalGajiPokok;
    }
    static int pajak(){
        pajak = (totalGajiPokok()+tunjanganAnakIstri())*7/100;
        return pajak;
    }
}
