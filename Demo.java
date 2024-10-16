import java.io.*;
import java.util.*;
class overloading{
overloading(){
System.out.println("No parameters");
}
overloading(double r){
System.out.println("R is :"+r);
}
overloading(int a,int b){
System.out.println("sum of two numbers:"+a+b);
}
class Demo{
public static void main(String[]args)
{
overloading P1=new overloading();
overloading P2=new overloading(20);
overloading P3=new overloading(10,20);
}
}
