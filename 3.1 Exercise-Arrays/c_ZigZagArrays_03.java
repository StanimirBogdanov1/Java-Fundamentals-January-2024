package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class c_ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int input=Integer.parseInt(scanner.nextLine());

        int[] numArr1=new int[input];
        int[] numArr2=new int[input];

        for(int i=0;i<=input-1;i++){

            // ima i drug primer WIJTE MIN REZULTAT W JUDJE
            int[] currentArr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if(i%2==0){
                numArr1[i]=currentArr[0];
                numArr2[i]=currentArr[1];
            }else if(i%2==1){
                numArr1[i]=currentArr[1];;
                numArr2[i]=currentArr[0];;
            }
        }

        for(int arr1:numArr1){
            System.out.print(arr1+" ");
        }
        System.out.println();
        for(int arr2:numArr2){
            System.out.print(arr2+" ");
        }


    }
}
