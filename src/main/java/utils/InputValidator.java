package utils;

import java.util.ArrayList;
import java.util.Arrays;

public class InputValidator {
	private static final int MAX_INPUT_LENGTH = 5;
	private static final int MIN_INPUT_NUMBER = 1;

	static boolean isDuplicated(String[] inputs) {
		ArrayList<String> names = new ArrayList<>();

		for(String inputName : inputs) {
			if(names.contains(inputName)) {
				return true;
			}
			names.add(inputName);
		}
		return false;
	}

	static boolean isEmptyLine(String[] inputs) {
		return Arrays.stream(inputs)
				.anyMatch(String::isEmpty);
	}

	static boolean isOutOfRange(String[] inputs) {
		return Arrays.stream(inputs)
				.anyMatch(input -> input.length() > MAX_INPUT_LENGTH);
	}

	public static boolean isValidNumber(int inputNumber) {
		return inputNumber >= MIN_INPUT_NUMBER;
	}
}
