public class Beverage {
    private String type;
    private String name;

    public String getBeverageName() {
        return name;
    }
    public Beverage(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + type + "]";
    }
    @Override
    public int hashCode() {
        return name.hashCode() + type.hashCode();
    }
    //toString(), equals(), hashcode()
}
