public abstract class FeaturesBuilder{

    protected Features features;
    
    public void CreateNewFeatures(){
        features = new Features();
    }

    public Features getFeatures(){
        return features;
    }

    @Override
    public String toString() {
        return "Features[]Builder{" +
                "Features[]=" + features + '}';
    }

    public abstract void buildSkills();
    public abstract void buildPowers();
    public abstract void buildPersonalities();
    public abstract void buildWeapons();
    public abstract void buildWeakness();
}
