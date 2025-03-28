public class Web {
    public static void main(String[] args) {
        String str="http://www.google.com";
        String pro=str.substring(0,str.indexOf(":"));
        if(pro.equals("http")){
            System.out.println("Hyper text transfer protocol");
        }else if(pro.equals("ftp")){
            System.out.println("File transfer protocol");
        }else{
            System.out.println("Enter a valid string");
        }
        String la=str.substring(str.lastIndexOf(".")+1);
        if(la.equals("com")){
            System.out.println("Commercial");
        }
        if(la.equals("org")){
            System.out.println("organiation");
        }
        if(la.equals("gov")){
            System.out.println("government");
        }
    }
}
