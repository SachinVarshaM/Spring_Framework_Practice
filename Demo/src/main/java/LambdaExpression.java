interface MyInterface
{
	public int addition(int a,int b);
	
	
}
interface MyInterface1
{
	public int addition(int a,int b, int c);
	
	
}

public class LambdaExpression {
	public static void main(String[] args) {
	
		MyInterface mi=(int a, int b)->(a+b);
		
	System.out.println(	mi.addition(10, 20));
	
	 
	
	MyInterface1 m2=(a,b,c)->(a+b+c);
	System.out.println(m2.addition(10, 50,60));
	
	}

}
