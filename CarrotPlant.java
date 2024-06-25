public class CarrotPlant extends Plant{
    private int waterLevel;
    public CarrotPlant() {
        super("Havuç", 5);
        this.waterLevel=0;
    }

    @Override
    public void water() {
        if(this.waterLevel< getGrowthTime())
            this.waterLevel++;
        else
            setHarvestable(true);
    }

    @Override
    public void harvest() {
        if(this.waterLevel == getGrowthTime())
            System.out.println(getName() + " PLant has been harvesed. Congratulations!!!!");

        else {
            System.out.println(" Plant is not ready to harvest yet!");
        }
    }

    @Override
    public void grow() {
        System.out.println(getName()+" Plant is growing. Grow Time: "+this.waterLevel+"/"+getGrowthTime());
    }
}
