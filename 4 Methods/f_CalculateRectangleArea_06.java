package D_Methods_4;

import java.util.Scanner;

public class f_CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int side1=Integer.parseInt(scanner.nextLine());
        int side2=Integer.parseInt(scanner.nextLine());

        int area=areaOfRectangle(side1,side2);
        System.out.println(area);

    }

    public static int areaOfRectangle(int side1,int side2){

        int area=side1*side2;

        return area;
    }

}
