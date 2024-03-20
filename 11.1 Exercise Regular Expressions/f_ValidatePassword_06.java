package K_K_RegularExpressionsExercises_10_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f_ValidatePassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputNumbers=Integer.parseInt(scanner.nextLine());
        String regex="_[\\.]+(?<group>[A-Z][A-Za-z0-9]{4,}[A-Z])_[\\.]+";

        Pattern pattern = Pattern.compile(regex);

        for(int count=1;count<=inputNumbers;count++){
            String passwordInput=scanner.nextLine();
            Matcher matcher =pattern.matcher(passwordInput);

            if(matcher.find()){
                String pass=matcher.group("group");

                StringBuilder builderNumbers=new StringBuilder();
                for(char symbols:pass.toCharArray()){
                    if(Character.isDigit(symbols)){
                        builderNumbers.append(symbols);
                    }
                }
                if(builderNumbers.length()==0){
                    System.out.println("Group: default");
                }else{
                    System.out.println("Group: "+builderNumbers.toString());
                }

            }else{
                System.out.println("Invalid pass!");
            }



        }


    }
}
