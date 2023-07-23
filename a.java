import java.util.*;
class a
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                for(int k=0;k<n-1;k++)
                System.out.print(" ");
                System.out.print("*");
                System.out.println();
                
            }
            else if(i==n/2)
            {
                for(int x=(n-i)-1;x>0;x--)
                System.out.print(" ");
                for(int y=0;y<n+2;y++)
                System.out.print("*");
                System.out.println();
            }
            else
            {
                for(int z=(n-i)-1;z>0;z--)
                System.out.print(" ");
                System.out.print("*");
                for(int b=0;b<(i+i);b++)
                System.out.print(" ");
                System.out.print("*");
                System.out.println();
                
            }
        }
    }
}