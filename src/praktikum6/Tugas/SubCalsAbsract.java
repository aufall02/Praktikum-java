package praktikum6.Tugas;
class SubCalsAbsract extends CalcAbsract{

    @Override
    void penambahan(int a, int b) {
        int hasil = a+b;
        System.out.println("hasil dari "+a+" + "+b+" = "+hasil);
    }

    @Override
    void pengurangan(int a, int b) {
        int hasil = a-b;
        System.out.println("hasil dari "+a+" - "+b+" = "+hasil);
    }

    @Override
    void average(double a, double b, double c) {
        double hasil = (a+b+c)/3;
        System.out.println("rata2 dari "+a+", "+b+", "+c+" = "+hasil);

    }
}
