public class ValidateOverloading {
    boolean validate(String name){
        return name.matches("[a-zA-Z\\s]*");
        
    }
    boolean validate(int age){
       return age>3 && age<15;
    }
    public static void main(String[] args) {
        String name="prudhvi";
        int age=21;
        ValidateOverloading obj = new ValidateOverloading();
        System.out.println("Is name valid? " + obj.validate(name));
        System.out.println("Is age valid? " + obj.validate(age));  
    }
}
