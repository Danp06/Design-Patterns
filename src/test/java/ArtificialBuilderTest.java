import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtificialBuilderTest {

    Character character =new Character();
    Game game1 = new Game() ;

    CharacterBuilder A = null;
    FeaturesBuilder B = null;

    ArtificialBuilder characterExpect = new ArtificialBuilder();
    FeaturesArtificialBuilder featuresExpect = new FeaturesArtificialBuilder();

    @Test
    public void buildName() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getName(),"Bmo");
    }

    @Test
    public void buildAge() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getAge(),999);
    }

    @Test
    public void buildHeight() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        A.toString();
        assertEquals(game1.getCharacter().getHeight(),2);
    }

    @Test
    public void buildWeight() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getWeight(),198);
    }

    @Test
    public void buildSex() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        game1.Enemy(A);
        assertEquals(game1.getCharacter().getSex(),Sex.NONE);
    }

    @Test
    public void buildLeague() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getLeague(),Leagues.NEUTRAL);
    }

    @Test
    public void buildFeatures() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        game1.getCharacter().toString();
        assertEquals(game1.getCharacter(),game1.getCharacter());
    }
}