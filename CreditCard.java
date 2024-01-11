
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067731 Arpit Gupta)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    // creating attributes for the CrebitCard Class
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    // creating a contructor with eight parameters
    public CreditCard(int cardID, String clientName, String issuerBank, 
    String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        // calling parameters from the super class
        super(balanceAmount, cardID, bankAccount, issuerBank);
        // calling the setter method setClientName(String clientName) from super class
        super.setClientName(clientName);
        // attribute = parameter (assigning parameter values to the attribute)
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    // method to set the creditLimit if it is 2.5 times less than or equal to balanceAmount
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        double balance = super.getBalanceAmount();
        if(creditLimit <= (2.5 * balance)) {
            this.isGranted = true;
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
        }
        else {
            System.out.println("The credit can not be issued");
            this.isGranted = false;
        }
    }
    
    // getter/accessor method to return the value of cvcNumber
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    
    // getter/accessor method to return the value of creditLimit
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    // getter/accessor method to return the value of interestRate
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    // getter/accessor method to return the value of expirationDate
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    // getter/accessor method to return the value of gracePeriod
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    // getter/accessor method to return the value of isGranted
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    // method to cancel the creditCard
    public void cancelCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    // display method to check if the credit has been granted or not and display all the details according to the condition
    public void display()
    {
        if(this.isGranted) {
            super.display(); // calls the display method form super class
            System.out.println("CVC Number: " + this.cvcNumber);
            System.out.println("Interest Rate: " + this.interestRate);
            System.out.println("Expiration Date: " + this.expirationDate);
            System.out.println("Credit Granted: " + this.isGranted);
            System.out.println("Credit Limit: " + this.creditLimit);
            System.out.println("Grace Period: " + this.gracePeriod);
        }
        else {
            super.display(); // calls the display method form super class
            System.out.println("CVC Number: " + this.cvcNumber);
            System.out.println("Interest Rate: " + this.interestRate);
            System.out.println("Expiration Date: " + this.expirationDate);
            System.out.println("Credit Granted: " + this.isGranted);
        }
    }
}
