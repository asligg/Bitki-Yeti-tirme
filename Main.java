public class Main {
    public static void main(String[] args) {
        Plant domates = new TomatoPlant();
        Plant havuc = new CarrotPlant();

        Farm bahce = new Farm();
        bahce.addPlant(domates);
        bahce.addPlant(havuc);

        for (int i= 0 ; i< havuc.getGrowthTime(); i++){
            System.out.println("Day"+(i+1)+":");
            bahce.simulateDay();
        }
    }
}
