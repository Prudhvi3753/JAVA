public class RegularExpression {
    public static void main(String[] args){
        String str="Programmer@gmail.com";
        String username,domainname;
        int i=str.indexOf('@');
        System.out.println(i);
        username=str.substring(0,i);
        System.out.println("Username:"+username);
        domainname=str.substring(i+1,str.length());
        System.out.println(" Domein name:"+domainname);
        int j=str.indexOf('.');
        System.out.println(j);
        String str2=str.substring(i+1,j);
        System.out.println(str2);
        String str3="gmail";
        System.out.println("Given email is gmail:"+str2.equals(str3));

        


    }
}
