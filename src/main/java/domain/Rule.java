package domain;

import java.util.ArrayList;
import java.util.Random;

public class Rule {
	private static final Random random = new Random();
	private static final int RANDOM_NUMBER_BOUND = 10;
	private static final int GO_BOUNDARY_NUMBER = 4;
	private static final int START_POSITION = 0;

	static boolean isGo() {
		int randomNumber = random.nextInt(RANDOM_NUMBER_BOUND);
		return randomNumber >= GO_BOUNDARY_NUMBER;
	}

	public static void setIsWinners(ArrayList<Car> cars) {
		int maxPosition = getMaxPosition(cars);

		cars.stream()
				.filter(car -> isMaxPosition(car, maxPosition))
				.forEach(Car::setIsWinner);
	}

	private static int getMaxPosition(ArrayList<Car> cars) {
		return cars.stream()
				.map(Car::getPosition)
				.reduce(START_POSITION, (position1, position2) ->
						position1 >= position2 ? position1 : position2);
	}

	private static boolean isMaxPosition(Car car, int maxPosition) {
		return car.getPosition() == maxPosition;
	}
}
