package domain;

import java.util.ArrayList;
import java.util.List;

public class CarResult {

    private static final String COMMA = ",";

    public static List<String> getRaceWinners(List<Car> cars) {
        int max = getMaxPosition( cars);

        return getWinners(cars, max);
    }

    public static List<String> getWinners(List<Car> cars, int max) {
        List<String> result = new ArrayList<>();
        for(Car car : cars){
            if(car.isWinner(max)){
                result.add(car.getName());
            }
        }
        return result;
    }

    public static String makeWinnersSentence(List<String> result) {
        return  stringJoin(result);
    }

    public static int getMaxPosition(List<Car> cars) {
        int max = 0;
        for(Car car : cars){
            max = car.getMaxPosition(max);
        }
        return max;
    }
    public static String stringJoin(List<String> strArr){
        return String.join(COMMA,strArr);
    }
}
