import java.util.*;

import domain.Car;
import domain.Rule;
import utils.InputHandler;
import utils.InputValidator;
import view.InputView;
import view.OutputView;

public class RacingGame {
	private ArrayList<Car> cars = new ArrayList<>();
	private int tryNumber = 0;

	void play() {
		buildCars();
		getTryNumber();
		OutputView.printResultMessage();
		printResult();
		Rule.setIsWinners(cars);
		OutputView.printWinners(cars);
	}

	private void buildCars() {
		final List<String> carNames = Arrays.asList(InputHandler.splitByComma(InputView.carNames()));

		carNames.stream()
				.map(Car::new)
				.forEach(cars::add);
	}

	private void getTryNumber() {
		tryNumber = InputView.tryNumber();
		if(!InputValidator.isValidNumber(tryNumber)) {
			throw new InputMismatchException("시도 횟수는 1 이상 이어야 합니다.");
		}
	}

	private void printResult() {
		for (int i = 0; i < tryNumber; i++) {
			cars.forEach(Car::tryToGo);
			OutputView.printCarsPosition(cars);
		}
	}
}
