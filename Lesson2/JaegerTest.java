public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setOrigin("USA");
        jaeger1.setWeight(1.980);
        jaeger1.setHeight(79.25);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        jaeger1.setSpeed(7);

        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 1.722, 76.2, 9, 6, 8);

        System.out.println("Jaeger1 modelName is " + jaeger1.getModelName());
        System.out.println("Jaeger1 mark is " + jaeger1.getMark());
        System.out.println("Jaeger1 origin is " + jaeger1.getOrigin());
        System.out.println("Jaeger1 weight = " + jaeger1.getWeight());
        System.out.println("Jaeger1 height = " + jaeger1.getHeight());
        System.out.println("Jaeger1 strength = " + jaeger1.getStrength());
        System.out.println("Jaeger1 armor = " + jaeger1.getArmor());
        System.out.println("Jaeger1 speed = " + jaeger1.getSpeed());
        System.out.println(jaeger1);
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.usePlasmaCaster();
        System.out.println();

        System.out.println("Jaeger2 modelName is " + jaeger2.getModelName());
        System.out.println("Jaeger2 mark is " + jaeger2.getMark());
        System.out.println("Jaeger2 origin is " + jaeger2.getOrigin());
        System.out.println("Jaeger2 weight = " + jaeger2.getWeight());
        System.out.println("Jaeger2 height = " + jaeger2.getHeight());
        System.out.println("Jaeger2 strength = " + jaeger2.getStrength());
        System.out.println("Jaeger2 armor = " + jaeger2.getArmor());
        System.out.println("Jaeger2 speed = " + jaeger2.getSpeed());
        System.out.println(jaeger2);
        jaeger2.drift();
        jaeger2.move();
        jaeger2.scanKaiju();
        jaeger2.usePlasmaCaster();

        jaeger1.setModelName("Horizon Brave");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("China");
        jaeger1.setWeight(7.890);
        jaeger1.setHeight(72.54);
        jaeger1.setStrength(4);
        jaeger1.setArmor(6);
        jaeger1.setSpeed(8);
        System.out.println();

        System.out.println("Jaeger1 modelName is " + jaeger1.getModelName());
        System.out.println("Jaeger1 mark is " + jaeger1.getMark());
        System.out.println("Jaeger1 origin is " + jaeger1.getOrigin());
        System.out.println("Jaeger1 weight = " + jaeger1.getWeight());
        System.out.println("Jaeger1 height = " + jaeger1.getHeight());
        System.out.println("Jaeger1 strength = " + jaeger1.getStrength());
        System.out.println("Jaeger1 armor = " + jaeger1.getArmor());
        System.out.println("Jaeger1 speed = " + jaeger1.getSpeed());
        System.out.println(jaeger1);
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.usePlasmaCaster();
    }    
}