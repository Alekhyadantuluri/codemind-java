import java.util.Scanner;
class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n,i,sum=0;
        n=sc.nextFloat();
        for(i=1;i<=n;i++)
        {
             sum= sum+(float)(1/i);
        }
        System.out.format("%.2f",sum);
    }
}