package testApp;

public class MainApp {

	public static void main(String[] args) {
		System.out.print("點火儀式 2nd version");
		// 這是增加數學運算的版本
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 5));
	}

}
class Math{
	int add(int a, int b) {
		return a+b;
	}
}