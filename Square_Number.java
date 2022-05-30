import java.util.Scanner;
class num
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int n,i,num=0;
   n=sc.nextInt();
   for(i=1;i<=n;i++)
   {
       if(i*i==n)
       {
           num=n;
       }
   }
   if(num!=0)
   System.out.println("True");
   else
   System.out.println("False");
   }
}
