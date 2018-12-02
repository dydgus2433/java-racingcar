package domain;

import utils.RandomGenerator;
import view.InputView;
import view.ResultView;

import java.util.*;

public class RacingGame {
    private static final int MAX_NUM = 10;

    private int time;
    private List<Car> cars;

    public RacingGame(String[] names, int time){
        readyCar(names);
        this.time = time;
    }

    public RacingGame(List<Car> cars, int time){
        this.cars = cars;
        this.time = time;
    }

    private List<Car> readyCar(String[] names) {
        cars = new ArrayList<>();
        for(int i = 0; i < names.length; i ++){
            cars.add(new Car(names[i]));
        }
        return cars;
    }

    public int getCarCount(){
        return cars.size();
    }

    public String getName(int index){
        return cars.get(index).getName();
    }

    public int getTime(){
        return time;
    }

    public List<Car> move() {

        for(Car car : cars){
             tryMove(car);
        }
        return cars;
    }

    public List<Car> getCars(){
        return cars;
    }

    private Car tryMove(Car car) {
        return car.addPosition(RandomGenerator.getRandomNum(MAX_NUM));
    }







}
