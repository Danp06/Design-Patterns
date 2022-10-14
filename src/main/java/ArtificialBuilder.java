public class ArtificialBuilder extends CharacterBuilder{
    /**
     *
     */
    @Override
    public void buildName() {
        x.name("Bmo");
    }

    /**
     *
     */
    @Override
    public void buildAge() {
        x.age(999);
    }

    /**
     *
     */
    @Override
    public void buildHeight() {
        x.height(2);
    }

    /**
     *
     */
    @Override
    public void buildWeight() {
        x.weight(198);
    }

    /**
     *
     */
    @Override
    public void buildSex() {
        x.sex(Sex.NONE);
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
