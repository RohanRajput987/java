import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
                                                                    //inverted right angle triangle
        /*for(int i=0;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        */
//  right angle triangle
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
