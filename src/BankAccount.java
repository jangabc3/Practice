public class BankAccount {

    private int balance;
    private Person owner;

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public int getBalance() {
        return balance;

    }

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }


    boolean deposit(int amount) {

        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. " + "잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }

        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);


        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }

    boolean withdraw(int amount) {

        if (amount < 0 || balance < amount) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }

        balance -= amount;
        owner.setCashAmount(owner.getCashAmount() + amount);


        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;

    }

    // 추가
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {

        if (amount < 0 || balance < amount) {
            System.out.println("false - from: " + owner.getName()
                    + ", to: " + to.getOwner().getName()
                    + ", amount: " + amount
                    + ", balance: " + balance);
            return false;
        }

        balance -= amount;
        to.balance += amount;

        System.out.println("true - from: " + owner.getName()
                + ", to: " + to.getOwner().getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return true;
    }


}

