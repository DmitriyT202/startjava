public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private double weight;
    private double height;
    private int strength;
    private int armor;
    private int speed;

    public Jaeger() {

    }

    public Jaeger(String modelName, String mark, String origin, double weight, double height, 
            int strength, int armor, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.weight = weight;
        this.height = height;
        this.strength = strength;
        this.armor = armor;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean drift() {
        System.out.printf("Drift %s was successful\n", modelName);
        return true;
    }

    public void move() {
        System.out.printf("Jaeger %s is moving\n", modelName);
    }

    public String scanKaiju() {
        return modelName + " scanning Kaiju\n";
    }

    public void usePlasmaCaster() {
        System.out.printf("Jaeger %s activates PlasmaCaster\n", modelName);
    }

    @Override
    public String toString() {
        return String.format("Jaeger %s, %s from %s", modelName, mark, origin);
    }
}