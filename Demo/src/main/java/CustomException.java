
public class CustomException {

	public static void main(String[] args) throws  Exception{


		int age=10;
		
		if(age<18)
		{
			throw new Exception("Age is less than 18yrs");
		}
		else
		{
			System.out.println("Welcome");
		}

	}

}
