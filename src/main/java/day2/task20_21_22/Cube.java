package day2.task20_21_22;

public class Cube extends Shape3D implements Fillable{
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    public double calculateVolume() {
        double b = 3;
        return Math.pow(a, b);
    }
/*
 return :
 0 -> po przegi
 -1 -> za malo
 1-> za duzo wod
 */
    @Override
    public int fill(double volume) {
        double maxVolume = calculateVolume();
      // if(maxVolume == volume){
      //     return 0;
      // } else if (maxVolume< volume) {
      //     return 1;

      // }
      // return -1 ;
        return Double.compare(volume,maxVolume);
    }
}
