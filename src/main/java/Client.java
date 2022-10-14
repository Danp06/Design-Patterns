import java.util.Scanner;

public class Client {

    final public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args)
    {
        Game game1 = new Game(), game2 = new Game() ;

        CharacterBuilder A = null, C = null;
        FeaturesBuilder B = null, D = null;
        Leagues X = null;


        System.out.println("\t.:TYPES OF CHARACTER:.\n1.Human\n2.SuperHuman\n3.Artificial\n4.Alien\n" +
                "Select the type of character you want to build:");
        int type = entrada.nextInt();

        switch (type){
            case 1: A = new HumanBuilder();
                    B = new FeaturesHumanBuilder();
                    C = new AlienBuilder();
                    D = new FeaturesAlienBuilder();
                break;
            case 2: A = new SuperHumanBuilder();
                    B = new FeaturesSuperHumanBuilder();
                    C = new AlienBuilder();
                    D = new FeaturesAlienBuilder();
                break;
            case 3: A = new ArtificialBuilder();
                    B = new FeaturesArtificialBuilder();
                    C = new AlienBuilder();
                    D = new FeaturesAlienBuilder();
                break;
            case 4: A = new AlienBuilder();
                    B = new FeaturesAlienBuilder();
                    C = new SuperHumanBuilder();
                    D = new FeaturesSuperHumanBuilder();
                break;
            default:break;
        }

        System.out.println("\t.:TYPES OF CHARACTER:.\n1.Neutral\n2.Hero\n3.Villian\n" +
                "Select the type of league you want to be:");
        int lig = entrada.nextInt();

        switch (lig){
            case 1: X = Leagues.NEUTRAL;
                break;
            case 2: X = Leagues.HERO;
                break;
            case 3: X = Leagues.VILLAIN;
                break;
            default:break;
        }

        game1.setCharacterBuilder(A);
        game1.setFeaturesBuilder(B);
        game2.setCharacterBuilder(game1.Enemy(C));
        game2.setFeaturesBuilder(D);

        game1.buildFeature();
        game1.buildCharacter(X);
        game2.buildFeature();
        game2.buildCharacter(Leagues.VILLAIN);

        System.out.println("Character created: " +game1.getCharacter());
        System.out.println("The enemy of " + game1.getCharacter().getName() + " is: " + game2.getCharacter());
    }
}
