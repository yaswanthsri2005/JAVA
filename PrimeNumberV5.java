// java program to display prime numbers between two intervals 
// Example of Nested Loops
import java.io.*;
public class Prime {

    public static void main(String[] args) {

        int low = 23, high = 97;

        while (low <= high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}