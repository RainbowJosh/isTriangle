/* Programmer: Josh Phillips
    Date: 10/16/2018
Purpose: This program is to determine if the proposed triangle is actually a real
triangle, then it will take the triangle and compute the area.
*/
package lab6;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double height = 0;
        //Scanner input to take user input for all of the triangle sides
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of the Triangle: ");
        length = input.nextDouble();
        System.out.print("Please enter the width of the Triangle: ");
        width = input.nextDouble();
        System.out.print("Please enter the height of the Triangle: ");
        height = input.nextDouble();
        //initialization of the doubles to be used in area method.
        double s1 = length;
        double s2 = width;
        double s3 = height;
        //Output of the program depending on if the result is true or false.
        if (isTriangle(length, width, height) == true) {
            System.out.println("That is a Valid Triangle");
            System.out.println("The area of the Triangle is: " + area(s1, s2, s3));
        } else {
            System.out.println("That is not a Valid Triangle");
        }
    }
    //new isTriangle method to determine if the proposed sides create a triangle.    
    public static boolean isTriangle(double length, double width, double height) {
        if (length + width >= height && width + height >= length && length + height >= width) {
            return true;
        } else {
            return false;
        }
    }
    //This method is to compute the area of the triangle
    public static double area(double s1, double s2, double s3) {
        double s = 0;
        double area = 0;

        s = ((s1 + s2 + s3) / 2);
        area = (2 * Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)));
        return area;

    }
}
