package EE_List_Exe_5_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class b_ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command=scanner.nextLine();

        while (!command.equals("end")){

            if(command.contains("Delete")){
                int numberCommand=Integer.parseInt(command.split(" ")[1]);

                for(int index=0;index<numberList.size();index++){

                    //way 1
//                    if(numberList.get(index)==numberCommand){
//                        numberList.remove(index);
//                        index--;
//                    }
                    // way 2
                    numberList.remove(Integer.valueOf(numberCommand));

                }

            }else if(command.contains("Insert")){
                int element=Integer.parseInt(command.split(" ")[1]);
                int position=Integer.parseInt(command.split(" ")[2]);
                numberList.add(position,element);
            }


            command=scanner.nextLine();
        }


        for(int elements:numberList){

            System.out.print(elements+" ");
        }
    }
}
