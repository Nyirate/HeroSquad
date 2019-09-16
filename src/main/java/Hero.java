import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    public String power;
    public String weakness;
    public int id;
    private static ArrayList<Hero> emma = new ArrayList<Hero>();

    public Hero(String name, int age, String power, String weakness) {

        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        emma.add(this);

    }

    public static ArrayList<Hero> all() {
        return emma;
    }

    public static void clear() {
        emma.clear();
    }

    public static Hero findById(int idOfHeroToFind) {
        return null;
    }

    public static void getAll() {
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPower(){
        return power;
    }

    public String getWeakness(){
        return weakness;
    }

    public int getId(){
        return id;
    }

    public static Hero observe(int id){
        return emma.get(id-1);
    }

}
