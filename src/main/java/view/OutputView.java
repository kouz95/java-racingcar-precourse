package view;

import java.util.ArrayList;
import java.util.stream.Collectors;

import domain.Car;

public class OutputView {
	private static final String RESULT_MESSAGE = "실행 결과";
	private static final String IS_WINNER_MESSAGE = "가 최종 우승했습니다.";

	public static void printResultMessage() {
		System.out.println('\n' + RESULT_MESSAGE);
	}

	public static void printCarsPosition(ArrayList<Car> cars) {
		cars.forEach(car -> System.out.println(getResultLine(car)));
		System.out.println();
	}

	private static String getResultLine(Car car) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(car.getName());
		stringBuilder.append(" : ");
		for(int i = 0; i < car.getPosition(); i++) {
			stringBuilder.append("-");
		}
		return stringBuilder.toString();
	}

	public static void printWinners(ArrayList<Car> cars) {
		ArrayList<String> winnerNames = getWinnerNames(cars);
		System.out.println(getWinnersLine(winnerNames) + IS_WINNER_MESSAGE);
	}

	private static ArrayList<String> getWinnerNames(ArrayList<Car> cars) {
		return (ArrayList<String>) cars.stream()
				.filter(Car::getIsWinner)
				.map(Car::getName)
				.collect(Collectors.toList());
	}

	private static String getWinnersLine(ArrayList<String> winnerNames) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(winnerNames.get(0));
		for(int i = 1; i < winnerNames.size(); i++) {
			stringBuilder.append(", ");
			stringBuilder.append(winnerNames.get(i));
		}
		return stringBuilder.toString();
	}
}
