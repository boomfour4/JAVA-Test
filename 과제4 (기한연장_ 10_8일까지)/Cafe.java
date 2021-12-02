import java.util.HashMap;
import java.util.Iterator;

public class Cafe {
    private String name;
    private HashMap<String, Beverage> menus = new HashMap</*String, Beverage*/>();

    public Cafe(String name) {
        this.name = name;
    }
    public void addBeverage(Beverage newBewerage) {
        menus.putIfAbsent(String.valueOf(newBewerage.hashCode()), newBewerage);
    }
    public void removeAllBeverage() {
        menus.clear();
    }
//    public String Cafe() {
//        return "Asdf";
//    }
    public Beverage findBeverage(String name, String type) {
        Beverage tmp = new Beverage(name, type);
        if(menus.containsKey(String.valueOf(tmp.hashCode()))){
            return menus.get(String.valueOf(tmp.hashCode()));
        }
        else return null;
    }
    public String toString() {
        String msg = "Cafe Name: " + name + " Beverage Count: " + menus.size() + "\n";
        Iterator<Beverage> values = menus.values().iterator();
        while (values.hasNext()) {
            msg += "\t" + values.next() + "\n";
        }
        return msg;
    }
}
