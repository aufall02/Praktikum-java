package UjianPraktikum;

public class DepartemenHRD extends Departemen{
    static void CDO(){
        gajiTambahan = 750_000;
        System.out.println("Kode            : 04");
        System.out.println("gaji pokok      : "+gajiPokok);
        System.out.println("gaji tambahan   : "+gajiTambahan);
        totalGajiPokok();
        System.out.println("Total Gaji pokok : "+totalGajiPokok);
        tunjanganAnakIstri();
        pajak();
        totalGajiPokok();
        gajiBersih = totalGajiPokok-tunjanganAnakIstri-pajak;
        System.out.println("Gaji bersih anda : "+gajiBersih);

    }static void VPHR(){
        gajiTambahan = 2_500_000;
        System.out.println("Kode            : 05");
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
    static void CHRO(){
        gajiTambahan = 4_500_000;
        System.out.println("Kode            : 06");
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
