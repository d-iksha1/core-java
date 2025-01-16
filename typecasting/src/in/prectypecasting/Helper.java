package in.prectypecasting;

public class Helper {

	public void typeCastfromIntToFloat() {
		int intVariable=100;
		float floatVariable=1000.1F;
		floatVariable=intVariable;
		System.out.println(floatVariable);
	}
	public void typeCastfromFloatToInt() {
		int intVariable=100;
		float floatVariable=1000.1F;
		intVariable=(int)floatVariable;
		System.out.println(intVariable);
		
	}
	
}
