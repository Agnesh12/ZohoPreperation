package Day1;

public class pattern1 {
    public static void main(String[] args) {
        int len = 5;
        for(int outer = 1; outer <= len; outer++) {
            int temp = outer;
            int tempLen = len - 1;
            for(int inner = 1; inner <= outer; inner++) {
                System.out.print(temp + " ");
                temp = temp + tempLen;
                tempLen--;
            }
            System.out.println();
        }
    }
}
