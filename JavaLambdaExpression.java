interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here

    public static PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return num -> num > 1 && java.util.stream.IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }

    public static PerformOperation isPalindrome() {
        return num -> String.valueOf(num).equals(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

}
