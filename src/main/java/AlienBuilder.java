public class AlienBuilder extends CharacterBuilder {

    /**
     *
     */
    @Override
    public void buildName() {
        x.name("Alberto");
    }

    /**
     *
     */
    @Override
    public void buildAge() {
        x.age(20);
    }

    /**
     *
     */
    @Override
    public void buildHeight() {
        x.height(1.80);
    }

    /**
     *
     */
    @Override
    public void buildWeight() {
        x.weight(70);
    }

    /**
     *
     */
    @Override
    public void buildSex() {
        x.sex(Sex.FEMENINO);
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
