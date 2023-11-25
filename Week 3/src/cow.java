
public class cow implements Animal {
	
	static String setname = cow.setname;

	@Override
	public void Eat() {
		System.out.println("the interface variable is "+Animal.classname);

System.out.println("Cow eats Grass");
	}

	@Override
	public void Move() {
		System.out.println("Cow walks slowly");

	}

	@Override
	public void Hunt() {
		System.out.println("Cow does not hunt");

	}

	@Override
	public void MakeSound() {
		System.out.println("Cow makes the mooo sound");

	}

	public void setname(String string) {
		// TODO Auto-generated method stub
		
	}

	public void getName() {
		// TODO Auto-generated method stub
		
	}

}
