public class Moneytransfer {
    public static void main(String[] args) {
        int balance = 2_000_000_000; // баланс клиентского счета, рубли
        int transfer_amount = 500_000_000; // сумма перевода, рубли
        int report = balance + transfer_amount; // вывод в ежедневный отчет по клиенту, рубли

        System.out.println(report);
    }
}
