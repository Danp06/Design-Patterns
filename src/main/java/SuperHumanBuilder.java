public class SuperHumanBuilder extends CharacterBuilder{

    /**
     *
     */
    @Override
    public void buildName() {
        x.name("Hercules");
    }

    /**
     *
     */
    @Override
    public void buildAge() {
        x.age(27);
    }

    /**
     *
     */
    @Override
    public void buildHeight() {
        x.height(1.95);
    }

    /**
     *
     */
    @Override
    public void buildWeight() {
        x.weight(110);
    }

    /**
     *
     */
    @Override
    public void buildSex() {
        x.sex(Sex.MASCULINO);
    }

    /**
     *
     */
    @Override
    public void buildLeague(Leagues leagues) {
        x.leagues(leagues);
    }

    /**
     *
     */
    @Override
    public void buildFeatures(Features features)  {
        x.feature(features);
    }
}
