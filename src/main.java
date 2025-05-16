public class main {
    public static void main(String[] args) {
        System.out.println("=== Hitung Bangun Geometri ===");
        System.out.println();

        // Segitiga
        Segitiga segitiga = new Segitiga(6,4,5,5,6);
        System.out.println("Segitiga");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());

        LimasSegitiga limas = new LimasSegitiga(6,4,5,5,6,8);
        System.out.println("\nLimas Segitiga");
        System.out.println("Luas: " + limas.hitungLuas());
        System.out.println("Keliling: " + limas.hitungKeliling());
        System.out.println("Volume: " + limas.hitungVolume());
    }
}
