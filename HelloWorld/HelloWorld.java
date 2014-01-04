class HelloWorld {
	public static void main(String[] args){
		Greeter.sayHello(args[0]);
	}
}
class Greeter{
	static public void sayHello(String name){
		System.out.println("Hello "+ name);
	}
}