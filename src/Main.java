import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(numberIncrease());

    }
    public static int numberIncrease(){
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        n++;
        return n;
    }
}
