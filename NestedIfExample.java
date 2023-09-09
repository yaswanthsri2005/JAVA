 // java program to demonstrate Nested-if
 // 26-08-2023
 // NestedIfExample.java
 import java.io.*;
 import java.util.*;
 public class NestedIfexample{
 public static void main(Stirng args[]){ 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Marks of 3 subjects");
 int M1=sc.nextInt();
 int M2=sc.nextInt();
 int M3=sc.nextInt();
 int Total=M1+M2+M3;
 Avg=Total/3.0;
 if(Avg>=75){
 if(Avg>=95){
 System.out.println("Your Average is in Top 5%");
 }
 else if(Avg>=90){
 System.out.println("Your Average is in Top 10%");
 }
 else{
 System.out.println("You are passed in 1st Distinction");
 }
 }
 else if(Avg>=40&&<75){
 System.out.println("student passed");
 }
 else{
 System.out.println("Better luck next Time");
 }
 }
 }