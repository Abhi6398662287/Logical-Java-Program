public class Jtc2{
    public static void main(String[] args) {
        int n = 7; // Change 'n' to the desired number of terms

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int term = i * i * (i % 2 == 0 ? -1 : 1);
            sum += term;
        }

        System.out.println("Sum of the series: " + sum);
    }
}
