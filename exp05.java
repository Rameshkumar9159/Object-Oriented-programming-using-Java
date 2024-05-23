abstract class Animal {
abstract void sound();
}
class Dog extends Animal {
void sound() {
System.out.println("Woof!");
}
}
class Cat extends Animal {
void sound() {
System.out.println("Meow!");
}
}
public class exp05{
	public static void main(String[] args) {
Animal dog = new Dog();
Animal cat = new Cat();
dog.sound();
cat.sound();
}
}
