package com.bridgelabz.coreprogram;

import java.util.Scanner;

public class LgstNum{

public static void main(String[]args){
	
int a,b,c,largest,temp;
Scanner sc = new Scanner(System.in);

System.out.println("enter the first num:");
a=sc.nextInt();
System.out.println("enter the second num:");
b=sc.nextInt();
System.out.println("enter the third num:");
c=sc.nextInt();

temp=a>b?a:b;


largest=c>temp ? c:temp;

System.out.println("the number is :"+largest);
}
}