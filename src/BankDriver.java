public class BankDriver {
    public static void main(String[] args) {

        Person p2 = new Person();

        p2.setName("장준영");
        p2.setAge(30);
        p2.setCashAmount(100000);


        BankAccount a2 = new BankAccount();

        a2.setBalance(500000);
        p2.setAccount(a2);
        a2.SetOwner(p2);


        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(620000));
        System.out.println(a2.withdraw(890000));

    }
}

