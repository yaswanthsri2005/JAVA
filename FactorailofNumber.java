 //java program to find factorail of number
 //26-08-2023
 //FactorialofNumber.java
 import java.io.*;
 import java.util.*;
 public class FactorialofNumber{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter an Integer value ");
 int n=sc.nextInt();
 int fact=1;
 for(int i=1;i<=n;i++){
  fact=fact*i;
 }
 System.out.println("Factorialof "n" is :");
 }
 }