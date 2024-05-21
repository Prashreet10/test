import java.util.Scanner;

public class automorphic {
    public static void main(String args[])
    {
        int num,sqr,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        sqr=num*num;
        int n=num;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        int lastdigit=(int)(sqr%(Math.pow(10,count)));
        if(num==lastdigit)
        {
            System.out.println("The number is automorphic");
        }
        else{
            System.out.println("The number is not automorphic");

        }
    }
}
