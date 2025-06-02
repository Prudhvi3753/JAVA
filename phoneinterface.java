class phone{
    public void sms(){
        System.out.println("SMS Is On");
    }
    public void display(){
        System.out.println("Display keys");
    }
}
interface Camera{
    void click();
    void record();
}
interface musicplayer{
    void play();
    void sound();
}
class Smartphone extends phone implements Camera,musicplayer{
    @Override
     public void sms(){
        System.out.println("SMS Is On in smartphone");
    }
    @Override
    public void display(){
        System.out.println("Display keys in smartphone");
    }
    public void click(){
        System.out.println("click the phone");
    }
     public void record(){
        System.out.println("click the phone");
    }
     public void play(){
        System.out.println("click the phone");
    }
     public void sound(){
        System.out.println("click the phone");
    }
}
public class phoneinterface {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        sp.sms();
        sp.display();
        sp.click();
        sp.play();
    }
}
