public class Strings{
    public static void main(String[] arg){
        String str="Java";
        int l=str.length();
        str=str.toLowerCase();
        String str1=str.toUpperCase();
        String str2=str.replace('j','k');
        System.out.println(l+" "+str+" "+str1+" "+str2);
        String s="   pd udhvi   ";
        s=s.trim();
        int p=s.indexOf('p');
        int r=s.indexOf('d',2);
        char d=s.charAt(1);
        String sub=s.substring(0,2);
        System.out.println(s+" "+p+" "+r+" "+ s.startsWith("pd")+" "+sub);
        System.out.println(d);
        String str3="Java";
        String str4="java";
        System.out.println(str4.equals(str3));
        System.out.println(str4.equalsIgnoreCase(str3));
        System.out.println(s.contains("pd"));
    }
}