import java.util.Arrays;
import java.util.SortedSet;
class Duplicate_Array {
    public static void main(String[] args) 
    {
        
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);

        boolean result = containsDuplicate(arr);
        System.out.println("Contains Duplicate: "+result);
            
        }
        
    public static boolean containsDuplicate(int[] arr) 
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                return true;
            }
        }
        return false;
    }
}

