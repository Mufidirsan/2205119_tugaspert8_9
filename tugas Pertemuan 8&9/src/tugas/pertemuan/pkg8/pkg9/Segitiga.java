package tugas.pertemuan.pkg8.pkg9;

public class Segitiga extends Geometri {
    private double sisi1;
    private double sisi2;
    private double sisi3;
  
    Segitiga (){
        sisi1 = sisi2 = sisi3 = 1.0;
    }

    public Segitiga (double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public double getLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 +
                " sisi3 = " + sisi3;
    }
}
