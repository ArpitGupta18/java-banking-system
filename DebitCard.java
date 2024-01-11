
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067731 Arpit Gupta)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    // creating attributes for the DebitCard Class
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    // creating a contructor with six parameters
    public DebitCard(double balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        // calling parameters from the super class
        super(balanceAmount, cardID, bankAccount, issuerBank);
        // calling the setter method setClientName(String clientName) from super class
        super.setClientName(clientName);
        // attribute = parameter (assigning parameter values to the attribute)
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;       
    }
    
    // setter/mutator method to modify the withdrawalAmount
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    // method to withdraw the amount if the pinNumber matches and the withdrawal amount doesn't exceed the amount in balanceAmount
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    {
        double newBalanceAmount = getBalanceAmount();
        this.withdrawalAmount = withdrawalAmount;
        this.dateOfWithdrawal = dateOfWithdrawal;
        if(this.pinNumber == pinNumber && this.withdrawalAmount < newBalanceAmount) {
            System.out.println(this.withdrawalAmount + " has been withdrawn");
            newBalanceAmount = newBalanceAmount - this.withdrawalAmount;
            this.hasWithdrawn = true;
            super.setBalanceAmount(newBalanceAmount); // sets the newBalanceamount after withdrawal to the balanceAmount in super class
        } 
        else if(this.pinNumber != pinNumber) {
            System.out.println("You have entered the wrong PIN number");
            this.withdrawalAmount = 0;
        }
        else {
            System.out.println("Not sufficient amount in your account");
            this.withdrawalAmount = 0;
        }
    }
    
    // getter/accessor method to return the value of pinNumber
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    
    // getter/accessor method to return the value of withdrawalAmount
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    
    // getter/accessor method to return the value of dateOfWithdrawal
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    
    // getter/accessor method to return the value of getHasWithdrawn
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    
    // display method to check if the amount has been withdrawn or not and display all the details 
    public void display()
    {
        if(this.hasWithdrawn) {
            super.display(); // calls the display method form super class
            System.out.println("Pin Number: " + this.pinNumber);
            System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
            System.out.println("Date Of Withdrawal: " + this.dateOfWithdrawal);
            
        }
        else {
            System.out.println("Balance Amount: " + super.getBalanceAmount());
        }    
    }
}
