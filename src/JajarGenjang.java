public class JajarGenjang implements BangunGeometri{
    protected double sisiMiring;
    protected double alas;
    protected double tinggi;

    public JajarGenjang(double sisiMiring, double alas, double tinggi) {
        this.sisiMiring = sisiMiring;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas(){
        return alas*tinggi;
    }

    @Override
    public double hitungKeliling(){
        return 2*(sisiMiring+alas);
    }
}
