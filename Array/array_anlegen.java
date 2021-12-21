public class Testat
{
    int sum;   
    public static int [] apply ( int[] arr , int x)
    {
        int[] sum;
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] % 2 == 0 )
            {
                arr[i] =arr[i] + x;
            }
            else
            {
                arr[i] = arr[i] - x;
            }
        }
        return arr;
    }
}