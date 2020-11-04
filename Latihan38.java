/**
 * Latihan38
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Perhitungan Lingkaran
 */
class Lingkaran {
    double jari;
    double luas;
    double keliling;
    
    public double jari2Lingkaran(double diameter){
        jari = diameter / 2;
        return jari;
           }
    public double luasLingkaran(double r){
        luas = Math.PI * r * r;
        return luas;
    }
    public double kelilingLingkaran(double r){
        luas = 2*Math.PI * r;
        return luas;
    }
}
