import desafios.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(KataDecArrowPinCode.decArrowPinCode("1→↑→")));
        System.out.println(KataPlayingWithDigits.digPow(46288, 3));
        System.out.println(KataPangramChecker.check("The quick brown fox jumps over the lazy dog."));
        System.out.println(Arrays.toString(KataTribonacciSequence.tribonacci(new double[]{1,1,1}, 10)));
    }
}