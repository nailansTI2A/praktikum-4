public class AkunBankTest {
    public static void main(String[] args) {
        // buat objek akun bank
        AkunBank akun1 = new AkunBank(0);
        AkunBank akun2 = new AkunBank(50);
        AkunBank akun3 = new AkunBank(100);

        // set saldo dan tampilkan
        akun1.setSaldo(20);
        System.out.println("Saldo akun1 : " + akun1.getSaldo());

        akun2.setSaldo(30);
        System.out.println("Saldo akun2 : " + akun2.getSaldo());

        akun3.setSaldo(80);
        System.out.println("Saldo akun3 : " + akun3.getSaldo());

        // uji tarik tunai
        akun3.tarikTunai(50);
        System.out.println("Saldo akun3 setelah tarik tunai: " + akun3.getSaldo());

        akun3.tarikTunai(100); // gagal karena saldo tidak cukup
    }
}
