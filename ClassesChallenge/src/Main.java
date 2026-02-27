

public class Main {
    public static void main(String[] args) {

//        Account bobsAccount = new Account("12345", 500,
//                "Bob Brown", "BobBrown@bob.com",
//                "(087) 123-4567");
        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setAccountBalance(1000.0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("BobBrown123@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        Account timsAccount = new Account("Tim", "tim@email.com",
                "123456");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());
    }


}