package praktikum5.Tugas;

public class HitungLuasApps {
    public static void main(String[] args) {
        HitungLuas lingkarang = new Lingkaran(4);
        lingkarang.tampilkanHasil();
        HitungLuas segitiga=  new Segitiga(5,4);
        segitiga.tampilkanHasil();
        HitungLuas persegiPanjang = new PersegiPanjang(5,5);
        persegiPanjang.tampilkanHasil();
    }
}
