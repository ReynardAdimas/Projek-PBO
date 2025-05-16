public class LimasSegitiga extends Segitiga{
    private double tinggiLimas;

    public LimasSegitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC, double tinggiLimas) {
        super(alas, tinggi, sisiA, sisiB, sisiC);
        this.tinggiLimas = tinggiLimas;
    }

    // getter
    public double getTinggiLimas() {
        return tinggiLimas;
    }

    // setter
    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        return (1.0/3.0) * hitungLuas() * tinggiLimas;
    }
}
