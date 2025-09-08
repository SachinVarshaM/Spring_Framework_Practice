
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		 C c=new C();
		 c.add();

	}

}


class A
{
	int a=10;
}
class B extends A
{
	int b=20;
}
class C extends B
{
	int c;
	public void add()
	{
		c=a+b;
		System.out.println("Addition : "+c);
	}
}
