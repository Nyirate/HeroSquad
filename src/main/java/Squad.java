import java.util.ArrayList;
import java.util.List;

public class Squad {
    public String name;
    public String cause;
    public int size;
    private static List<Squad> emma = new ArrayList<Squad>();
    public int key;

    public Squad(String name, String cause, int size) {
        this.name = name;
        this.cause = cause;
        this.size = size;
        emma.add(this);
    }

    public Squad(String name, int size, String cause) {
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public int getSize() {
        return size;
    }

    public static ArrayList<Squad> getAll() {
        return (ArrayList<Squad>) emma;
    }
}