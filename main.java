public class main {
    public static void main(String[] args){
        Account acc=new Account(20190,1000);
        SpecialAccount Special=new SpecialAccount(22038,250);
        System.out.println("balance= "+ acc.getBalance() + " " + "account number= " + acc.getAccount_number() );
        System.out.println("special balance= "+ Special.getBalance() + " " + "special account number= " + Special.getAccount_number() );
        acc.setAccount_number(566);
        Special.setAccount_number(6432);
        acc.setBalance(1001);
        Special.setBalance(2345);
        System.out.println("balance= "+ acc.getBalance() + " " + "account number= " + acc.getAccount_number() );
        System.out.println("special balance= "+ Special.getBalance() + " " + "special account number= " + Special.getAccount_number() );
        System.out.println(acc.toString());
        System.out.println(Special.toString());
    }
}
