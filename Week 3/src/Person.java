
public class Person implements Animal {

	@Override
	public void Eat() {
		System.out.println("Person eats cooked food");

	}

	@Override
	public void Move() {
		System.out.println("Person moves around");

	}

	@Override
	public void Hunt() {
		System.out.println("Person doesn't need to hunt");

	}

	@Override
	public void MakeSound() {
		System.out.println("Person speaks in a language");

	}

}
