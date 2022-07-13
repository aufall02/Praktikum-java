package praktikum5.Tugas;

public class PersegiPanjang extends HitungLuas{
    PersegiPanjang(double a,double t){
        super.hasil = a * t;
    }

    @Override
    void tampilkanHasil() {
        System.out.println("Hasil Segitiga  : "+super.hasil);
    }
}
