 //java program to print days of a week
 //26-08-2023
 //WeekDaysSwitch.java
 import java.io.*;
 import java.util.*;
 public class WeekDaysSwitch{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int dayNum;
 System.out.println("Enter a day Number (1-7): ");
 dayNum=sc.nextInt();
 Switch(dayNum){
 case 1:
 System.out.println("Monday");
 break;
 case 2:
 System.out.println("Tuesday");
 break;
 case 3:
 System.out.println("Wednesday");
 break;
 case 4:
 System.out.println("Thursday");
 break;
 case 5:
 System.out.println("Friday");
 break;
 case 6:
 System.out.println("Saturday");
 break;
 case 7: 
 System.out.println("Sunday");
 break;
 default:
 System.out.println("Invalid choice");
 break;
 }
 }
 }