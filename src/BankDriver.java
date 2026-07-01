public class BankDriver {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("문종모");
        p1.setAge(30);
        p1.setCashAmount(0);

        Person p2 = new Person();
        p2.setName("김신의");
        p2.setAge(28);
        p2.setCashAmount(0);

        BankAccount a1 = new BankAccount();
        a1.setOwner(p1);
        a1.setBalance(500000);

        BankAccount a2 = new BankAccount();
        a2.setOwner(p2);
        a2.setBalance(0);

        p1.setAccount(a1);
        p2.setAccount(a2);

        p1.transfer(p2, 200000);
        p2.transfer(p1, 150000);
        p1.transfer(p2, 270000);
        p2.transfer(p1, 130000);
    }
}

