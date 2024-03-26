package L_FINAL_EXAM_oldsExe_11;

import java.util.*;

public class a_a_a_ThePianist_way2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pianoMap = new LinkedHashMap<>();

        for (int pieces = 1; pieces <= n ; pieces++) {
            //"{piece}|{composer}|{key}".
            String [] song = scanner.nextLine().split("\\|");
            List<String> info = new ArrayList<>();
            String piece = song[0];
            String composer = song[1];
            String key = song[2];
            info.add(composer);
            info.add(key);
            pianoMap.put(piece, info);
        }


        System.out.printf("");
        String  command = scanner.nextLine();
        while(!command.equals("Stop")) {

            String [] commandParts = command.split("\\|");
            String commandName = commandParts[0];


            switch (commandName) {
                case "Add":
                    String piece = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];
                    //Add|{piece}|{composer}|{key}
                    if(!pianoMap.containsKey(piece)) {
                        List<String> info = new ArrayList<>();
                        info.add(composer);
                        info.add(key);
                        pianoMap.put(piece, info);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece,composer,key );
                    } else{
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;

                case "Remove":
                    //Remove|{piece}
                    String pieceRemove = commandParts[1];
                    if(pianoMap.containsKey(pieceRemove)) {
                        pianoMap.remove(pieceRemove);
                        System.out.printf("Successfully removed %s!%n",pieceRemove);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceRemove);
                    }
                    break;
                case "ChangeKey":
                    //ChangeKey|{piece}|{new key}
                    String pieceChange = commandParts[1];
                    String newKey = commandParts[2];
                    if(pianoMap.containsKey(pieceChange)) {
                        pianoMap.get(pieceChange).set(1, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceChange, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceChange);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : pianoMap.entrySet()) {
            String piece = entry.getKey();
            String composer = entry.getValue().get(0);
            String key = entry.getValue().get(1);
            System.out.println(piece + " -> Composer: " + composer + ", Key: " + key);
        }



    }
}
