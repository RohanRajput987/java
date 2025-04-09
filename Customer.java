import java.util.Scanner;

class Customer {
    private int acc_no;
    private String name;
    private float acc_bal;

    Customer(int acc_no, String name, float acc_bal) {
        this.acc_no = acc_no;
        this.name = name;
        this.acc_bal = acc_bal;
        System.out.println("New Account created with amount: " + acc_bal);
    }

    public int getAcc_No() {
        return acc_no;
    }

    public void setAcc_No(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getACC_Bal() {
        return acc_bal;
    }

    public void setACC_Bal(float acc_bal) {
        this.acc_bal = acc_bal;
    }

    public String toString() {
        return "Account No: " + acc_no + ", Name: " + name + ", Balance: " + acc_bal;
    }

    void deposit(float amt) {
        acc_bal += amt;
        System.out.println("Deposited. New Balance = " + acc_bal);
    }

    void withdraw(float amt) {
        if (amt > acc_bal) {
            System.out.println("Insufficient balance");
        } else {
            acc_bal -= amt;
            System.out.println("Withdrawal successful. New Balance = " + acc_bal);
        }
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + acc_bal);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Account number: ");
        int acc_no = in.nextInt();
        in.nextLine(); // Consume newline left-over

        System.out.print("Enter the Account Holder Name: ");
        String name = in.nextLine();

        System.out.print("Enter the amount: ");
        float amount = in.nextFloat();

        Customer obj = new Customer(acc_no, name, amount);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");

            int option = in.nextInt();
            float amt;

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amt = in.nextFloat();
                    obj.deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amt = in.nextFloat();
                    obj.withdraw(amt);
                    break;
                case 3:
                    obj.balanceEnquiry();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
