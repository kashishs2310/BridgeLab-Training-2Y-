import java.util.Scanner;
class average 
{
    public static void main(String[] args) 
        {
           Scanner sc=new Scanner(System.in);
           double a=sc.nextDouble();
           double b=sc.nextDouble();
           double c=sc.nextDouble(); 
           double avg=(a+b+c)/3.0;
           System.out.println(avg);
        }
}