import java.util.Arrays;

public class two_sum_LEET {
    public static void main(String[] args) {
    int[]nums = {2,7,11,15};
    int target = 9;

    int[]result=twosum(nums,target);
    System.out.println(Arrays.toString(result));

    }
    public static int[] twosum(int[]nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
        {
        
            if(nums[i] +nums[j]==target)
            {
                return new int[]{i,j};
            }
        }
    }
    
    throw new IllegalArgumentException("No two sum solution");
    }
}
