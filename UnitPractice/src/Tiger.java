
public class Tiger extends Animal {
	public Tiger() {
		System.out.println("I'm a Tiger, with name:" + this.getName());
	}
	public static void main(String... a) {
		Animal animal = new Tiger();
		Tiger tiger = new Animal(); // loss 
	}
}
