public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		
		wolf.setGender("мужской");
		wolf.setNickName("Акела");
		wolf.setWeight(70.5f);
		wolf.setAge(13);
		wolf.setColor("черный");
		
		System.out.println("Пол волка: " + wolf.getColor());
		System.out.println("Кличка волка: " + wolf.getNickName());
		System.out.println("Вес волка = " + wolf.getWeight());
		System.out.println("Возвраст волка = " + wolf.getAge());
		System.out.println("Цвет волка: " + wolf.getColor());
		
		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}
		
		