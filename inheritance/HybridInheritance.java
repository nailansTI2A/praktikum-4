class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

interface BisaTerbang {
    void terbang();
}

class Angsa extends Hewan implements BisaTerbang {
    public Angsa(String nama) {
        super(nama);
    }

    public void terbang() {
        System.out.println(nama + " terbang tinggi ke langit.");
    }

    public void suara() {
        System.out.println(nama + " bersuara: Kwek kwek!");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Angsa a = new Angsa("Swanny");
        a.makan();
        a.terbang();
        a.suara();
    }
}
