import java.util.Scanner;
class Rohan
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
   	for(int i=0;i<3;i++)
            	{
                		String s1=sc.next();
                		int x=sc.nextInt();
                		System.out.printf("%-15s%03d%n",s1,x);
            }
    }
}
