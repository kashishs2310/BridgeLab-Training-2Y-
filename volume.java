import java.util.Scanner;
class volume 
{
    public static void main(String[] args) 
        {
           Scanner sc=new Scanner(System.in);
           double h=sc.nextDouble();
           double r=sc.nextDouble();
           double volume=3.14*r*r*h; 
           System.out.println(volume);
        }
}