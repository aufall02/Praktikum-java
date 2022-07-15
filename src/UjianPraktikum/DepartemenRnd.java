package UjianPraktikum;

public class DepartemenRnd extends Departemen{


  static void operator(){
        gajiTambahan = 1_000_000;
        System.out.println("Kode            : 01");
        System.out.println("gaji pokok      : "+gajiPokok);
        System.out.println("gaji tambahan   : "+gajiTambahan);
        totalGajiPokok();
        System.out.println("Total Gaji pokok : "+totalGajiPokok);
        tunjanganAnakIstri();
        pajak();
        totalGajiPokok();
        gajiBersih = totalGajiPokok-tunjanganAnakIstri-pajak;
        System.out.println("Gaji bersih anda : "+gajiBersih);

    }static void programer(){
        gajiTambahan = 3_000_000;
        System.out.println("Kode            : 02");
        System.out.println("gaji pokok      : "+gajiPokok);
        System.out.println("gaji tambahan   : "+gajiTambahan);
        totalGajiPokok();
        System.out.println("Total Gaji pokok : "+totalGajiPokok);
        tunjanganAnakIstri();
        pajak();
        totalGajiPokok();
        gajiBersih = totalGajiPokok-tunjanganAnakIstri-pajak;
        System.out.println("Gaji bersih anda : "+gajiBersih);

    }
    static void systemAnalys(){
        gajiTambahan = 5_000_000;
        System.out.println("Kode            : 03");
        System.out.println("gaji pokok      : "+gajiPokok);
        System.out.println("gaji tambahan   : "+gajiTambahan);
        totalGajiPokok();
        System.out.println("Total Gaji pokok : "+totalGajiPokok);
        tunjanganAnakIstri();
        pajak();
        totalGajiPokok();
        gajiBersih = totalGajiPokok-tunjanganAnakIstri-pajak;
        System.out.println("Gaji bersih anda : "+gajiBersih);

    }


}
