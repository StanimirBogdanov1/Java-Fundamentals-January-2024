package I_AssociativeArrays_8;

import java.util.*;
import java.util.stream.Collectors;

public class a_CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        // 2 3 3 2 2 2
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        // празен map
        Map<Integer,Integer> integerMap= new TreeMap<>();



        for(int number:numbersList){

            if(!integerMap.containsKey(number)){
                integerMap.put(number,1);
            }else{
                int currentNum=integerMap.get(number);
                integerMap.put(number,currentNum+1);
            }

        }


        for(Map.Entry<Integer,Integer> pair: integerMap.entrySet()){
            System.out.println(pair.getKey()+ " -> "+ pair.getValue());
        }




    }
}
