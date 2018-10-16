
package lab6;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double height = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of the Triangle: ");
        length = input.nextDouble();
        System.out.print("Please enter the width of the Triangle: ");
        width = input.nextDouble();
        System.out.print("Please enter the height of the Triangle: ");
        height = input.nextDouble();
        if (isTriangle(length, width, height) == true) {
            System.out.println("That is a Valid Triangle");
        } else {
            System.out.println("That is not a Valid Triangle");
        }
    }

    public static boolean isTriangle(double length, double width, double height) {
        if (length + width >= height && width + height >= length && length + height >= width) {
            return true;
        } else {
            return false;
        }
    }
}
