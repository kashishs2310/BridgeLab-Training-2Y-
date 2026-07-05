import java.util.Scanner;
class power
{
    public static void main(String[] args) 
        {
           Scanner sc=new Scanner(System.in);
           double b=sc.nextDouble();
           double e=sc.nextDouble();
           double a=Math.pow(b,e); 
           System.out.println(a);
        }
}