import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(numberIncrease());
        System.out.print(numbersMultiply());
        System.out.print(numberDecrease());

    }
    public static int numberIncrease(){
        System.out.print("Enter a number to increase: ");
        int n = input.nextInt();
        n++;
        return n;
    }

    public static int numbersMultiply(){
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();
        int sum = (n1 * n2);
        return sum;
    }

    public static int numberDecrease(){
        System.out.print("Enter a number to decrease: ");
        int n = input.nextInt();
        n--;
        return n;
    }
}
