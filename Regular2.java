public class Regular2 {
    public static void main(String[] args) {
        int i=10010001;
        String str=String.valueOf(i);
        System.out.println(str);
        System.out.println(str.matches("[01]*"));
        String str2="123A";
        System.out.println(str2.matches("[0-9A-f]*"));
        String str3="27/03/2005";
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        String str4="asd$#SD#1%$";
        System.out.println(str4.replaceAll("[^a-zA-Z0-1]",""));
        String str5="asd  asdfd  wasd";
        System.out.println(str5.replaceAll("\\s+"," "));
    }
}
