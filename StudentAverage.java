 //java program to find average of student
 //22-8-2023
 //StudentAverage.java
 import java.io.*;
 import util.*;
 public class StudentAverage{
 public static void main(String args[]){
 int M1,M2,M3;
 System.out.println("Enter Marks of 3 subjects");
 Scanner sc = new Scanner(System.in);
 int M1=sc.nextInt();
 int M2=sc.nextInt();
 int M3=sc.nextInt();
 int Total=M1+M2+M3;
 float Avg=(float)Total/3;
 if(Avg>=75){
 System.out.println("Student passed in Distinction");
 }
 else if(Avg>=60&&Avg<75){
 System.out.println("Student has passed in 1st class");
 }
 else if(Avg>=50&&Avg<60){
 System.out.println("Student has passed in 2nd class");
 }
 else{
 System.out.println("Student Failed in the exam");
 }
 }
 }