package day2.task17;

import java.util.function.Function;

public enum ConverstionTypeWithFunction {

    // rozwiazanie zadania z wykorzystywaniem interfejsu funkcyjnego

    METERS_TO_YARDS(v -> 1.09 * v),
    YARDS_TO_METERS(v -> v / 1.09),
    CENTIMETERS_TO_INCHES(v -> v * 0.39),
    INCHES_TO_CENTIMETERS(v -> v / 0.39),
    KILOMETERS_TO_MILES(v -> v * 0.62),
    MILES_TO_KILOMETERS(v -> v / 0.62);

    private final Function<Double, Double> coverter;

    ConverstionTypeWithFunction(Function<Double, Double> conersionFuction) {
        this.coverter = conersionFuction;
    }

    public Function<Double, Double> getCoverter() {
        return coverter;
    }
}
