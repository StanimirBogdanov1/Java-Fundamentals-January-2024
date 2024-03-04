package I_AssociativeArrays_8;

import java.util.*;

public class c_OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] wordsArr=scanner.nextLine().toLowerCase().split(" ");

        Map <String,Integer> oddNumberWordsMap=new LinkedHashMap<>();



        for(String word:wordsArr){

            if(!oddNumberWordsMap.containsKey(word)){
                oddNumberWordsMap.put(word,1);
            }else{
                int currentNumber=oddNumberWordsMap.get(word);
                oddNumberWordsMap.put(word,currentNumber+1);

            }

        }


        System.out.println();

        List<String> oddWordsList =new ArrayList<>();

        for(Map.Entry<String,Integer> pair: oddNumberWordsMap.entrySet() ){

            if(pair.getValue()%2==1){
                oddWordsList.add(pair.getKey());
            }

        }


        System.out.println(oddWordsList.toString().replace("[","").replace("]",""));

    }
}
