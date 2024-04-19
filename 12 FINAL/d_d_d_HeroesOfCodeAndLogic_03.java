package L_FINAL_EXAM_oldsExe_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class d_d_d_HeroesOfCodeAndLogic_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int countHeroes=Integer.parseInt(scanner.nextLine());

        Map<String,Integer> heroHealthMap = new LinkedHashMap<>();
        Map<String,Integer> heroManaMap = new LinkedHashMap<>();

        for(int numberHero=1;numberHero<=countHeroes;numberHero++){
            String[] heroes = scanner.nextLine().split(" ");
            String name=heroes[0];
            int healthPoint=Integer.parseInt(heroes[1]);
            int manaPoint=Integer.parseInt(heroes[2]);

            heroHealthMap.put(name,healthPoint);
            heroManaMap.put(name,manaPoint);
        }


        System.out.println();
        String command=scanner.nextLine();

        while (!command.equals("End")){
            // CastSpell – {hero name} – {MP needed} – {spell name}
            String[] commandParts= command.split(" - ");
            String commandName=commandParts[0];
            String heroName=commandParts[1];

            switch (commandName){
                case "CastSpell":
                    int mpNeeded=Integer.parseInt(commandParts[2]);
                    String spellName=commandParts[3];

                    int existingMp = heroManaMap.get(heroName);
                    if(existingMp>=mpNeeded){
                        heroManaMap.put(heroName,existingMp-mpNeeded);
                        int existMp=heroManaMap.get(heroName);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",heroName,spellName,existMp);
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!\n",heroName,spellName);
                    }


                    break;
                case "TakeDamage":
                    int damage =Integer.parseInt(commandParts[2]);
                    String attacker =commandParts[3];

                    int existingHp=heroHealthMap.get(heroName);
                    int remainingHp=existingHp-damage;
                    if(remainingHp>0){
                        heroHealthMap.put(heroName,remainingHp);
                        int currentHp=heroHealthMap.get(heroName);

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",heroName,damage,attacker,currentHp);
                    }else{
                        heroHealthMap.remove(heroName);
                        heroManaMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n",heroName,attacker);
                    }

                    break;
                case "Recharge":
                    int amountMana= Integer.parseInt(commandParts[2]);

                    int existingManaPoint=heroManaMap.get(heroName);
                    int totalMana=existingManaPoint+amountMana;

                    if(totalMana<=200){
                        heroManaMap.put(heroName,totalMana);
                        System.out.printf("%s recharged for %d MP!\n",heroName,amountMana);
                    }else{
                        int addMana= 200-existingManaPoint;
                        heroManaMap.put(heroName,200);
                        System.out.printf("%s recharged for %d MP!\n",heroName,addMana);
                    }


                    break;
                case "Heal":
                    int amountHealth=Integer.parseInt(commandParts[2]);

                    int existingHealthPoint=heroHealthMap.get(heroName);
                    int totalHealth=existingHealthPoint+amountHealth;

                    if(totalHealth<=100){
                        heroHealthMap.put(heroName,totalHealth);
                        System.out.printf("%s healed for %d HP!\n",heroName,amountHealth);
                    }else{
                        int addHealth= 100-existingHealthPoint;
                        heroHealthMap.put(heroName,100);
                        System.out.printf("%s healed for %d HP!\n",heroName,addHealth);
                    }



                    break;
            }




            command=scanner.nextLine();
        }



        //ИМАМ ДВА МАПА като ключовете им са едни и същи
        // МАПОВЕТЕ СА  ->>>   heroHealthMap (heroName -> heroHealth) и heroManaMap(heroName -> heroMana)
        // маповете съдържат тези стойности  долу      |
         /*         heroHealthMap                                  heroManaMap
              KEY(name)  ->  VALUE(health-point)             KEY(name)  ->  VALUE(mana-point)
             Adela       ->    90                           Adela       ->    200
             SirMullich  ->   100                           SirMullich  ->   40
          */
        // тук предлагаме 2 начина за тяхното обхождане
        // начин 1
//        for(Map.Entry<String,Integer> pair: heroHealthMap.entrySet()){
//            String name=pair.getKey();
//            int hp=pair.getValue();
//            int mp=heroManaMap.get(name);
//
//            System.out.println(name);
//            System.out.printf("  HP: %d\n",hp);
//            System.out.printf("  MP: %d\n",mp);
//        }
        // начин 2
        heroHealthMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.printf("  HP: %d\n",entry.getValue());
            System.out.printf("  MP: %d\n",heroManaMap.get(entry.getKey()));
        });



    }
}
