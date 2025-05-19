public class mainBank{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Ajwad", 1000);
        // Account1 creates with a name of Ajwad and a balance of 1000
        account1.withdraw(1500);
      

        System.out.println("Final balance for" + account1.getOwnerName() + "AMount" + account1.getBalance());
    }
}