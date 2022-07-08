import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, power,total=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number for power: ");
        number= inp.nextInt();

        System.out.println("Enter number's power : ");
        power =inp.nextInt();

        for (int i = 1; i <= power; i++)      {
            total*=number;
        } System.out.println("Answer = "+total);
    }
}