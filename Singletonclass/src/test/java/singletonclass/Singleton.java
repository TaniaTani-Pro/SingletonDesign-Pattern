package singletonclass;

public class Singleton {

	// In OOP, a singleton class is class that can only once object of this
	// singleton class ( Lazy Initilization)
	// constructor is as private

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = " here I am using singleton pattern";

	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}

	public static void main(String[] arg) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}
}