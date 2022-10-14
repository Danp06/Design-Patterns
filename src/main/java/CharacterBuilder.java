public abstract class CharacterBuilder {
    protected Character x;

    public void CreateNewCharacter(){
        x = new Character();
    }

    public Character getX(){
        return x;
    }

    @Override
    public String toString() {
        return "CharacterBuilder{" +
                "character=" + x + '}';
    }

    public abstract void buildName();
    public abstract void buildAge();
    public abstract void buildHeight();
    public abstract void buildWeight();
    public abstract void buildSex();
    public abstract void buildLeague(Leagues leagues);
    public abstract void buildFeatures(Features features);
}
