import java.util.ArrayList;

public class TransformerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transformer t1 = new Transformer();
		System.out.println("Is a Transformer a car? "+ (t1 instanceof Car));
		System.out.println("Entering value of 1 for turn "+t1.turn(1));
		
		ToyCar tc = new ToyCar();
		System.out.println("Entering value of 1 for turn "+tc.turn(1));
		
		ArrayList<Car> fleet= new ArrayList<Car>();
		fleet.add(tc);
		fleet.add(t1);
		
		for(int i = 0;i<fleet.size();i++) {
			System.out.println("Speeding up....");
			fleet.get(i).acel();
		}
		
		ToyCar Bentley = new ToyCar();
		ToyCar Tesla = new ToyCar();
		ArrayList<Ball> BallType = new ArrayList<Ball>();
		BallType.add(Tesla);
		BallType.add(Bentley);
		
		for(int i = 0;i<BallType.size();i++) {
			System.out.println("Harder");
			System.out.println(BallType.get(i).direction_of_kick());
		}
		
		Dog d = new Golden();
		System.out.println(d.bark());
	}
		
	
	

}
