import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlienBuilderTest {

    Character character =new Character();
    Game game1 = new Game() ;

    CharacterBuilder A = null;
    FeaturesBuilder B = null;

    AlienBuilder characterExpect = new AlienBuilder();
    FeaturesAlienBuilder featuresExpect = new FeaturesAlienBuilder();

    @Test
    public void buildName() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getName(),"Alberto");
    }

    @Test
    public void buildAge() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getAge(),20);
    }

    @Test
    public void buildHeight() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        game1.getFeatures().toString();
        assertEquals(game1.getCharacter().getHeight(),1.80);
    }

    @Test
    public void buildWeight() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getWeight(),70);
    }

    @Test
    public void buildSex() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getSex(),Sex.FEMENINO);
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