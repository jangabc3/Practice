public class BankDriver {
    public static void main(String[] args) {

        Person p2 = new Person();

        p2.name = "장준영";
        p2.age = 30;
        p2.cashAmount = 100000;

        BankAccount a2 = new BankAccount();

        a2.balance = 500000;

        p2.account = a2;
        a2.owner = p2;

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));

    }
}

