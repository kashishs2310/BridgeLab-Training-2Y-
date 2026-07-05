import java.util.Scanner;
class temp
{
    public static void main(String[] args) 
        {
           Scanner sc=new Scanner(System.in);
           double cel=sc.nextDouble();
           double fah=(cel*9/5)+32;
           System.out.println(fah);
        }
}