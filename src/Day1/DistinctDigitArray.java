package Day1;

import java.util.HashSet;

public class DistinctDigitArray {
    HashSet<Integer> ans = new HashSet<>();

    public void Distinct(int num) {
        if (num == 0) {
            ans.add(0);
        }
        while (num != 0) {
            int temp = num % 10;
            ans.add(temp);
            num /= 10;
        }
    }

    public static void main(String[] args) {
        int[] nums = {131, 11, 48};
        DistinctDigitArray obj = new DistinctDigitArray();

        for (int arr : nums) {
            obj.Distinct(arr);  
        }


        int[] newArr = new int[obj.ans.size()];
        int index = 0;
        for (int num : obj.ans) {
            newArr[index++] = num;
        }


        System.out.print("Distinct digits: ");
        for (int digit : newArr) {
            System.out.print(digit + " ");
        }
    }
}
