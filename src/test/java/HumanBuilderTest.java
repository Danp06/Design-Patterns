import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanBuilderTest {

    Character character =new Character();
    Game game1 = new Game() ;

    CharacterBuilder A = null;
    FeaturesBuilder B = null;

    HumanBuilder characterExpect = new HumanBuilder();
    FeaturesHumanBuilder featuresExpect = new FeaturesHumanBuilder();

    @Test
    public void buildName() {
        game1.setCharacterBuilder(A = characterExpect);
        game1.setFeaturesBuilder(B = featuresExpect);
        game1.buildFeature();
        game1.buildCharacter(Leagues.NEUTRAL);
        assertEquals(game1.getCharacter().getName(),"Daniel");
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
        assertEquals(game1.getCharacter().getHeight(),1.75);
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
        assertEquals(game1.getCharacter().getSex(),Sex.MASCULINO);
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