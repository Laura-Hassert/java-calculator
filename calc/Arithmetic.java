package calc;

public class Arithmetic {
	public static float add(float num1, float num2) {
		float sum = num1 + num2;
		return sum;
	}

	public static float subtract(float num1, float num2) {
		float diff = num1 - num2;
		return diff;
	}

	public static float multiply(float num1, float num2) {
		float prod = num1 * num2;
		return prod;
	}

	public static float divide(float num1, float num2) {
		float quo = num1 / num2;
		return quo;
	}

	public static float square(float num1) {
		float squared = num1 * num1;
		return squared;
	}

	public static float cube(float num1) {
		float cubed = num1 * num1 * num1;
		return cubed;
	}

	public static float power(float num1, float num2) {
		double dblPowered = Math.pow(num1, num2);
		float floatPowered = (float)dblPowered;
		return floatPowered;
	}

	public static float mod(float num1, float num2) {
		float moded = num1 % num2;
		return moded;
	}
}