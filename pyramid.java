import java.util.Scanner;
public class pyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int n = sc.nextInt();
        //Pyramid
        /*for(int i=0;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

    // Reverse Pyramid
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=0;j<(2*(n-i)-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
        
    }
}
