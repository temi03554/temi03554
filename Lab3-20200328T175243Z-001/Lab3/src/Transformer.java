
public class Transformer extends Person implements Car {

	@Override
	public void acel() {
		System.out.println("turbo drive engaged");
		
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "what brake?!!!!";
	}

	@Override
	public String turn(int x) {
		// TODO Auto-generated method stub
		String result = "";
			if(x==1) result = "right";
			if(x==2) result = "left";
			else result = "that's the acel!!";
		return result;
	}

}
