public class Game implements IFicha{
    private CharacterBuilder characterBuilder;
    private FeaturesBuilder featuresBuilder;

    public void setCharacterBuilder(CharacterBuilder x) {
        this.characterBuilder = x;
    }
    public void setFeaturesBuilder(FeaturesBuilder x) {
        this.featuresBuilder = x;
    }

    public Character getCharacter() {
        return characterBuilder.getX();
    }
    public Features getFeatures() {
        return featuresBuilder.getFeatures();
    }

    public void buildCharacter(Leagues x){
        characterBuilder.CreateNewCharacter();
        characterBuilder.buildName();
        characterBuilder.buildAge();
        characterBuilder.buildHeight();
        characterBuilder.buildWeight();
        characterBuilder.buildSex();
        characterBuilder.buildLeague(League(x));
        characterBuilder.buildFeatures(Add(buildFeature()));
    }

    public Features buildFeature(){
        featuresBuilder.CreateNewFeatures();
        featuresBuilder.buildSkills();
        featuresBuilder.buildPowers();
        featuresBuilder.buildPersonalities();
        featuresBuilder.buildWeapons();
        featuresBuilder.buildWeakness();
        return featuresBuilder.getFeatures();
    }

    @Override
    public Features Add(Features x) {
        return x;
    }

    /**
     * @param x the liga
     * @return the league
     */
    @Override
    public Leagues League(Leagues x) {
        return x;
    }

    /**
     * @param x the x
     * @return The enemy of main character
     */
    @Override
    public CharacterBuilder Enemy(CharacterBuilder x) {
        return x;
    }
}
