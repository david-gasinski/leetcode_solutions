import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] input = {3,2,4};
        System.out.println("> Input: " + Arrays.toString(input));
        int target = 6;
        System.out.println("> Target: " + target);
        int[] solution = twoSum(input, target);
        System.out.println("> Output: " + Arrays.toString(solution));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] solution = new int[2];
        //looping through array
        for (int i = 0; i < nums.length ; i++){
            for (int j = 0; j < nums.length; j++){
                if ((nums[i] + nums[j] == target) && (i != j)){
                    solution[0] = j;
                    solution[1] = i;
                }
            }
        }
        return solution;
    }
}