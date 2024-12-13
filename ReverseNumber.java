public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = System.in.read() - '0';
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed Number: " + reversedNum);
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}

