import java.util.ArrayList;

public class Farm {
    private ArrayList<Plant> plants;
    private int day;
    public Farm (){
        plants = new ArrayList<>();
    }
    public void addPlant(Plant p){
        System.out.println(p.getName()+"Plant is added");
        plants.add(p);
    }
    public void simulateDay(){
        if(plants.isEmpty())
            System.out.println("Bahçede hiçbir bitki yok.");
        else {
            for (Plant plant : plants) {
                plant.water();
                plant.grow();
                plant.harvest();
            }
        }
        System.out.println("-----------------------------------------------------");
    }

}
