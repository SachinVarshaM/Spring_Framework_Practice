
public class Functional_Interface {

	public static void main(String[] args) {
		 
		IA a=()->"Sachin";
		System.out.println(a.name());
		
	}

}


interface IA
{
	String name();
}