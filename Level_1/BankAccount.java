class Bank{
      //Data memeber
      private static String bankName="State Bank Of India";
      private static int totalNumberOfAccount=0;
      private static String bankHolderName;
      private final long accountNumber;
      
      //Constructor
      Bank(String bankHolderName,long accountNumber){
         this.bankHolderName=bankHolderName;
         this.accountNumber=accountNumber;
         totalNumberOfAccount++;
      }
      
      public int getTotalNumberOfAccount(){
         return totalNumberOfAccount;
      }

      public void displayInstanceOf(){
          if(this instanceof Bank){
             System.out.println("Bank Holder Name is :"+bankHolderName);
             System.out.println("Account Number is :"+accountNumber);
          }else{
             System.out.println("This object is not an instanceof Bank:");
          }
      }
}

public class BankAccount{
       public static void main(String args[]){
         Bank user1=new Bank("Puspendra Jaiswal",564327);
         user1.displayInstanceOf();
         System.out.println("Total Number of Accounts is :"+user1.getTotalNumberOfAccount());

         Bank user2=new Bank("Sonu Jaiswal",564356);
         user2.displayInstanceOf();
         System.out.println("Total Number of Accounts is :"+user2.getTotalNumberOfAccount());

         Bank user3=new Bank("Monu Jaiswal",564357);
         user3.displayInstanceOf();
         System.out.println("Total Number of Accounts is :"+user3.getTotalNumberOfAccount());
       }
}