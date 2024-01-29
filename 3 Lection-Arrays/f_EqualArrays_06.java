package C_ArraysLab_3;

import java.util.Arrays;
import java.util.Scanner;

public class f_EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] num1Arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] num2Arr =Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int lengthArr1=num1Arr.length;
     //   int lengthArr2=num2Arr.length;



        int sum=0;
        for(int possitionArr1=0;possitionArr1<lengthArr1;possitionArr1++){


            if(num1Arr[possitionArr1]!=num2Arr[possitionArr1]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",possitionArr1);
                return;
            }else if(num1Arr[possitionArr1]==num2Arr[possitionArr1]){
                sum+=num1Arr[possitionArr1];
            }

        }

        System.out.printf("Arrays are identical. Sum: %d",sum);




    }
}
