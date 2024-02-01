package D_Methods_4;

import java.util.Scanner;

public class e_Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String product=scanner.nextLine();
        int quantity=Integer.parseInt(scanner.nextLine());

        totalSumProduct(product,quantity);

    }

    public static void totalSumProduct(String product,int quantity){

        double totalPriceProduct=0.00;
        if(product.equals("coffee")){
            totalPriceProduct=quantity*1.50;

        }else if(product.equals("water")){
            totalPriceProduct=quantity*1.00;

        }else if(product.equals("coke")){
            totalPriceProduct=quantity*1.40;

        }else if(product.equals("snacks")){
            totalPriceProduct=quantity*2.00;

        }
        System.out.printf("%.2f",totalPriceProduct);


    }

}
