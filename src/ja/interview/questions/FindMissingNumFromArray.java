package ja.interview.questions;
/*
Approach: The length of the array is n-1. So, sum of numbers from 1 to n
can be calculated using the formula n*(n+1)/2. Now find the sum of all the
 elements in the array and subtract it from
 the sum of the first n natural numbers,
  it will give us the value of the missing element.
 */
public class FindMissingNumFromArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 6 };
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++) {
            sum -= nums[i];
        }
        System.out.println(sum);
    }

}
