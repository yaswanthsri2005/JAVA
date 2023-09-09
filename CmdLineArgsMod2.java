// 02-09-2023
// CmdLineArgsMod2.java
import java.io.*;
public class CmdLineArgsMod2 extends Object {
    public static void main(String args[]) {
        CmdLineArgsMod2 obj = new CmdLineArgsMod2();
        if(args.length!=2) {
            System.out.println("Invalid no.of Arguments.. \n You need to pass Two Integers");
        }
        else {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("The Class Name is :- "+obj.getClass());
        System.out.println("Sum of "+x+" and "+y+" is "+z);
        }
    }
}