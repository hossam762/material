public class Account {
    private float balance;
    private int account_number;
    public Account(){}
    public Account( int acc_num, float bal){
        account_number=acc_num;
        balance=bal;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public int getAccount_number() {
        return account_number;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", accountNumber=" + account_number +'}';
    }
    public void  withdraw(int num) {
        if (balance>=num)
        {
            balance=balance-num;
            System.out.println("balance is equal: "+balance);
            System.out.println("process has succeeded");
        }
        else{
            System.out.println("process has cancelled");
        }
    }
    public void deposit(int n) {
        balance=balance+n;
        System.out.println("balance is equal: "+balance);
    }
}
