public class Cylinder  {
    private  double PI;
   private double radius;
   private double height;

    public Cylinder() {
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

    }

   public   void areaC (){

        System.out.println("area:"+(2*PI * radius*( height + radius)));
        volumeC();
    }
    public   void  volumeC(){
        System.out.println(PI*radius*radius*height);
    }
}
