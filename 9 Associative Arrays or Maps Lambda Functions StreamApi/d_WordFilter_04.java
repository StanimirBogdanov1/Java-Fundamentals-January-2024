package I_AssociativeArrays_8;

import java.util.*;

public class d_WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Тук някак си по мой начин...Не е по условие
        // Нямаше нужда от Map но исках да го упражня
        // иначе по условие трябваше само StreamApi следващ пример

//        String[] wordsArr=scanner.nextLine().split(" ");
//
//        Map<String,Integer> oddLenghtWordsMap=new LinkedHashMap<>();
//
//        for(String word : wordsArr){
//            char[] symbols = word.toCharArray();
//            int currentWordSize= symbols.length;
//
//            if(currentWordSize%2==0){
//                oddLenghtWordsMap.put(word,currentWordSize);
//            }
//
//        }
//
//        List<String> oddNumbersWordsList=new ArrayList<>();
//
//        for(Map.Entry<String,Integer> pair:oddLenghtWordsMap.entrySet()){
//            oddNumbersWordsList.add(pair.getKey());
//        }
//
//        for(String elements:oddNumbersWordsList){
//            System.out.println(elements);
//        }



        // Тук със streamApi съкръщаваме с много


        String[] wordsArr=Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length()%2==0)
                .toArray(String[]::new);

        // 1wi wariand sus stream Api otpechatwane nowo
        Arrays.stream(wordsArr).forEach(w -> System.out.println(w));


        // 2 ri wariant obiknowenniq

//        for(String elements:wordsArr){
//            System.out.println(elements);
//        }

    }
}
