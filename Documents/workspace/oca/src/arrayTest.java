import java.util.Arrays;
class arrayTest
{
    public static void main (String[] args) 
    {
        
        int inarr1[] = {1, 2, 3};
        int inarr2[] = {1, 2, 3};   
        Object[] arr1 = {inarr1};  
        Object[] arr2 = {inarr2};  
        if (Arrays.deepEquals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
