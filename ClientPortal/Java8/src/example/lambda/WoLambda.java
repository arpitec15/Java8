package example.lambda;

public class WoLambda implements Drawable {

	public static void main(String[] args) {
		
		WoLambda wo = new WoLambda();
		wo.Drawing("Arpit");

	}

/*	@Override
	public void Drawing() {
		System.out.println("Circle ");
		
	}*/

	@Override
	public String Drawing(String name) {


		return name;
		
	}

}
