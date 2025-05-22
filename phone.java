class cell{
    public Long no,imie;
    public cell(Long no,Long imie){
        this.no=no;
        this.imie=imie;
    }
    public void call(){

    }
    public void saveContact(){
        
    }
    public void deleteContact(){

    }
    public void display(){
        System.out.println("Number:"+no);
        System.out.println("IMIE:"+imie);
    }
}
class SmartPhone extends cell{
    public SmartPhone(Long no,Long imie){
        super(no,imie);
    }
    public void play(){
        System.out.println("music is playing");
    }
    public void click(){
        System.out.println("opened");
    }
    public void captured(){
        System.out.println("pictured is captured");
    }
}
public class phone {
    public static void main(String[] args) {
        SmartPhone a=new SmartPhone(9542650478L,1234567865L);
        a.display();
        a.play();
        a.click();
        a.captured();
        
    }
}
