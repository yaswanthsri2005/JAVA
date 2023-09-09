 //java program to find sum of first n natural numbers
 //26-08-2023
 //SumofNaturalNumbers.java
 import java.io.*;
 import java.util.*;
 public class SumofNaturalNumbers{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter an Integer value less than 20: ");
 int n=sc.nextInt();
 int sum=0;
 for(int i=1;i<=n;i++){
 int sum=sum+i;
 }
 System.out.println("Sum of 1st "+n+" natural numbers is",+sum);
 }
 }