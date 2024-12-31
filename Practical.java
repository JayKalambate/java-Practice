class Practical 
{
    public static void main(String[] args) 
    {
       int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int target = 6;
       int result = LinearSearch(nums, target);
              int result2 = BinarySearch(nums, target);
              
                     if(result==-1)
                      {
                            System.out.println("Element found at index: "+result);
                      }
                      else
                      {
                            System.out.println("Element not found");
                      }
                  }
              
                 public static int LinearSearch(int []nums,int target)
                 {
                    for(int i=0;i<nums.length;i++)
                    {
                        if(nums[i]==target)
                        {
                            return i;
                        }
                        else
                        {
                            return -1;
                        }
                    }
                                        return target;
                 }
                 public static int BinarySearch(int[]nums, int target)
                 {
                    int left = 0;
                    int right = nums.length-1;
                    while(left <= right)
                    {
                        int mid = left + (right-left)/2;
                        if(nums[mid]==target)
                        {
                            return mid;
                        }
                        else if(nums[mid]<target)
                        {
                            left = mid+1;
                        }
                        else
                        {
                            right = mid-1;
                        }
                       
                    }
                    return -1;
                 }
    
}