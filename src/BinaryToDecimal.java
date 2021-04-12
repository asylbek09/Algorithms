public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "10110";
        System.out.println(decimal(binary));
    }

    static int decimal(String num) {
        int result = 0;
        int end = num.length() - 1;
        for (int i = 0; i <= end; i++) {
            int current = Character.getNumericValue(num.charAt(end - i));
            result += Math.pow(2, i) * current;
        }
        return result;
    }
}