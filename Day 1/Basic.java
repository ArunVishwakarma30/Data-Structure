import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter radius of Circle to calculate area : ");
        // double rad = input.nextDouble();
        Program obj = new Program();
        // System.out.println("Area of circle is : " + obj.circleArea(rad));

        // 1st n Fibonacci Series
        // System.out.print("Enter the size of the fibonacci series you want to print : ");
        int size = input.nextInt();
        // int[] result = obj.nFibSeries(size);
        // System.out.println(Arrays.toString(result));

        // System.out.println("There sum is : " + obj.sumOfnFib(size));
        // sum of 1st n fib series

        System.out.println(obj.subtractProductAndSum(size));
        input.close();

    }
}

class Program {
    double circleArea(double radi) {
        double area = 3.14 * radi * radi;
        return area;
    }

    // 1st n Fibonacci Series
    int[] nFibSeries(int size) {

        if (size <= 0) {
            return new int[0]; // Return an empty array for size <= 0
        } else if (size == 1) {
            return new int[] { 0 }; // Return an array with a single element for size = 1
        }

        int[] series = new int[size];
        int n1 = 0;
        int n2 = 1;
        series[0] = n1;
        series[1] = n2;

        for (int i = 2; i < series.length; i++) {
            int n3 = n1 + n2;
            series[i] = n3;
            n1 = n2;
            n2 = n3;
        }
        return series;
    }

    // sum of 1st n fibonacci series
    int sumOfnFib(int size) {
        int[] series = nFibSeries(size);
        System.out.println("The 1st " + size + " fib series are " + Arrays.toString(series));
        int sum = 0;
        for (int i = 0; i < series.length; i++) {
            sum += series[i];
        }
        return sum;
    }

    // 22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
    int subtractProductAndSum(int num){
        int product = 1;
        int sum = 0;
        while (num > 0) {
            int rem = num%10;
            sum += rem;
            product *= rem;
            num /= 10;
        }
        return product - sum;
    }


}
