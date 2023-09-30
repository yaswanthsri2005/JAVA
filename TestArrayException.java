import java.io.*;
public class TestArrayException{
    public static void main(String args[]){
        int arr[]={50,60,70,80};
        for(int i=0;i<=6;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

/**output:
50
60
70
80

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at TestArrayException.main(TestArrayException.java:7)**/
