class RumusKinematika {
    void tampilRumus() {
        System.out.println("Rumus-rumus Kinematika:");
        System.out.println("1. Jarak tempuh (s) = v0.t + 1/2.a.t²");
        System.out.println("2. Kecepatan akhir (v) = v0 + a.t");
        System.out.println("3. Kecepatan rata-rata (v) = (v0 + v1)/2");
        System.out.println("4. Percepatan (a) = (v1 - v0)/t");
    }
}

class RumusGaya {
    void tampilRumus() {
        System.out.println("\nRumus-rumus Gaya:");
        System.out.println("1. Gaya (F) = m.a");
        System.out.println("2. Berat (W) = m.g");
        System.out.println("3. Gaya gesek (f) = μ.N");
        System.out.println("4. Gaya pegas (F) = k.x");
    }
}

class RumusEnergi {
    void tampilRumus() {
        System.out.println("\nRumus-rumus Energi:");
        System.out.println("1. Energi kinetik (Ek) = 1/2.m.v²");
        System.out.println("2. Energi potensial gravitasi (Ep) = m.g.h");
        System.out.println("3. Energi potensial pegas (Ep) = 1/2.k.x²");
        System.out.println("4. Energi mekanik (Em) = Ek + Ep");
    }
}

class RumusUsaha {
    void tampilRumus() {
        System.out.println("\nRumus-rumus Usaha:");
        System.out.println("1. Usaha (W) = F.s.cos θ");
        System.out.println("2. Daya (P) = W/t");
        System.out.println("3. Usaha oleh gaya pegas (W) = 1/2.k.x²");
        System.out.println("4. Efisiensi (η) = (Woutput/Winput) × 100%");
    }
}

class RumusMomentum {
    void tampilRumus() {
        System.out.println("\nRumus-rumus Momentum:");
        System.out.println("1. Momentum (p) = m.v");
        System.out.println("2. Impuls (I) = F.Δt");
        System.out.println("3. Hukum Kekekalan Momentum: m1.v1 + m2.v2 = m1.v1' + m2.v2'");
        System.out.println("4. Koefisien restitusi (e) = -(v2' - v1')/(v2 - v1)");
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("=== Kumpulan Rumus Fisika ===");
        System.out.println("Keterangan:");
        System.out.println("v0 = kecepatan awal          m = massa");
        System.out.println("v1 = kecepatan akhir         g = percepatan gravitasi");
        System.out.println("a = percepatan               h = ketinggian");
        System.out.println("t = waktu                    k = konstanta pegas");
        System.out.println("s = jarak                    x = pertambahan panjang");
        System.out.println("F = gaya                     μ = koefisien gesek");
        System.out.println("N = gaya normal              θ = sudut\n");

        RumusKinematika kinematika = new RumusKinematika();
        RumusGaya gaya = new RumusGaya();
        RumusEnergi energi = new RumusEnergi();
        RumusUsaha usaha = new RumusUsaha();
        RumusMomentum momentum = new RumusMomentum();

        kinematika.tampilRumus();
        gaya.tampilRumus();
        energi.tampilRumus();
        usaha.tampilRumus();
        momentum.tampilRumus();
    }
}
