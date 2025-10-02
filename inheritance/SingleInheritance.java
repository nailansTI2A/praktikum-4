class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Kucing k = new Kucing("Kitty");
        k.makan();
        k.suara();
    }
}
