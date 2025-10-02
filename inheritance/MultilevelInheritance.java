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

class Persia extends Kucing {
    public Persia(String nama) {
        super(nama);
    }

    public void jenis() {
        System.out.println(nama + " adalah kucing Persia.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Persia p = new Persia("Cleo");
        p.makan();
        p.suara();
        p.jenis();
    }
}
