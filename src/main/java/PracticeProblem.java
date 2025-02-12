public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(evenOrOdd(5));
		System.out.println(teacherOrStudent("Kalisz"));
		System.out.println(fartherFromZero(5));
		System.out.println(isFive(-5));
		System.out.println(positiveOrNegative(0));
		System.out.println(highOrLow(100));
		System.out.println(isHello("Bye"));

	}

	//Write your functions here
	public static String evenOrOdd(int num) {
		if (num % 2 == 0) {
			return ("Even");
		}
		else {
			return ("Odd");
		}


	}
	public static String teacherOrStudent(String name) {
		if (name == "Kalisz") {
			return ("Teacher");
		}
		else {
			return ("Student");
		}

	}
	public static int fartherFromZero(int num) {
		if (num > 0) {
			return num + 5;
		}
		if (num < 0) {
			return num - 5;

			}
			else {
				return 0;
			}

	}
	public static String isFive(int num2) {
		if (num2 == 5) {
			return "The number is Five";
		}
		else {
			return "The number is not Five";
		}

	}
	public static String positiveOrNegative(double fracNum) {
		if (fracNum > 0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
	}
	public static String highOrLow(int num3) {
		if (num3 > 100) {
			return "High";
		}
		else {
			return "Low";

		}

	}
	public static String isHello(String word) {
		if (word == "Hello") {
			return "The word is Hello";
		}
		else {
			return "The word is not Hello";
		}

	}
	

}
