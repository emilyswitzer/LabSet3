public class SavingsAccount extends BankAccount2 implements Taxable {

    private double tax;
    private double savings;

    public SavingsAccount(){
        super();
        this.tax=tax;
    }

    public SavingsAccount(Person name, int accNum, double balance, double tax){
        super(name, accNum, balance);
        setTax(tax);
    }
    public double getTax(){
        return this.tax;
    }
    public void setTax(double tax){
        this.tax=tax;
    }
    public String toString() {
        return "Account Type: "+ super.toString()+
                "\nRate of tax: " + tax +"%\n";
    }
    public double calcTax() {

        double answer = balance*tax/100;
        return answer;
    }
}

