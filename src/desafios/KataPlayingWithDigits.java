package desafios;

public class KataPlayingWithDigits {
    public static long digPow(int n, int p){
        char[] nArr = Integer.toString(n).toCharArray();
        long nSum = 0;

        for(int i = 0; i < nArr.length; i++){
            long digit = nArr[i] - '0';

            nSum += (long) Math.pow(digit, (p + i));
        }

        if(nSum % n == 0){
            return nSum / n;
        }

        return -1;
    }
}
