public class Bank {
    String name;
    int pwd;
    int input, output;
    int balance = 0;

    public Bank(String name, int pwd, int balance) {
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }

    public void my() {
        System.out.println(this.name + this.pwd + this.balance);
    }

    public void setInput(int input) {
        this.balance = input;
        System.out.println(this.balance);
    }

    public void setOutput(int output) {
        this.balance = output;
        System.out.println(this.balance);
    }

    public void getBalance() {
        System.out.println(balance);
    }
}
