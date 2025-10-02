public class AkunBank {
    private int saldo;

    // Konstruktor
    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    // Setter saldo
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    // Getter saldo
    public int getSaldo() {
        return saldo;
    }

    // Metode tarik tunai
    public void tarikTunai(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk menarik " + jumlah);
        }
    }
}
