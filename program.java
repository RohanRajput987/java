import java.util.Scanner;
class program{
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();    
        for(int i=0;i<t;i++)
        {
            int a = r.nextInt();
            int b = r.nextInt();
            int n = r.nextInt();
            for(int j=0;j<n;j++)
            {
                a+=Math.pow(2,j)*b;
                System.out.print(a+" ");
            }
            System.out.println();

        }
    }
}