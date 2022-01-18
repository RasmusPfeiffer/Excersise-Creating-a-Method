package Exercises;

public class Input {

	public int correctInput;

	public Integer setInput(int input) {

		if (input < 50 || input > 300) {
			return null;
		} else {
			correctInput = input;
			return correctInput;
		}
	}

}
