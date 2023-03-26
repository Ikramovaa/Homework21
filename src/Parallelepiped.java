public class Parallelepiped {
     private double height;
   private double length;
  private   double width;
  private double area;
  private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        System.out.println((length*width*height));
    }

    public Parallelepiped() {
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0){
            throw  new MyException("Negative number");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            throw  new MyException("Negative number");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0){
            throw  new MyException("Negative number");
        }
    }

    public double getArea() {
        return area;
    }

    public double setArea(double area) {
        return (2*((height * length) + (length * width) + (height * width)));
    }


    public void area(){
        System.out.println(2*((height * length) + (length * width) + (height * width)));
    }
    public void volume(){
        System.out.println( (length*width*height));
    }
}
