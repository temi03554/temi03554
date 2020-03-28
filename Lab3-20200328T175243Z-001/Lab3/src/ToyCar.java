
public class ToyCar implements Car, Ball {

	@Override
	public void acel() {
		System.out.println("Push harder");
	}

	@Override
	public String brake() {
		return "Stick your left leg out please";
	}

	@Override
	public String turn(int x) {
		return "Just lift and turn in the direction of the car";
	}

	@Override
	public String direction_of_kick() {
		
		return "North-East";
	}

	@Override
	public int amount_of_force() {
		return 50;
	}
	
}
