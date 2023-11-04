package day1.task8;

public class Task8 {
    public static void main(String[] args) {
        ParcelValidator parcelValidator = new ParcelValidator();

        Parcel parcel = new Parcel(35,40,45,29,false);
        boolean result = parcelValidator.validate(parcel);
        System.out.println("spodziewamy sie true: " + result);
    }
}
