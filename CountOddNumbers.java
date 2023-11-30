// Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
// Example 1:

// Input: low = 3, high = 7
// Output: 3
// Explanation: The odd numbers between 3 and 7 are [3,5,7].
// Example 2:

// Input: low = 8, high = 10
// Output: 1
// Explanation: The odd numbers between 8 and 10 are [9].

public class CountOddNumbers {
    public int countOdds(int low, int high) {
        if(low%2==0&&high%2==0){
            return (high-low)/2;
        }
        else{
            return (high-low)/2+1;
        }
    }



    public int countOdds1(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){ 
            if(i%2!=0){
                count++;
             }
        }
        return count;
    }
    public static void main(String[] args) {
        CountOddNumbers c=new CountOddNumbers();
        System.out.println(c.countOdds(0, 10000000));
    }
}
