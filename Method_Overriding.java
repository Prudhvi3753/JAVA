

/*class Super{
    public void display(){
        System.out.println("Hello");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Hello World");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Super su=new Super();
        su.display();
        Sub sb=new Sub();
        sb.display();
    }
}
*/



/* Dynamic method dispatch 
class Super{
    public void display(){
        System.out.println("Hello");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Hello World");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Super su=new Sub();
        su.display();
    }
}
    */

    /* Real life example for dynamic method dispatch 

class TV{
    public void switchOn(){
        System.out.println("Switch on tv");
    }
}
class Smart extends TV{
    @Override
    public void switchOn(){
        System.out.println("Switch on smart tv");
    }
}
    public class Method_Overriding{
    public static void main(String[] args) {
        TV a=new Smart();
        a.switchOn();
    }
}
    */

    /* car example */
class Car{
    public void Start(){
        System.out.println("Start the car");
    }
    public void Accelarate(){
        System.out.println("Accelorate the car");
    }
    public void ChangeGare(){
        System.out.println("Change the Gare");
    }
}
class LuxaryCar extends Car{
    
    public void ChangeGare(){
        System.out.println("Automatic");
    }
    public void Openroof(){
        System.out.println("Open roof");
    }
 
}
    public class Method_Overriding{
    public static void main(String[] args){
        LuxaryCar a=new LuxaryCar();
        a.Start();
        a.Accelarate();
        a.ChangeGare();
        a.Openroof();
    }
}