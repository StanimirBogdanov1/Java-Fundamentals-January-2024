package EE_List_Exe_5_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class d_ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command=scanner.nextLine();


        while(!command.equals("End")){
            String[] commandPartS=command.split(" ");


            if(command.contains("Add")){
                int numberCommand=Integer.parseInt(commandPartS[1]);
                numberList.add(numberCommand);

            }else if(command.contains("Insert")){
                int numberCommand=Integer.parseInt(commandPartS[1]);
                int indexCommand=Integer.parseInt(commandPartS[2]);
                if(indexCommand>=numberList.size()){
                    System.out.println("Invalid index");

                }else {
                    numberList.add(indexCommand,numberCommand);
                }


            }else if(command.contains("Remove")){
                int index=Integer.parseInt(commandPartS[1]);
                if(index>=numberList.size()){
                    System.out.println("Invalid index");

                }else {
                    numberList.remove(index);
                }


            }else if(command.contains("right")){

                int right=Integer.parseInt(commandPartS[2]);
                for(int i=1;i<=right;i++){
                    int lastNum = numberList.get(numberList.size()-1);
                    numberList.remove(numberList.size()-1);
                    numberList.add(0,lastNum);
                }


            }else if(command.contains("left")){
                int left=Integer.parseInt(commandPartS[2]);

                for(int i=1;i<=left;i++){
                    int firstNum=numberList.get(0);
                    numberList.remove(0);
                    numberList.add(firstNum);
                }

            }



            command=scanner.nextLine();
        }


        for(int element:numberList){
            System.out.print(element+" ");
        }

    }
}
