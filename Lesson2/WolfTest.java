public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		
		wolf.gender = "мужской";
		wolf.nickName = "Акела";
		wolf.weight = 70.5f;
		wolf.age = 13;
		wolf.color = "черный";
		
		System.out.println("Пол волка: " + wolf.gender);
		System.out.println("Кличка волка: " + wolf.nickName);
		System.out.println("Вес волка = " + wolf.weight);
		System.out.println("Возраст волка = " + wolf.age);
		System.out.println("Цвет волка: " + wolf.color);
		
		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}
		
		