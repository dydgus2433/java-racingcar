package view;

import domain.Car;
import domain.RacingGame;
import utils.StringUtils;

import java.util.List;

public class ResultView {
    private static final String DASH = "-";

    public static void watchRace(RacingGame racingGame){
        System.out.println("실행결과");
        for (int i = 0 ; i < racingGame.getTime(); i++){
            watchTrace(racingGame.move());
        }

    }

    private static List<Car> watchTrace(List<Car> cars) {
        for(int j =0; j < cars.size(); j++){
            printName(cars.get(j));
            drawTrace(cars.get(j));
        }
        System.out.println();
        return cars;
    }

    private static void printName(Car car) {
        System.out.print(car.getName() +" : ");
    }

    private static void drawTrace(Car car) {
        System.out.println(StringUtils.repeat(DASH,car.getPosition()));

    }

}
