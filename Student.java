class Stud{
    public String name,course;
    public int m1,m2,m3,rollNumber;
    public int Total(){
        return m1+m2+m3;
    }
    public String Details(){
        return "Name:"+name+"Course:"+course;
    }
}
public class Student {
    public static void main(String[] args) {
        Stud s=new Stud();
        s.name="prudhvi";
        s.rollNumber=21;
        s.course="BEEE";
        s.m1=98;
        s.m2=97;
        s.m3=96;
        System.out.println("Details:"+s.Details());
        System.out.println("Total:"+s.Total());
    }
}
