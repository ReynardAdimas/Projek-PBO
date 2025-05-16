public class LayangLayang implements BangunGeometri{
    protected double diagonalPanjang;
    protected double diagonalPendek;
    protected double sisiPanjang;
    protected double sisiPendek;

    public LayangLayang(double diagonalPanjang, double diagonalPendek, double sisiPanjang, double sisiPendek) {
        this.diagonalPanjang = diagonalPanjang;
        this.diagonalPendek = diagonalPendek;
        this.sisiPanjang = sisiPanjang;
        this.sisiPendek = sisiPendek;
    }



    @Override
    public double hitungLuas() {
        return 0.5 * diagonalPanjang * diagonalPendek;
    }

    @Override
    public double hitungKeliling() {
        return 2*(sisiPanjang+sisiPendek);
    }
}
