
// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.util.ArrayList;
public class arrayQues {

    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(arrayQues.buildArray(nums)));

    }

    // Build Array from Permutation
    // Ques -->
    // https://leetcode.com/problems/build-array-from-permutation/description/
    // Solution :
    // []
    // Output: [0,1,2,4,5,3]
    public static int[] buildArray(int[] num) {
        int[] res = new int[num.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = num[num[i]];
        }
        return res;
    }

    // kids with gratest numbers of candies
    // Ques -->
    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    // // solution -->
    // public class candies{

    // public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    // List<Boolean> isTrue = new ArrayList<Boolean>();
    // for(int i=0; i<candies.length; i++){
    // int withExtra = candies[i] + extraCandies;
    // isTrue.add(i, isMax(withExtra, candies));
    // }

    // return isTrue;

    // }

    // public Boolean isMax(int withExtra, int[] candies){
    // Boolean check = true;
    // for(int i=0; i<candies.length; i++){
    // if(candies[i]>withExtra){
    // check = false;
    // break;
    // }
    // }
    // return check;
    // }

    // }

    // How Many Numbers Are Smaller Than the Current Number
    // Ques -->
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
    // solution -->
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int res[] = new int[nums.length];
            // 8, 1, 2, 2, 3
            // out 4, 0, 1, 1, 3

            for (int i = 0; i < nums.length; i++)// 8
            {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {// 8
                    if (nums[i] > nums[j]) {
                        count++;
                    }
                }
                res[i] = count;
            }
            return res;
        }
    }

    // Create Target Array in the Given Order
    // Ques -->
    // https://leetcode.com/problems/create-target-array-in-the-given-order/description/
    // solution -->
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int currentIndex = index[i];
            targetList.add(currentIndex, nums[i]);

        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = targetList.get(i);
        }

        return res;
    }

    // Check if the Sentence Is Pangram
    // Ques -->
    // https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
    // solution -->
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            } else {
                alphabet[ch - 'a'] = false;
            }
        }

        for (boolean i : alphabet) {
            if (!i) {
                return false;
            }

        }
        return true;
    }
}
