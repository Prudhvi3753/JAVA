import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter no of rows and columns:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();   
        int [][] a,b,d;
        a=new int[r][c];
        b=new int[r][c];
        d=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<c;k++){
                    d[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
