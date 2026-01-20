package desafios;

public class KataTribonacciSequence {
    public static double[] tribonacci(double[] s, int n){
        double[] result = new double[n];
        System.arraycopy(s, 0, result, 0, Math.min(n, s.length));

        if(result.length < 3){
            return result;
        }

        for(int i = 2; i < n - 1; i++){
            double sum = result[i] + result[i - 1] + result[i - 2];
            result[i + 1] = sum;
        }

        return result;
    }
}