import java.util.Scanner;
class disk
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b,max;
        s= sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        max=2*s*t*b*512;
        System.out.print(+max);
    }
}