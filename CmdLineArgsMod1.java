import java.io.*;
public class CmdLineArgsMod {
    public static void main(String args[]) {
        if(args.length!=2) {
            System.out.println("Invalid no.of Arguments.. \n You need to pass Two Integers");
        }
        else {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("Sum of "+x+" and "+y+" is "+z);
        }
    }
}