package Day1;

public class DiamondPattern {
    public static void Diamond(int len) {
        for(int outer = 1; outer <= len; outer++) {
            for(int space = len - 1; space >= outer; space--) {
                System.out.print(" ");
            }
            for(int inner = 0; inner < outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int outer = len - 1; outer >= 0; outer--) {
            for(int space = len - 1; space > outer; space--) {
                System.out.print(" ");
            }
            for(int inner = 0; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int len = 6;
        Diamond(len);
    }
}
