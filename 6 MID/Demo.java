package F_MID_Exams;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] houses=Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String inputCommand=scanner.nextLine();

        int currentIndex=0;

        while (!inputCommand.equals("Love!")) {
            String[] tokens = inputCommand.split("\\s+");
            int jumpLength = Integer.parseInt(tokens[1]);



            currentIndex+=jumpLength;
            if(currentIndex>=houses.length){
                currentIndex=0;
            }

            if(houses[currentIndex]!=0) {
                houses[currentIndex] = houses[currentIndex] - 2;
                if (houses[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            }else{
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }




            inputCommand=scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);

        boolean isSuccesTrue=true;

        int count = 0;
        for(int element:houses){
            if(element !=0){
                isSuccesTrue=false;
                count++;
                break;
            }
            count++;
        }

        if (isSuccesTrue) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }



    }
}
