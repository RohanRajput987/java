import java.util.Arrays;
//Missing in Array
class Missing
{
    int MissingNumber(int arr[])
    {
        Arrays.sort(arr);
        int k=1;
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = false;
            if(arr[i]==k)
            {
                flag=true;
            }
            if(flag==false)
            {
                return k;
            }
            k++;
        }
        return k;
    }
    public static void main(String[] args)
    {
        Missing m = new Missing();
        int[] arr1={3,2,0,4};
        System.out.println(m.MissingNumber(arr1));
    }
}