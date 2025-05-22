class Account{
    int accno;
    Long phone;
    String name,address,dob;
    double balance;
    public Account(int accno,String name,String address,Long phone,String dob){
        this.accno=accno;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.dob=dob;
        this.balance=0.0;
    }
        public void display(){
            System.out.println("Name:"+name);
            System.out.println("accno:"+accno);
            System.out.println("address:"+address);
            System.out.println("phone:"+phone);
            System.out.println("dob:"+dob);
        }
}
    class SavingsAcc extends Account{
        public SavingsAcc(int accno,String name,String address,Long phone,String dob){
            super(accno,name,address,phone,dob);
        }
        public double deposit(int amount) {
        balance += amount;
        return balance;
    }
        public double getbalance(){
            return balance;
        }
    }

public class Main {
    public static void main(String[] args) {
        SavingsAcc a = new SavingsAcc(1000, "Prudhvi", "Chennai", 9542650478L, "11-07-2005");
        a.deposit(1000);
        System.out.println(a.getbalance());
        a.display();
    }
}