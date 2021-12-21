public class Testat
{
    
    public static void main( String args[] )
    {
        // Beispiel 1
        int[] arr1 = {-1,12,10,4,25};
        System.out.println( Testat.apply( arr1, 4 ) );
        
        //Beispiel 2
        int[] arr2 = {10,-2,14,-6,-11};
        System.out.println( Testat.apply( arr2, 4 ) );
        
        //Beispiel 3
        int[] arr3 = {8,12,14,22,28};
        System.out.println( Testat.apply( arr3, 4 ) );
        
        //Beispiel 4
        int[] arr4 = {7,9,13,17,21};
        System.out.println( Testat.apply( arr4, 4 ) );
        
        //Beispiel 5
        int[] arr5 = {11};
        System.out.println( Testat.apply( arr5, 0 ) );
        
        //Beispiel 6
        int[] arr6 = {8};
        System.out.println( Testat.apply( arr6, 0 ) );
        
        // Beispiel 7
        int[] arr7 = {0,2,3,4,5};
        System.out.println( Testat.apply( arr7, -1 ) );
        
        // Beispiel 8
        int[] arr8 = {0,2,3,4,5};
        System.out.println( Testat.apply( arr8, 5 ) );
        
        //Beispiel 9
        int[] arr9 = {};
        System.out.println( Testat.apply( arr9, 1 ) );
        
    }
   
    
    public static int apply( int[] arr, int i )
    {
        if (0 <= i && i < arr.length)
        {
            if (arr[i] %2 == 0)
            {
                if (arr[i] != 10)
                {
                    return arr[i] + apply(arr, i-1);
                }else {
                    return apply(arr, i-1);
                }
            }else
            {
                return apply (arr, i-1);
            }
        }else{
            return 0;
        }
    }
}
