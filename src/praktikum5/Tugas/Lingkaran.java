package praktikum5.Tugas;

public class Lingkaran extends HitungLuas{
    Lingkaran(double r){
        super.hasil = 3.14 * r * r;
    }

    @Override
    void tampilkanHasil() {
        System.out.println("Hasil lingkaran : "+super.hasil);
    }
}
