package praktikum5.Tugas;

public class Segitiga extends HitungLuas{
    Segitiga(double a,double t){
        super.hasil = a * t / 2;
    }

    @Override
    void tampilkanHasil() {
        System.out.println("Hasil segitiga  : "+super.hasil);
    }
}
