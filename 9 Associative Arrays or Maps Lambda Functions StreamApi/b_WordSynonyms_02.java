package I_AssociativeArrays_8;

import java.util.*;

public class b_WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputNum=Integer.parseInt(scanner.nextLine());

        Map<String, List<String> > synonymsMap = new LinkedHashMap<>();

        for(int countNum=1;countNum<=inputNum;countNum++){
            String word =scanner.nextLine();
            String synonym=scanner.nextLine();


            // 2 warianta

            synonymsMap.putIfAbsent(word,new ArrayList<>());

            synonymsMap.get(word).add(synonym);

//            if(!synonymsMap.containsKey(word)){
//                synonymsMap.put(word,new ArrayList<>());
//                synonymsMap.get(word).add(synonym);
//            }else{
//                synonymsMap.get(word).add(synonym);
//            }




        }


        for(Map.Entry<String,List<String> > pair:synonymsMap.entrySet()){


            System.out.printf("%s - %s\n",pair.getKey(),String.join(", ",pair.getValue()));
        }

    }
}
