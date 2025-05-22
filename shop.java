class Customer{
    public String name;
    public Long no;
    public int cusid;
    public Customer(String name,Long no,int cusid){
        this.name=name;
        this.no=no;
        this.cusid=cusid;
    }
    public void PayBill(){
        System.out.println("Your bill is ready");
    }
}
class member extends Customer{
    public member(String name,Long no,int cusid,String dob){
        super(name,no,cusid);
        
    }
    public void callback(){
        System.out.println("we will call back you:"+name);
    }
    public void display(){
        System.out.println("name:"+name);
        System.out.println("number:"+no);
        System.out.println("Customer id:"+cusid);
    }
}
public class shop {
    public static void main(String[] args) {
        member a=new member("prudhvi",9542650478L,121,"11-07-2005");
        a.display();
        a.PayBill();
        a.callback();
    }
}