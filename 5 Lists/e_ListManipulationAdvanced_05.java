package E_Lists_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e_ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2 13 43 876 342 23 543

        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String command=scanner.nextLine();

        while(!command.equals("end")){
            String[] commandPartArray=command.split(" ");


            List<Integer> printList=new ArrayList<>();
            int sum=0;
            if(command.contains("Contains")){
                int numberIs=Integer.parseInt(commandPartArray[1]);
                if(numberList.contains(numberIs)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No such number");
                }
            }else if(command.contains("Print even")){
                for(int elements:numberList){
                    if(elements%2 ==0){
                        printList.add(elements);
                    }
                }
                for(int element:printList){
                    System.out.print(element+" ");
                }
                System.out.println();
                printList.clear();

            }else if(command.contains("Print odd")){
                for(int elements:numberList){
                    if(elements%2 !=0){
                        printList.add(elements);
                    }
                }
                for(int element:printList){
                    System.out.print(element+" ");
                }

                System.out.println();
                printList.clear();

            }else if(command.contains("Get sum")){
                for(int element:numberList){
                    sum+=element;
                }
                System.out.println(sum);
            }else if(command.contains("Filter")){
                String contitionCommand=commandPartArray[1];
                int numberFromCommand=Integer.parseInt(commandPartArray[2]);
                if(contitionCommand.equals(">")){
                    for(int element:numberList){
                        if(element>numberFromCommand){
                            printList.add(element);
                        }
                    }
                    for(int elementt:printList){
                        System.out.print(elementt+" ");
                    }
                    System.out.println();
                    printList.clear();

                }else if(contitionCommand.equals(">=")){
                    for(int element:numberList){
                        if(element>=numberFromCommand){
                            printList.add(element);
                        }
                    }
                    for(int elementt:printList){
                        System.out.print(elementt+" ");
                    }
                    System.out.println();
                    printList.clear();

                }else if(contitionCommand.equals("<")){
                    for(int element:numberList){
                        if(element<numberFromCommand){
                            printList.add(element);
                        }
                    }
                    for(int elementt:printList){
                        System.out.print(elementt+" ");
                    }
                    System.out.println();
                    printList.clear();

                }else if(contitionCommand.equals("<=")){
                    for(int element:numberList){
                        if(element>=numberFromCommand){
                            printList.add(element);
                        }
                    }
                    for(int elementt:printList){
                        System.out.print(elementt+" ");
                    }
                    System.out.println();
                    printList.clear();

                }


            }



            command=scanner.nextLine();
        }

    }
}
