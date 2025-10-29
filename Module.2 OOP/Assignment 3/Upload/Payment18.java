abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    long cardNumber;
    int amount;

    CreditCardPayment(long cardNumber, int amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " --> Rs. " + amount + " Paid");
    }
}

class UPIPayment extends Payment {
    String upiId;
    int amount;

    UPIPayment(String upiId, int amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment via UPI " + upiId + " --> Rs. " + amount + " Paid");
    }
}

class Payment18{
    public static void main(String args[]) {
        Payment p1 = new CreditCardPayment(1234567890123456L, 5000);
        Payment p2 = new UPIPayment("rahul@upi", 2000);

        p1.pay();
        p2.pay();
    }
}
