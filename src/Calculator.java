
public class Calculator {

	
	public int Add(String numbers){
		int result = 0;
		String[] nArray = numbers.split(",");
		for (String n: nArray){
			result += Integer.parseInt(n);
		}
		return result;
	}

}
