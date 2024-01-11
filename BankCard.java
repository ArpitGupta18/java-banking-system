
/**
 * Write a description of class BankCard here.
 *
 * @author (22067731 Arpit Gupta)
 * @version (1.0.0)
 */
public class BankCard
{
    // creating attributes for the BankCard Class
    private int cardID;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    // creating a contructor with four parameters
    public BankCard(double balanceAmount, int cardID, String bankAccount, String issuerBank)
    {
        // attribute = parameter (assigning parameter values to the attribute)
        this.balanceAmount = balanceAmount;
        this.cardID = cardID;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";
    }
    
    // setter/mutator method to modify the clientName 
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    
    // setter/mutator method to modify the balanceAmount
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    
    // getter/accessor method to return the value of clientName
    public String getClientName()
    {
        return this.clientName;
    }
    
    // getter/accessor method to return the value of balanceAmount
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    // getter/accessor method to return the value of cardID
    public int getCardID()
    {
        return this.cardID;
    }
    
    // getter/accessor method to return the value of issuerBank
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    // getter/accessor method to return the value of bankAccount
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    // display method to display the details of this class
    public void display()
    {
        if(this.clientName == "") {
            System.out.println("The client name has not been assigned!!");
        }
        else {
            System.out.println("Client Name: " + this.clientName);
        }
        System.out.println("CardID: " + this.cardID);
        System.out.println("Issuer Bank: " + this.issuerBank);
        System.out.println("Bank Account: " + this.bankAccount);
        System.out.println("Balance Amount: " + this.balanceAmount); 
    }
}
