public abstract class BankAccount2{
    private Person name;
    private int accNum;
    double balance;

    public BankAccount2(){
        this(new Person(), 0, 0);

    }
    public BankAccount2(Person name, int accNum, double balance){
        setPerson(name);
        setAccNum(accNum);
        setBalance(balance);
    }

    public Person getPerson(){
        return this.name;
    }
    public int getAccNum(){
        return this.accNum;

    }

    public double getBalance() {
        return this.balance;
    }
    public void setPerson(Person name){
        this.name = name;
    }
    public void setAccNum(int accNum){
        this.accNum = accNum;

    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String toString() {
        return
              "Name of owner:"+  name +
                        "\nAccount Number: " + accNum +
                        "\nBalance: €" + balance;
    }
}