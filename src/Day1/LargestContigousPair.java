package Day1;

public class LargestContigousPair {
    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 0, 9, 0, 0, 1};
        int max = 0;
        int maxPair = 0;
        for(int index = 0; index < 2; index++) {
            max += arr[index];
        }
        maxPair = Math.max(maxPair, max);
        int left = 0;
        for(int index = 2; index < arr.length; index++) {
            max -= arr[left++];
            max += arr[index];
            maxPair = Math.max(max, maxPair);
        }
        System.out.println(maxPair);
    }
}
