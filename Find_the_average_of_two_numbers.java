import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        float a,b;
        float avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(a+b)/2;
        System.out.format("%.4f",+avg);
    }
    
}