public abstract class Plant implements IPlantActions{
    private String Name;
    private int growthTime;
    private boolean isHarvestable;

    public Plant(String name, int growthTime) {
        this.Name = name;
        this.growthTime = growthTime;
        this.isHarvestable=false;
    }

    public boolean isHarvestable() {
        return isHarvestable;
    }
    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }

    public void setHarvestable(boolean harvestable) {
        isHarvestable = harvestable;
    }

    public String getName() {
        return Name;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public abstract void grow() ;
}
