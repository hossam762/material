// derived class
class SpecialAccount extends Account {
    public SpecialAccount(int acc_num, float bal) {
        super(acc_num, bal);
    }
    public void withdraw(int number) {
        if (getBalance() - number >= -1000) {
            setBalance(getBalance()-number);
            System.out.println("balance is equal: " + getBalance());
            System.out.println("process has succeeded");
        } else {
            System.out.println("process has cancelled");
        }
    }
}