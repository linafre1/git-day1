import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(numberIncrease());

    }
    public static int numberIncrease(){
        System.out.print("Enter a number to increase: ");
        int n = input.nextInt();
        n++;
        return n;
    }

    public static int numberDecrease(){
        System.out.print("Enter a number to decrease: ");
        int n = input.nextInt();
        n--;
        return n;
    }
}
