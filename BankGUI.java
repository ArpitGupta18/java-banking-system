
/**
 * Write a description of class BankGUI here.
 *
 * @author (22067731 Arpit Gupta)
 * @version (1.0.0)
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    // creating JComponents for the GUI
    
    private JFrame frame;
    
    private JLabel 
    formLabel,
    addDebitCardLabel,
    cardIdForAddDebitCardLabel,
    clientNameForAddDebitCardLabel,
    bankAccountForAddDebitCardLabel,
    balanceAmountForAddDebitCardLabel,
    pinNumberForAddDebitCardLabel,
    issuerBankForAddDebitCardLabel,
    withdrawDebitCardLabel,
    cardIdForWithdrawDebitCardLabel,
    withdrawalAmountLabel,
    pinNumberForWithdrawDebitCardLabel,
    dateOfWithdrawalLabel,
    addCreditCardLabel,
    cardIdForAddCreditCardLabel,
    clientNameForAddCreditCardLabel,
    bankAccountForAddCreditCardLabel,
    issuerBankForAddCreditCardLabel,
    balanceAmountForAddCreditCardLabel,
    cvcNumberLabel,
    interestRateLabel,
    expirationDateLabel,
    setCreditCardLabel,
    cardIdForSetCreditLimitLabel,
    creditLimitLabel,
    gracePeriodLabel,
    cancelCreditCardLabel,
    cardIdForCancelCreditLimitLabel;
    
    private JTextField 
    cardIdForAddDebitCardTextField,
    clientNameForAddDebitCardTextField,
    bankAccountForAddDebitCardTextField,
    balanceAmountForAddDebitCardTextField,
    pinNumberForAddDebitCardTextField,
    issuerBankForAddDebitCardTextField,
    cardIdForWithdrawDebitCardTextField,
    withdrawalAmountTextField,
    pinNumberForWithdrawDebitCardTextField,
    cardIdForAddCreditCardTextField,
    clientNameForAddCreditCardTextField,
    bankAccountForAddCreditCardTextField,
    issuerBankForAddCreditCardTextField,
    balanceAmountForAddCreditCardTextField,
    cvcNumberTextField,
    interestRateTextField,
    cardIdForSetCreditLimitTextField,
    creditLimitTextField,
    gracePeriodTextField,
    cardIdForCancelCreditCardTextField;
    
    private JComboBox 
    expirationDayCombo,
    expirationMonthCombo,
    expirationYearCombo,
    withdrawalDayCombo,
    withdrawalMonthCombo,
    withdrawalYearCombo;
    
    private JButton 
    addDebitCardButton,
    withdrawDebitCardButton,
    addCreditCardButton,
    setCreditLimitButton,
    cancelCreditCardButton,
    debitCardDisplayButton,
    creditCardDisplayButton,
    clearButton;
    
    private JSeparator verticalSeparator, horizontalSeparator;
    
    // Creating an ArrayList of BankCard
    private ArrayList <BankCard> cards;
    
    // Creating an object name of DebitCard
    private DebitCard debitObject;
    // Creating an object name of CreditCard
    private CreditCard creditObject;
    
    public BankGUI(){
        cards = new ArrayList <BankCard>();
        // setting the title of the frame
        frame = new JFrame("BankGUI");
        
        // Label for the form Heading
        formLabel = new JLabel("Bank Credentials Form");
        formLabel.setBounds(637, 20, 300, 34);
        formLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
        formLabel.setForeground(Color.decode("#004040"));
        frame.add(formLabel);
        
        // Label for the heading of Add Debit Card
        addDebitCardLabel = new JLabel("Enter the details below to add Debit Card");
        addDebitCardLabel.setBounds(60, 87, 400, 28);
        addDebitCardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        addDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(addDebitCardLabel);
        
        // Label for Card ID of Debit Card
        cardIdForAddDebitCardLabel = new JLabel("Card ID: ");
        cardIdForAddDebitCardLabel.setBounds(60, 138, 200, 28);
        cardIdForAddDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        cardIdForAddDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(cardIdForAddDebitCardLabel);
        
        // Label for Client Name of Debit Card
        clientNameForAddDebitCardLabel = new JLabel("Client Name: ");
        clientNameForAddDebitCardLabel.setBounds(60, 183, 200, 28);
        clientNameForAddDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        clientNameForAddDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(clientNameForAddDebitCardLabel);
        
        // Label for Bank Account of Debit Card
        bankAccountForAddDebitCardLabel = new JLabel("Bank Account: ");
        bankAccountForAddDebitCardLabel.setBounds(60, 228, 200, 28);
        bankAccountForAddDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bankAccountForAddDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(bankAccountForAddDebitCardLabel);
        
        // Label for Balance Amount of Debit Card
        balanceAmountForAddDebitCardLabel = new JLabel("Balance Amount: ");
        balanceAmountForAddDebitCardLabel.setBounds(60, 273, 200, 28);
        balanceAmountForAddDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        balanceAmountForAddDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(balanceAmountForAddDebitCardLabel);
        
        // Label for PIN Number of Debit Card
        pinNumberForAddDebitCardLabel = new JLabel("PIN Number: ");
        pinNumberForAddDebitCardLabel.setBounds(60, 317, 200, 28);
        pinNumberForAddDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        pinNumberForAddDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(pinNumberForAddDebitCardLabel);
        
        // Label for Issuer Bank of Debit Card
        issuerBankForAddDebitCardLabel = new JLabel("Issuer Bank: ");
        issuerBankForAddDebitCardLabel.setBounds(60, 361, 200, 28);
        issuerBankForAddDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        issuerBankForAddDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(issuerBankForAddDebitCardLabel);
        
        // Label for the heading of Withdraw from debit card
        withdrawDebitCardLabel = new JLabel("Enter the details below to withdraw from debit card");
        withdrawDebitCardLabel.setBounds(60, 485, 510, 28);
        withdrawDebitCardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        withdrawDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(withdrawDebitCardLabel);
        
        // Label for Card ID of Withdraw
        cardIdForWithdrawDebitCardLabel = new JLabel("Card ID: ");
        cardIdForWithdrawDebitCardLabel.setBounds(60, 536, 200, 28);
        cardIdForWithdrawDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        cardIdForWithdrawDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(cardIdForWithdrawDebitCardLabel);
        
        // Label for Withdrawal Amount of withdraw
        withdrawalAmountLabel = new JLabel("Withdrawal Amount: ");
        withdrawalAmountLabel.setBounds(60, 581, 200, 28);
        withdrawalAmountLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        withdrawalAmountLabel.setForeground(Color.decode("#004040"));
        frame.add(withdrawalAmountLabel);
        
        // Label for PIN Number of withdraw
        pinNumberForWithdrawDebitCardLabel = new JLabel("PIN Number: ");
        pinNumberForWithdrawDebitCardLabel.setBounds(60, 626, 200, 28);
        pinNumberForWithdrawDebitCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        pinNumberForWithdrawDebitCardLabel.setForeground(Color.decode("#004040"));
        frame.add(pinNumberForWithdrawDebitCardLabel);
        
        // Label for Date of Withdrawal of withdraw
        dateOfWithdrawalLabel = new JLabel("Date of Withdrawal: ");
        dateOfWithdrawalLabel.setBounds(60, 671, 200, 28);
        dateOfWithdrawalLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        dateOfWithdrawalLabel.setForeground(Color.decode("#004040"));
        frame.add(dateOfWithdrawalLabel);
        
        // Label for the heading of add credit card
        addCreditCardLabel = new JLabel("Enter the details below to add Credit Card");
        addCreditCardLabel.setBounds(600, 87, 450, 28);
        addCreditCardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        addCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(addCreditCardLabel);
        
        // Label for Card ID of add credit card
        cardIdForAddCreditCardLabel = new JLabel("Card ID: ");
        cardIdForAddCreditCardLabel.setBounds(600, 138, 155, 28);
        cardIdForAddCreditCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        cardIdForAddCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(cardIdForAddCreditCardLabel);
        
        // Label for Client Name of add credit card
        clientNameForAddCreditCardLabel = new JLabel("Client Name: ");
        clientNameForAddCreditCardLabel.setBounds(600, 183, 155, 28);
        clientNameForAddCreditCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        clientNameForAddCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(clientNameForAddCreditCardLabel);
        
        // Label for Bank Account of add credit card
        bankAccountForAddCreditCardLabel = new JLabel("Bank Account: ");
        bankAccountForAddCreditCardLabel.setBounds(600, 228, 155, 28);
        bankAccountForAddCreditCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bankAccountForAddCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(bankAccountForAddCreditCardLabel);
        
        // Label for Issuer Bank of add credit card
        issuerBankForAddCreditCardLabel = new JLabel("Issuer Bank: ");
        issuerBankForAddCreditCardLabel.setBounds(600, 273, 155, 28);
        issuerBankForAddCreditCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        issuerBankForAddCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(issuerBankForAddCreditCardLabel);
        
        // Label for Balance Amount of add credit card
        balanceAmountForAddCreditCardLabel = new JLabel("Balance Amount: ");
        balanceAmountForAddCreditCardLabel.setBounds(1080, 138, 170, 28);
        balanceAmountForAddCreditCardLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        balanceAmountForAddCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(balanceAmountForAddCreditCardLabel);
        
        // Label for CVC Number of add credit card
        cvcNumberLabel = new JLabel("CVC Number: ");
        cvcNumberLabel.setBounds(1080, 183, 170, 28);
        cvcNumberLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        cvcNumberLabel.setForeground(Color.decode("#004040"));
        frame.add(cvcNumberLabel);
        
        // Label for Interest Rate of add credit card
        interestRateLabel = new JLabel("Interest Rate: ");
        interestRateLabel.setBounds(1080, 228, 170, 28);
        interestRateLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        interestRateLabel.setForeground(Color.decode("#004040"));
        frame.add(interestRateLabel);
        
        // Label for Expiration Date of add credit card
        expirationDateLabel = new JLabel("Expiration Date: ");
        expirationDateLabel.setBounds(1080, 273, 170, 28);
        expirationDateLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        expirationDateLabel.setForeground(Color.decode("#004040"));
        frame.add(expirationDateLabel);
        
        // Label for the heading of set credit limit
        setCreditCardLabel = new JLabel("Enter the details below to set the Credit Limit");
        setCreditCardLabel.setBounds(600, 411, 450, 28);
        setCreditCardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        setCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(setCreditCardLabel);
        
        // Label for Card ID of set credit limit
        cardIdForSetCreditLimitLabel = new JLabel("Card ID: ");
        cardIdForSetCreditLimitLabel.setBounds(600, 461, 155, 28);
        cardIdForSetCreditLimitLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        cardIdForSetCreditLimitLabel.setForeground(Color.decode("#004040"));
        frame.add(cardIdForSetCreditLimitLabel);
        
        // Label for Credit Limit for set credit limit
        creditLimitLabel = new JLabel("Credit Limit: ");
        creditLimitLabel.setBounds(600, 506, 155, 28);
        creditLimitLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        creditLimitLabel.setForeground(Color.decode("#004040"));
        frame.add(creditLimitLabel);
        
        // Label for Grace Period for set credit limit
        gracePeriodLabel = new JLabel("Grace Period: ");
        gracePeriodLabel.setBounds(600, 551, 155, 28);
        gracePeriodLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        gracePeriodLabel.setForeground(Color.decode("#004040"));
        frame.add(gracePeriodLabel);
        
        // Label for the heading of cancel credit card
        cancelCreditCardLabel = new JLabel("Enter the details below to cancel Credit Card");
        cancelCreditCardLabel.setBounds(1080, 411, 440, 28);
        cancelCreditCardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        cancelCreditCardLabel.setForeground(Color.decode("#004040"));
        frame.add(cancelCreditCardLabel);
        
        // Label for Card Id of cancel credit card
        cardIdForCancelCreditLimitLabel = new JLabel("Card ID: ");
        cardIdForCancelCreditLimitLabel.setBounds(1080, 461, 155, 28);
        cardIdForCancelCreditLimitLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        cardIdForCancelCreditLimitLabel.setForeground(Color.decode("#004040"));
        frame.add(cardIdForCancelCreditLimitLabel);
        
        // Text Field for Card ID of add debit card 
        cardIdForAddDebitCardTextField = new JTextField();
        cardIdForAddDebitCardTextField.setBounds(273, 134, 226, 32);
        cardIdForAddDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(cardIdForAddDebitCardTextField);
        
        // Text Field for Client Name of add debit card
        clientNameForAddDebitCardTextField = new JTextField();
        clientNameForAddDebitCardTextField.setBounds(273, 179, 226, 32);
        clientNameForAddDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(clientNameForAddDebitCardTextField);     
        
        // Text Field for Bank Account of add debit card
        bankAccountForAddDebitCardTextField = new JTextField();
        bankAccountForAddDebitCardTextField.setBounds(273, 224, 226, 32);
        bankAccountForAddDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(bankAccountForAddDebitCardTextField);
        
        // Text Field for Balance Amount of add debit card
        balanceAmountForAddDebitCardTextField = new JTextField();
        balanceAmountForAddDebitCardTextField.setBounds(273, 269, 226, 32);
        balanceAmountForAddDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(balanceAmountForAddDebitCardTextField);

        // Text Field for PIN Number of add debit card
        pinNumberForAddDebitCardTextField = new JTextField();
        pinNumberForAddDebitCardTextField.setBounds(273, 313, 226, 32);
        pinNumberForAddDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(pinNumberForAddDebitCardTextField);

        // Text Field for Issuer Bank of add debit card
        issuerBankForAddDebitCardTextField = new JTextField();
        issuerBankForAddDebitCardTextField.setBounds(273, 357, 226, 32);
        issuerBankForAddDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(issuerBankForAddDebitCardTextField);
        
        // Text Field for Card ID of withdraw
        cardIdForWithdrawDebitCardTextField = new JTextField();
        cardIdForWithdrawDebitCardTextField.setBounds(273, 532, 226, 32);
        cardIdForWithdrawDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(cardIdForWithdrawDebitCardTextField);
        
        // Text Field for Withdrawal Amount of withdraw
        withdrawalAmountTextField = new JTextField();
        withdrawalAmountTextField.setBounds(273, 577, 226, 32);
        withdrawalAmountTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(withdrawalAmountTextField);
        
        // Text Field for PIN Number of withdraw
        pinNumberForWithdrawDebitCardTextField = new JTextField();
        pinNumberForWithdrawDebitCardTextField.setBounds(273, 622, 226, 32);
        pinNumberForWithdrawDebitCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(pinNumberForWithdrawDebitCardTextField);
        
        // Text Field for Card ID of add credit card
        cardIdForAddCreditCardTextField = new JTextField();
        cardIdForAddCreditCardTextField.setBounds(774, 134, 226, 32);
        cardIdForAddCreditCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(cardIdForAddCreditCardTextField);
        
        // Text Field for Client Name of add credit card
        clientNameForAddCreditCardTextField = new JTextField();
        clientNameForAddCreditCardTextField.setBounds(774, 179, 226, 32);
        clientNameForAddCreditCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(clientNameForAddCreditCardTextField);
        
        // Text Field for Bank Account of add credit card
        bankAccountForAddCreditCardTextField = new JTextField();
        bankAccountForAddCreditCardTextField.setBounds(774, 224, 226, 32);
        bankAccountForAddCreditCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(bankAccountForAddCreditCardTextField);
        
        // Text Field for Issuer Bank of add credit card
        issuerBankForAddCreditCardTextField = new JTextField();
        issuerBankForAddCreditCardTextField.setBounds(774, 269, 226, 32);
        issuerBankForAddCreditCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(issuerBankForAddCreditCardTextField);
        
        // Text Field for Balance Amount of add credit card
        balanceAmountForAddCreditCardTextField = new JTextField();
        balanceAmountForAddCreditCardTextField.setBounds(1254, 134, 226, 32);
        balanceAmountForAddCreditCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(balanceAmountForAddCreditCardTextField);
        
        // Text Field for CVC Number of add credit card
        cvcNumberTextField = new JTextField();
        cvcNumberTextField.setBounds(1254, 179, 226, 32);
        cvcNumberTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(cvcNumberTextField);
        
        // Text Field for Interest Rate of add credit card 
        interestRateTextField = new JTextField();
        interestRateTextField.setBounds(1254, 224, 226, 32);
        interestRateTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(interestRateTextField);
        
        // Text Field for Card ID of set credit limit
        cardIdForSetCreditLimitTextField = new JTextField();
        cardIdForSetCreditLimitTextField.setBounds(774, 457, 226, 32);
        cardIdForSetCreditLimitTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(cardIdForSetCreditLimitTextField);
        
        // Text Field for Credit Limit of set credit limit
        creditLimitTextField = new JTextField();
        creditLimitTextField.setBounds(774, 502, 226, 32);
        creditLimitTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(creditLimitTextField);

        // Text Field for Grace Period of set credit limit
        gracePeriodTextField = new JTextField();
        gracePeriodTextField.setBounds(774, 547, 226, 32);
        gracePeriodTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(gracePeriodTextField);
        
        // Text Field for Card ID of cancel credit card
        cardIdForCancelCreditCardTextField = new JTextField();
        cardIdForCancelCreditCardTextField.setBounds(1254, 457, 226, 32);
        cardIdForCancelCreditCardTextField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        frame.add(cardIdForCancelCreditCardTextField);
        
        // Creating list of String and adding values into it
        String[] days = {"1","2","3","4","5","6","7","8","9", "10", "11","12","13","14","15","16","17","18","19","20","21","22","23","24",
            "25","26","27","28","29","30","31"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] years = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", 
            "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
        
        // Combo Box for Expiration Day
        expirationDayCombo = new JComboBox(days);
        expirationDayCombo.setBounds(1254, 269, 66, 32);
        expirationDayCombo.setFont(new Font("Helvetica", Font.PLAIN, 17));
        frame.add(expirationDayCombo);
        
        // Combo Box for Withdrawal Day
        withdrawalDayCombo = new JComboBox(days);
        withdrawalDayCombo.setBounds(273, 667, 66, 32);
        withdrawalDayCombo.setFont(new Font("Helvetica", Font.PLAIN, 17));
        frame.add(withdrawalDayCombo);
        
        // Combo Box for Expiration Month
        expirationMonthCombo = new JComboBox(months);
        expirationMonthCombo.setBounds(1334, 269, 66, 32);
        expirationMonthCombo.setFont(new Font("Helvetica", Font.PLAIN, 17));
        frame.add(expirationMonthCombo);
        
        // Combo Box for Withdrawal Month
        withdrawalMonthCombo = new JComboBox(months);
        withdrawalMonthCombo.setBounds(353, 667, 66, 32);
        withdrawalMonthCombo.setFont(new Font("Helvetica", Font.PLAIN, 17));
        frame.add(withdrawalMonthCombo);
        
        // Combo Box for Expiration Year
        expirationYearCombo = new JComboBox(years);
        expirationYearCombo.setBounds(1414, 269, 66, 32);
        expirationYearCombo.setFont(new Font("Helvetica", Font.PLAIN, 17));
        frame.add(expirationYearCombo);
        
        // Combo Box for Withdrawal Year
        withdrawalYearCombo = new JComboBox(years);
        withdrawalYearCombo.setBounds(433, 667, 66, 32);
        withdrawalYearCombo.setFont(new Font("Helvetica", Font.PLAIN, 17));
        frame.add(withdrawalYearCombo);
        
        // Button for add debit card
        addDebitCardButton = new JButton("Add Debit Card");
        addDebitCardButton.setBounds(273, 412, 226, 39);
        addDebitCardButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        addDebitCardButton.setForeground(Color.white);
        addDebitCardButton.setBackground(Color.decode("#29ab87"));
        frame.add(addDebitCardButton);
        
        // Button for withdraw from debit card
        withdrawDebitCardButton = new JButton("Withdraw");
        withdrawDebitCardButton.setBounds(273, 722, 226, 39);
        withdrawDebitCardButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        withdrawDebitCardButton.setForeground(Color.white);
        withdrawDebitCardButton.setBackground(Color.decode("#29ab87"));
        frame.add(withdrawDebitCardButton);
        
        // Button for add credit card
        addCreditCardButton = new JButton("Add Credit Card");
        addCreditCardButton.setBounds(1254, 324, 226, 39);
        addCreditCardButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        addCreditCardButton.setForeground(Color.white);
        addCreditCardButton.setBackground(Color.decode("#29ab87"));
        frame.add(addCreditCardButton);
        
        // Button for set credit limit
        setCreditLimitButton = new JButton("Set Credit Limit");
        setCreditLimitButton.setBounds(774, 602, 226, 39);
        setCreditLimitButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        setCreditLimitButton.setForeground(Color.white);
        setCreditLimitButton.setBackground(Color.decode("#29ab87"));
        frame.add(setCreditLimitButton);
        
        // Button for cancel credit limit
        cancelCreditCardButton = new JButton("Cancel Credit Card");
        cancelCreditCardButton.setBounds(1254, 512, 226, 39);
        cancelCreditCardButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        cancelCreditCardButton.setForeground(Color.white);
        cancelCreditCardButton.setBackground(Color.decode("#29ab87"));
        frame.add(cancelCreditCardButton);
        
        // Button for display debit card
        debitCardDisplayButton = new JButton("Display Debit");
        debitCardDisplayButton.setBounds(620, 722, 200, 39);
        debitCardDisplayButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        debitCardDisplayButton.setForeground(Color.white);
        debitCardDisplayButton.setBackground(Color.decode("#29ab87"));
        frame.add(debitCardDisplayButton);
        
        // Button for display credit card
        creditCardDisplayButton = new JButton("Display Credit");
        creditCardDisplayButton.setBounds(851, 722, 200, 39);
        creditCardDisplayButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        creditCardDisplayButton.setForeground(Color.white);
        creditCardDisplayButton.setBackground(Color.decode("#29ab87"));
        frame.add(creditCardDisplayButton);
        
        // Button for clearing the Text Fields and reseting the Combo Box
        clearButton = new JButton("Clear");
        clearButton.setBounds(1334, 722, 150, 39);
        clearButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        clearButton.setForeground(Color.white);
        clearButton.setBackground(Color.decode("#29ab87"));
        frame.add(clearButton);
        
        // Line for separating different components
        verticalSeparator = new JSeparator(SwingConstants.VERTICAL);
        verticalSeparator.setBounds(570, 87, 5, 670);
        verticalSeparator.setForeground(Color.BLACK);
        frame.add(verticalSeparator);
        
        // Line for separating differnet components
        horizontalSeparator = new JSeparator(SwingConstants.HORIZONTAL);
        horizontalSeparator.setBounds(600, 683, 900, 5);
        horizontalSeparator.setForeground(Color.BLACK);
        frame.add(horizontalSeparator);
        
        // Adding action listener to each button
        addDebitCardButton.addActionListener(this);
        withdrawDebitCardButton.addActionListener(this);
        addCreditCardButton.addActionListener(this);
        setCreditLimitButton.addActionListener(this);
        cancelCreditCardButton.addActionListener(this);
        debitCardDisplayButton.addActionListener(this);
        creditCardDisplayButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        // setting the layout, size, visibility and other things of the frame
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#dfefdf"));
        frame.setSize(1540, 822);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // event handling of different buttons
    public void actionPerformed(ActionEvent e){
        // event handling of add debit card button
        if(e.getSource() == addDebitCardButton){
            /* Retriving all the values required for 
             * add debit card and storing it as a String
             */
            String cardIdForAddDebitCard = cardIdForAddDebitCardTextField.getText();
            String clientNameForAddDebitCard = clientNameForAddDebitCardTextField.getText();
            String bankAccountForAddDebitCard = bankAccountForAddDebitCardTextField.getText();
            String balanceAmountForAddDebitCard = balanceAmountForAddDebitCardTextField.getText();
            String pinNumberForAddDebitCard = pinNumberForAddDebitCardTextField.getText();
            String issuerBankForAddDebitCard = issuerBankForAddDebitCardTextField.getText();
            
            // Setting the boolean value to true and initializing the counter
            boolean hasNoException = true;
            int counter = 0;
            
            // checking for any empty text fields 
            if(cardIdForAddDebitCard.isEmpty() || clientNameForAddDebitCard.isEmpty() || bankAccountForAddDebitCard.isEmpty() || 
            balanceAmountForAddDebitCard.isEmpty() || pinNumberForAddDebitCard.isEmpty() || issuerBankForAddDebitCard.isEmpty()){
                // displaying a pop-up message when empty text fields found
                JOptionPane.showMessageDialog(frame, "Empty fields have been found. Please fill up the requried fields: Card ID, Client Name, Bank Account, Balance Amount, PIN Number, Issuer Bank.", "Alert ", JOptionPane.WARNING_MESSAGE);
            }
            else{
                // checks if the code within it produces any sort of error
                try{
                    int cardIdValue = Integer.parseInt(cardIdForAddDebitCard);
                }
                // handles the error found in try
                catch(NumberFormatException ex){
                    // Display a pop-up message
                    JOptionPane.showMessageDialog(frame, "Enter the value of card ID as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                    hasNoException = false;
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        double balanceAmountValue = Double.parseDouble(balanceAmountForAddDebitCard);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Display a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of Balance Amount as a decimal number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        int pinNumberValue = Integer.parseInt(pinNumberForAddDebitCard);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Display a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of PIN Number as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException == true){
                    // type casting
                    int cardIdValue = Integer.parseInt(cardIdForAddDebitCard);
                    double balanceAmountValue = Double.parseDouble(balanceAmountForAddDebitCard);
                    int pinNumberValue = Integer.parseInt(pinNumberForAddDebitCard);
                    // checking if the ArrayList is empty
                    if(cards.isEmpty()){    
                        // creating an object of debit Card
                        debitObject = new DebitCard(balanceAmountValue, cardIdValue, bankAccountForAddDebitCard, issuerBankForAddDebitCard,
                        clientNameForAddDebitCard, pinNumberValue);
                        // adding the object to the ArrayList
                        cards.add(debitObject);
                        // Displaying a message
                        JOptionPane.showMessageDialog(frame, "Debit Card has been added.");
                    }
                    else{
                        // looping through the ArrayList
                        for(BankCard card: cards){
                            // checking whether the card is DebitCard or not
                            if(card instanceof DebitCard){
                                // downcasting the card to debit card
                                debitObject = (DebitCard)card;
                                // checking if the Card ID of debit card matches the entered Card ID
                                if(debitObject.getCardID() == cardIdValue){
                                    // Displaying a message, increasing the counter and breaking
                                    JOptionPane.showMessageDialog(frame, "Debit Card for that Card ID already exists.");
                                    counter++;
                                    break;
                                }
                            }
                        }
                        if(counter == 0){
                            // creating an object of debit card
                            debitObject = new DebitCard(balanceAmountValue, cardIdValue, bankAccountForAddDebitCard, 
                            issuerBankForAddDebitCard, clientNameForAddDebitCard, pinNumberValue);
                            // adding the object to the ArrayList
                            cards.add(debitObject);
                            // Displaying a message
                            JOptionPane.showMessageDialog(frame, "Debit Card has been added.");
                        }
                    }
                }
            }
        }

        // event handling of withdraw button
        if(e.getSource() == withdrawDebitCardButton){
            /* Retriving all the values required for 
             * withdraw and storing it as a String
             */
            String cardIdForWithdrawDebitCard = cardIdForWithdrawDebitCardTextField.getText();
            String withdrawalAmountForWithdrawDebitCard = withdrawalAmountTextField.getText();
            String pinNumberForWithdrawDebitCard = pinNumberForWithdrawDebitCardTextField.getText();
            String withdrawalDay = (String)withdrawalDayCombo.getSelectedItem();
            String withdrawalMonth = (String)withdrawalMonthCombo.getSelectedItem();
            String withdrawalYear = (String)withdrawalYearCombo.getSelectedItem();
            String withdrawalDate = withdrawalMonth + " " + withdrawalDay + ", " + withdrawalYear;
            int withdrawalYearValue = Integer.parseInt(withdrawalYear);
            int withdrawalDayValue = Integer.parseInt(withdrawalDay);
            
            // Setting the boolean value to true and initializing the counter
            boolean hasNoException = true;
            int counter = 0;
            
            // checking for any empty text fields
            if(cardIdForWithdrawDebitCard.isEmpty() || withdrawalAmountForWithdrawDebitCard.isEmpty() || pinNumberForWithdrawDebitCard.isEmpty()){
                // displaying a pop-up message when empty text fields found
                JOptionPane.showMessageDialog(frame, "Empty fields have been found. Please fill up the required fields: Card ID, Withdrawal Amount, PIN Number.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            else{
                // checks if the code within it produces any sort of error
                try{
                    int cardIdValue = Integer.parseInt(cardIdForWithdrawDebitCard);
                }
                // handles the error found in try
                catch(NumberFormatException ex){
                    // Displays a pop-up message
                    JOptionPane.showMessageDialog(frame, "Enter the value of Card ID as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                    hasNoException = false;
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        int withdrawalAmountValue = Integer.parseInt(withdrawalAmountForWithdrawDebitCard);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Displays a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of Withdrawal Amount as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        int pinNumberValue = Integer.parseInt(pinNumberForWithdrawDebitCard);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Displays a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of PIN Number as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException == true){
                    // Validation of correct entry of date in the combo box for both leap year and non-leap year
                    if(withdrawalYearValue%4 != 0){
                        if(withdrawalMonth == "Apr" || withdrawalMonth == "Jun" || withdrawalMonth == "Sep" || withdrawalMonth == "Nov"){
                            if(withdrawalDayValue == 31){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                        if(withdrawalMonth == "Feb"){
                            if(withdrawalDayValue > 28){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                    }
                    else{
                        if(withdrawalMonth == "Apr" || withdrawalMonth == "Jun" || withdrawalMonth == "Sep" || withdrawalMonth == "Nov"){
                            if(withdrawalDayValue == 31){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                        if(withdrawalMonth == "Feb"){
                            if(withdrawalDayValue > 29){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                    }
                }
                
                if(hasNoException){
                    // type casting
                    int cardIdValue = Integer.parseInt(cardIdForWithdrawDebitCard);
                    int withdrawalAmountValue = Integer.parseInt(withdrawalAmountForWithdrawDebitCard);
                    int pinNumberValue = Integer.parseInt(pinNumberForWithdrawDebitCard);

                    // looping through the ArrayList
                    for(BankCard card: cards){ 
                        // checking whether the card is DebitCard or not
                        if(card instanceof DebitCard){
                            // downcasting the card to debit card
                            debitObject = (DebitCard)card;
                            // checking if the Card ID of debit card matches the entered Card ID
                            if(debitObject.getCardID() == cardIdValue){
                                // calling the withdraw method from DebitCard 
                                debitObject.withdraw(withdrawalAmountValue, withdrawalDate, pinNumberValue);
                                counter++;
                                // retrieving the value of getHasWithdrawn and storing it as boolean
                                boolean withdrawn = debitObject.getHasWithdrawn();
                                // retrieving the value of getPinNumber and storing it as int
                                int PinNumber = debitObject.getPinNumber();
                                if(withdrawn == false || PinNumber != pinNumberValue){
                                    // Displaying a pop-up message
                                    JOptionPane.showMessageDialog(frame, "The PIN Number or the Withdrawal Amount entered doesn't meet the condition");
                                }
                                else{
                                    // Displaying a pop-up message
                                    JOptionPane.showMessageDialog(frame, "Transaction has been made\nBelow are the details of current transaction: "
                                    + "\nCard ID: " + cardIdValue + "\nWithdrawal Amount: " + withdrawalAmountValue + "\nPIN Number: " + 
                                    pinNumberValue + "\nExpiration Date: " + withdrawalDate);
                                }
                                break;
                            }
                        }
                    }
                    
                    if(counter == 0){
                        // Displaying a pop-up message
                        JOptionPane.showMessageDialog(frame, "There is no card registered to the provided ID.");
                    }
                }     
            }
        }
        
        // event handling of add credit card button
        if(e.getSource() == addCreditCardButton){
            /* Retriving all the values required for 
             * add credit card and storing it as a String
             */
            String cardIdForAddCreditCard = cardIdForAddCreditCardTextField.getText();
            String clientNameForAddCreditCard = clientNameForAddCreditCardTextField.getText();
            String bankAccountForAddCreditCard = bankAccountForAddCreditCardTextField.getText();
            String issuerBankForAddCreditCard = issuerBankForAddCreditCardTextField.getText();
            String balanceAmountForAddCreditCard = balanceAmountForAddCreditCardTextField.getText();
            String cvcNumberForAddCreditCard = cvcNumberTextField.getText();   
            String interestRateForAddCreditCard = interestRateTextField.getText();
            String expirationDay = (String)expirationDayCombo.getSelectedItem();
            String expirationMonth = (String)expirationMonthCombo.getSelectedItem();
            String expirationYear = (String)expirationYearCombo.getSelectedItem();
            String expirationDate =  expirationMonth + " " + expirationDay + ", " + expirationYear;
            int expirationDayValue = Integer.parseInt(expirationDay);
            int expirationYearValue = Integer.parseInt(expirationYear);
            
            // Setting the boolean value to true and initializing the counter
            boolean hasNoException = true;
            int counter = 0;
            
            // checking for any empty text fields
            if(cardIdForAddCreditCard.isEmpty() || clientNameForAddCreditCard.isEmpty() || bankAccountForAddCreditCard.isEmpty() || 
            issuerBankForAddCreditCard.isEmpty() || balanceAmountForAddCreditCard.isEmpty() || cvcNumberForAddCreditCard.isEmpty() || 
            interestRateForAddCreditCard.isEmpty()){
                // displaying a pop-up message when empty text fields found
                JOptionPane.showMessageDialog(frame, "Empty fields have been found. Please fill up the requried fields: Card ID, Client Name, Bank Account, Issuer Bank, Balance Amount, CVC Number, Interest Rate.", "Alert ", JOptionPane.WARNING_MESSAGE);
            }
            else{
                // checks if the code within it produces any sort of error
                try{
                    int cardIdValue = Integer.parseInt(cardIdForAddCreditCard);
                }
                // handles the error found in try
                catch(NumberFormatException ex){
                    // Displays a pop-up message
                    JOptionPane.showMessageDialog(frame, "Enter the value of Card ID as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                    hasNoException = false;
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        double balanceAmountValue = Double.parseDouble(balanceAmountForAddCreditCard);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Displays a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of Balance Amount as a decimal number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        int cvcNumberValue = Integer.parseInt(cvcNumberForAddCreditCard);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Displays a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of CVC Number as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    } 
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        double interestRateValue = Double.parseDouble(interestRateForAddCreditCard);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Displays a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of Interest Rate as a decimal number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException == true){
                    // Validation of correct entry of date in the combo box for both leap year and non-leap year
                    if(expirationYearValue%4 != 0){
                        if(expirationMonth == "Apr" || expirationMonth == "Jun" || expirationMonth == "Sep" || expirationMonth == "Nov"){
                            if(expirationDayValue == 31){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                        if(expirationMonth == "Feb"){
                            if(expirationDayValue > 28){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                    }
                    else{
                        if(expirationMonth == "Apr" || expirationMonth == "Jun" || expirationMonth == "Sep" || expirationMonth == "Nov"){
                            if(expirationDayValue == 31){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                        if(expirationMonth == "Feb"){
                            if(expirationDayValue > 29){
                                JOptionPane.showMessageDialog(frame, "The date you chose doesn't exist. Enter a valid date.", "Alert", JOptionPane.WARNING_MESSAGE);
                                hasNoException = false;
                            }
                        }
                    }
                }
                if(hasNoException == true){
                    // type casting
                    int cardIdValue = Integer.parseInt(cardIdForAddCreditCard);
                    double balanceAmountValue = Double.parseDouble(balanceAmountForAddCreditCard);
                    int cvcNumberValue = Integer.parseInt(cvcNumberForAddCreditCard);
                    double interestRateValue = Double.parseDouble(interestRateForAddCreditCard);
                    // checking if the ArrayList is empty
                    if(cards.isEmpty()){
                        // creating an object of CreditCard
                        creditObject = new CreditCard(cardIdValue, clientNameForAddCreditCard, issuerBankForAddCreditCard,
                        bankAccountForAddCreditCard, balanceAmountValue, cvcNumberValue, interestRateValue, expirationDate);
                        // adding the object to the ArrayList
                        cards.add(creditObject);
                        // Displaying a message
                        JOptionPane.showMessageDialog(frame, "Credit Card has been added.");
                    }
                    else{
                        // looping through the ArrayList
                        for(BankCard card: cards){
                            // checking whether the card is CreditCard or not
                            if(card instanceof CreditCard){
                                // downcasting the card to credit card
                                creditObject = (CreditCard)card;
                                // checking if the Card ID of credit card matches the entered Card ID
                                if(creditObject.getCardID() == cardIdValue){
                                    // Displaying a message, increasing the counter and breaking
                                    JOptionPane.showMessageDialog(frame, "Credit Card for that Card ID already exists.");
                                    counter++;
                                    break;
                                }
                            }
                        }
                        if(counter == 0){
                            // creating an object of CreditCard
                            creditObject = new CreditCard(cardIdValue, clientNameForAddCreditCard, issuerBankForAddCreditCard,
                            bankAccountForAddCreditCard, balanceAmountValue, cvcNumberValue, interestRateValue, expirationDate);
                            // adding the object to the ArrayList
                            cards.add(creditObject);
                            // Displaying a message
                            JOptionPane.showMessageDialog(frame, "Credit Card has been added.");
                        }
                    }
                }
            }
        }
        
        // event handling of set credit limit button
        if(e.getSource() == setCreditLimitButton){
            /* Retriving all the values required for 
             * set credit limit and storing it as a String
             */
            String cardIdForSetCreditLimit = cardIdForSetCreditLimitTextField.getText();
            String creditLimitForSetCreditLimit = creditLimitTextField.getText();
            String gracePeriodForSetCreditLimit = gracePeriodTextField.getText();
            
            // Setting the boolean value to true and initializing the counter
            boolean hasNoException = true;
            int counter = 0;
            // checking for any empty text fields
            if(cardIdForSetCreditLimit.isEmpty() || creditLimitForSetCreditLimit.isEmpty() || gracePeriodForSetCreditLimit.isEmpty()){
                // displaying a pop-up message when empty text fields found
                JOptionPane.showMessageDialog(frame, "Empty fields have been found. Please fill up the requried fields: Card ID, Credit Limit, Grace Period.", "Alert ", JOptionPane.WARNING_MESSAGE);
            }
            else{
                // checks if the code within it produces any sort of error
                try{
                    int cardIdValue = Integer.parseInt(cardIdForSetCreditLimit);
                }
                // handles the error found in try
                catch(NumberFormatException ex){
                    // Displays a pop-up message
                    JOptionPane.showMessageDialog(frame, "Enter the value of Card ID as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                    hasNoException = false;
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        double creditLimitValue = Double.parseDouble(creditLimitForSetCreditLimit);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Displays a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of Credit Limit as a decimal number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException == true){
                    // checks if the code within it produces any sort of error
                    try{
                        int gracePeriodValue = Integer.parseInt(gracePeriodForSetCreditLimit);
                    }
                    // handles the error found in try
                    catch(NumberFormatException ex){
                        // Displays a pop-up message
                        JOptionPane.showMessageDialog(frame, "Enter the value of Grace Period as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                        hasNoException = false;
                    }
                }
                if(hasNoException){
                    // type casting
                    int cardIdValue = Integer.parseInt(cardIdForSetCreditLimit);
                    double creditLimitValue = Double.parseDouble(creditLimitForSetCreditLimit);
                    int gracePeriodValue = Integer.parseInt(gracePeriodForSetCreditLimit);
                    
                    // looping through the ArrayList
                    for(BankCard card: cards){
                        // checking whether the card is Credit Card or not
                        if(card instanceof CreditCard){
                            // down casting the card to credit card
                            creditObject = (CreditCard)card;
                            // checking if the card ID matches the entered Card ID
                            if(creditObject.getCardID() == cardIdValue){
                                // calling setCreditLimit with passing parameters using creditObject
                                creditObject.setCreditLimit(creditLimitValue, gracePeriodValue);
                                // Displaying message according to the condition
                                if(creditObject.getIsGranted() == false){
                                    JOptionPane.showMessageDialog(frame, "The credit limit can not be issued.");
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "The credit limit has been issued.\n" + "Card ID: " + cardIdValue + 
                                    "\nCredit Limit: " + creditLimitValue + "\nGrace Period: " + gracePeriodValue);
                                }
                                counter++;
                                break;
                            }
                        }
                    }
                    if(counter == 0){
                        // Displaying a message
                        JOptionPane.showMessageDialog(frame, "There is no card registered to the provided ID.");
                    }
                }
            }
        }
        
        // event handling of cancel credit card button
        if(e.getSource() == cancelCreditCardButton){
            /* Retriving all the values required for 
             * cancel credit card and storing it as a String
             */
            String cardIdForCancelCreditCard = cardIdForCancelCreditCardTextField.getText();
            
            // Setting the boolean value to true and initializing the counter
            boolean hasNoException = true;
            int counter = 0;
            // checking for any empty text fields
            if(cardIdForCancelCreditCard.isEmpty()){
                // displaying a pop-up message when empty text fields found
                JOptionPane.showMessageDialog(frame, "Empty fields have been found. Please fill the required fields: Card ID.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            else{
                // checks if the code within it produces any sort of error
                try{
                    int cardIdValue = Integer.parseInt(cardIdForCancelCreditCard);
                }
                // handles the error found in try
                catch(NumberFormatException ex){
                    // Displays a pop-up message
                    JOptionPane.showMessageDialog(frame, "Enter the value of Card ID as a whole number.", "Alert", JOptionPane.WARNING_MESSAGE);
                    hasNoException = false;
                }
                if(hasNoException){
                    // type casting
                    int cardIdValue = Integer.parseInt(cardIdForCancelCreditCard);
                    // looping through the ArrayList
                    for(BankCard card: cards){
                        // checking whether the card is CreditCard or not
                        if(card instanceof CreditCard){
                            // down casting the card to credit card
                            creditObject = (CreditCard)card;
                            // checking if the Card ID of credit card matches the Card ID entered
                            if(creditObject.getCardID() == cardIdValue){
                                // calling cancelCreditCard() method using creditObject
                                creditObject.cancelCreditCard();
                                JOptionPane.showMessageDialog(frame, "The credit card has been canceled.\nCard ID: " + cardIdValue);
                                counter++;
                                break;
                            }
                        }
                    }
                    if(counter == 0){
                        // Displaying a message
                        JOptionPane.showMessageDialog(frame, "There is no card registered to the provided ID.");
                    }
                }
            }
        }
        
        // event handling of debit card display button
        if(e.getSource() == debitCardDisplayButton){
            // Initializing the counter
            int counter = 0;
            // checking if the ArrayList is empty
            if(cards.isEmpty()){
                // Displaying a message
                JOptionPane.showMessageDialog(frame, "No debit card have been added yet");
            }
            else{
                // looping through the ArrayList
                for(BankCard card: cards){
                    // checking whether the card is DebitCard or not
                    if(card instanceof DebitCard){
                        // down casting card to debit card
                        debitObject = (DebitCard)card;
                        System.out.println("Details of Debit Card: " + debitObject.getCardID());
                        // calling display() method using debitObject
                        debitObject.display();
                        System.out.println();
                        counter++;
                    }
                }
                if(counter == 0){
                    // Displaying a message
                    JOptionPane.showMessageDialog(frame, "No debit card have been added yet.");
                }
            }
        }
        
        // event handling of credit card display button
        if(e.getSource() == creditCardDisplayButton){
            // Initializing the counter
            int counter = 0;
            // Checking if the ArrayList is empty
            if(cards.isEmpty()){
                // Displaying a message
                JOptionPane.showMessageDialog(frame, "No credit card have been added yet");
            }
            else{
                // looping through the ArrayList
                for(BankCard card: cards){
                    // checking whether the card is credit card or not
                    if(card instanceof CreditCard){
                        // downcasting the card to credit card
                        creditObject = (CreditCard)card;
                        System.out.println("Details of Credit Card: " + creditObject.getCardID());
                        // calling display() method using creditObject
                        creditObject.display();
                        System.out.println();
                        counter++;
                    }
                }
                if(counter == 0){
                    // Displaying a message
                    JOptionPane.showMessageDialog(frame, "No credit card have been added yet");
                }
            }
        }
        
        // event handling of clear button
        if(e.getSource() == clearButton){
            // clearing all the text fields 
            cardIdForAddDebitCardTextField.setText(null);
            clientNameForAddDebitCardTextField.setText(null);
            bankAccountForAddDebitCardTextField.setText(null);
            balanceAmountForAddDebitCardTextField.setText(null);
            pinNumberForAddDebitCardTextField.setText(null);
            issuerBankForAddDebitCardTextField.setText(null);
            
            cardIdForWithdrawDebitCardTextField.setText(null);
            withdrawalAmountTextField.setText(null);
            pinNumberForWithdrawDebitCardTextField.setText(null);
            
            cardIdForAddCreditCardTextField.setText(null);
            clientNameForAddCreditCardTextField.setText(null);
            bankAccountForAddCreditCardTextField.setText(null);
            issuerBankForAddCreditCardTextField.setText(null);
            balanceAmountForAddCreditCardTextField.setText(null);
            cvcNumberTextField.setText(null);
            interestRateTextField.setText(null);

            cardIdForSetCreditLimitTextField.setText(null);
            creditLimitTextField.setText(null);
            gracePeriodTextField.setText(null);

            cardIdForCancelCreditCardTextField.setText(null);
            
            // Reseting the value of JComboBox to initial value
            expirationDayCombo.setSelectedIndex(0);
            expirationMonthCombo.setSelectedIndex(0);
            expirationYearCombo.setSelectedIndex(0);
            withdrawalDayCombo.setSelectedIndex(0);
            withdrawalMonthCombo.setSelectedIndex(0);
            withdrawalYearCombo.setSelectedIndex(0);
        }
    } 
    
    public static void main(String[] args){
        // creating an object of BankGUI
        BankGUI bankGUIObject = new BankGUI();
    }
}