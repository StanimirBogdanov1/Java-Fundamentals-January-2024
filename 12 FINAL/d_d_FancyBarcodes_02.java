package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d_d_FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int numberBarcode=Integer.parseInt(scanner.nextLine());

        String regex="([@][#]+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])([@][#]+)";

        for(int number=1;number<=numberBarcode;number++){
            String inputBarcode=scanner.nextLine();

            Pattern barcodePattern = Pattern.compile(regex);
            Matcher barcodeMatcher =barcodePattern.matcher(inputBarcode);



            if(barcodeMatcher.find()){
                StringBuilder productBuilder=new StringBuilder();
                String product=barcodeMatcher.group("barcode");
                for(char symbol:product.toCharArray()){
                    if(Character.isDigit(symbol)){
                        productBuilder.append(symbol);
                    }
                }
                if(productBuilder.length()>0) {
                    System.out.println("Product group: " + productBuilder.toString());
                }else{
                    System.out.println("Product group: 00");
                }

            }else{
                System.out.println("Invalid barcode");
            }



        }


    }
}
