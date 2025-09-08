
public class Functional_Interface {

	public static void main(String[] args) {
		 
		IA a=()->"Sachin";
		System.out.println(a.name());
		
		ADD add=(x,y)-> x+y;
		 System.out.println("Addition : "+ add.sum(20, 40));
	}

}


interface IA
{
	String name();
}

interface ADD
{
	int sum(int a,int b);
}