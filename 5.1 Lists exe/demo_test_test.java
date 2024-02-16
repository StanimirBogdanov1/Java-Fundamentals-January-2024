package EE_List_Exe_5_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo_test_test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // left {index}  or  right {index}
        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();

        while (!command.equals("end")){
            String[] commandParts=command.split(" ");
            String commandName=commandParts[0];

            if(commandName.equals("left")){
//Ако command e left {index} колкото е indexa толкова местения правим на ляво -List
                int commandLeftTimes=Integer.parseInt(commandParts[1]);
                for(int count=1;count<=commandLeftTimes;count++){
                    int getFirstNumberBecomeLast=numberList.get(0);
                    numberList.remove(0);
                    numberList.add(getFirstNumberBecomeLast);
                }

            }else if(commandName.equals("right")){
//Ако command e right {index} колкото е indexa толкова местения правим на дясно -List
                int commandRightTimes=Integer.parseInt(commandParts[1]);
                for(int count=1;count<=commandRightTimes;count++){
                    int getLastNumberBecomeFirst=numberList.get(numberList.size()-1);
                    numberList.remove(numberList.size()-1);
                    numberList.add(0,getLastNumberBecomeFirst);
                }

            }

            System.out.println(numberList.toString().replace("[","").replace("]","").replace(",",""));

            command=scanner.nextLine();
        }





    }
}
