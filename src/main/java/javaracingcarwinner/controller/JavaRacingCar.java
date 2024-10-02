package javaracingcarwinner.controller;

import javaracingcarwinner.entity.RacingCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaRacingCar {
    private final List<RacingCar> cars = new ArrayList<>();

    public JavaRacingCar(String text) throws RuntimeException {
        List<String> names = Arrays.stream(text.split(",")).collect(Collectors.toList());

        for (String name : names) {
            if (name.length() > 5) throw new IllegalArgumentException("5자 이상 입력");
            cars.add(new RacingCar(name));
        }

    }

    public List<RacingCar> cars() {
        return this.cars;
    }
}
