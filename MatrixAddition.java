import java.io.*;
import java.util.*;
 public class MatrixAddiiton{
    public static void main(String args[]){
        int arr[][];
        System.out.println("Enter no.of Rows: ");
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("Enter no.of Columns: ");
        int c=sc.nextInt();
        int b[][];
        int c[][];
        int a[][] = new int[r][c];
        System.out.println("Total no.of elements in the Matrix");
        System.out.println("Enter"+r*c+"Elements into 1st Matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter "+r*c+"Elements into 2nd Matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The After Addition the Matrix Elements are: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println( );
        }
    }
}
