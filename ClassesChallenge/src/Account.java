
public class Account {
    // Fields
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;


    public Account() {
        this("56789", 2.50, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    // Method for deposing funds from the account
    public void depositFunds(double depositAmount) {

        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.accountBalance);
    }

    // Method for withdrawing funds from the account
    public void withdrawFunds(double withdrawalAmount) {

        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account.");
        }
        else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount +
                    " processed, Remaining balance = $" + accountBalance);
        }
    }

    // Describe all information about user account
    public void describeUserAccount() {

        System.out.println("User Account:\n" +
                "Name: " + customerName +
                " Email: " + customerEmail +
                " Phone number: " + customerPhoneNumber +
                " Account number: " + accountNumber +
                " Account balance: " + accountBalance);
    }

    // Getter Methods
    public String getAccountNumber() {

        return accountNumber;
    }

    public double getAccountBalance() {

        return accountBalance;
    }

    public String getCustomerName() {

        return customerName;
    }

    public String getCustomerEmail() {

        return customerEmail;
    }

    public String getCustomerPhoneNumber() {

        return customerPhoneNumber;
    }

    // Setter Methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }




}