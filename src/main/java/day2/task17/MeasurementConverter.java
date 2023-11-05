package day2.task17;

public class MeasurementConverter {

    public static double covert(double value, ConversionType conversionType){
        return value * conversionType.getConverter();
    }

    public static double covert(double value, ConverstionTypeWithFunction conversionType){
        return conversionType.getCoverter().apply(value);
    }
}
