class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

interface BisaBerenang {
    void berenang();
}

interface BisaTerbang {
    void terbang();
}

class Bebek extends Hewan implements BisaBerenang, BisaTerbang {
    public Bebek(String nama) {
        super(nama);
    }

    public void berenang() {
        System.out.println(nama + " sedang berenang di kolam.");
    }

    public void terbang() {
        System.out.println(nama + " terbang rendah di atas air.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bebek bebek = new Bebek("Donald");
        bebek.makan();
        bebek.berenang();
        bebek.terbang();
    }
}
