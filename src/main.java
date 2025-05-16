import Bangun2D.Segitiga;
import Bangun3D.LimasSegitiga;

public class main {
    public static void main(String[] args) {
        System.out.println("=== Hitung Bangun Geometri ===");
        System.out.println();

        // Bangun2D.Segitiga
        Segitiga segitiga = new Segitiga(6,4,5,5,6);
        System.out.println("Bangun2D.Segitiga");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());

        LimasSegitiga limas = new LimasSegitiga(6,4,5,5,6,8, 7, 8, 9);
        System.out.println("\nLimas Bangun2D.Segitiga");
        System.out.println("Luas: " + limas.hitungLuas());
        System.out.println("Keliling: " + limas.hitungKeliling());
        System.out.println("Volume: " + limas.hitungVolume());
        System.out.println("Luas Permukaan: " + limas.hitungLuasPermukaan());
    }
}
