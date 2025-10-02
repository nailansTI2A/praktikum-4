class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println(nama + " menggonggong: Guk guk!");
    }
}

class Burung extends Hewan {
    public Burung(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println(nama + " berkicau: Cuit cuit!");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Anjing a = new Anjing("Doggy");
        a.makan();
        a.suara();

        Burung b = new Burung("Birdy");
        b.makan();
        b.suara();
    }
}
