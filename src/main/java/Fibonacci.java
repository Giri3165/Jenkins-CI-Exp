public class Fibonacci {

    public int[] getSeries(int n) {
        int[] series = new int[n];
        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            series[i] = first;
            int next = first + second;
            first = second;
            second = next;
        }
        return series;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        for (int number : fibonacci.getSeries(10)) {
            System.out.print(number + " ");
        }
    }
}