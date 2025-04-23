public class Account {

    private double balance;

    public Account() {
        if (balance > 0.0) {
            this.balance = 0.0;
        }
    }


    public double getBalance() {
        return balance;
    }

    public int deposit(double depositamount) {
        if (depositamount > 0.0) {
            balance += depositamount;
        }

        return 0;
    }


        public int withdraw (double withdrawAmount){
            if (withdrawAmount > balance) {
                System.out.println("Withdrawal amount exceeded account balance.");
            } else if (withdrawAmount > 0.0) {
                balance -= withdrawAmount;
            }
            return 0;
        }


}



