package L_FINAL_EXAM_oldsExe_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class a_a_a_ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
//{piece}|{composer}|{key}
        Map<String,String> pieceComposerMap = new LinkedHashMap<>();
        Map<String,String> pieceKeyMap = new LinkedHashMap<>();

        for(int inputNumber=1;inputNumber<=inputCount;inputNumber++){
            String[] parts = scanner.nextLine().split("\\|");
            String piece = parts[0];
            String composer = parts[1];
            String key = parts[2];

            pieceComposerMap.put(piece,composer);
            pieceKeyMap.put(piece,key);
        }

        String command=scanner.nextLine();

        while(!command.equals("Stop")){
            String[] commandParts=command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName){
                case "Add":
                    // "Add|{piece}|{composer}|{key}":
                    String piece = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];

                    if(!pieceComposerMap.containsKey(piece)){
                        pieceComposerMap.put(piece,composer);
                        pieceKeyMap.put(piece,key);
                        System.out.printf("%s by %s in %s added to the collection!\n",piece,composer,key);
                    }else{
                        System.out.printf("%s is already in the collection!\n",piece);
                    }

                    break;
                case "Remove":
                    //Remove|{piece}"
                    String isExistPiece = commandParts[1];

                    if(pieceComposerMap.containsKey(isExistPiece)){
                        pieceComposerMap.remove(isExistPiece);
                        pieceKeyMap.remove(isExistPiece);
                        System.out.printf("Successfully removed %s!\n",isExistPiece);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",isExistPiece);
                    }

                    break;
                case "ChangeKey":
                    //ChangeKey|{piece}|{new key}":
                    String takePiece= commandParts[1];
                    String newKey = commandParts[2];

                    if(pieceKeyMap.containsKey(takePiece)){
                        pieceKeyMap.put(takePiece,newKey);
                        System.out.printf("Changed the key of %s to %s!\n",takePiece,newKey);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n",takePiece);
                    }

                    break;
            }



            command=scanner.nextLine();
        }

        //{Piece} -> Composer: {composer}, Key: {key}
        for(Map.Entry<String,String> pair: pieceComposerMap.entrySet()){
            String piece=pair.getKey();
            String composer=pair.getValue();
            String key = pieceKeyMap.get(piece);

            System.out.printf("%s -> Composer: %s, Key: %s\n",piece,composer,key);
        }


    }
}
