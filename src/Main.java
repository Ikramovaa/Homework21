import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Cylinder cylinder=new Cylinder();
    try {
        System.out.println("give height of cylinder");
       cylinder.setHeight(scanner.nextDouble());
        System.out.println("please give radius of cylinder");
       cylinder.setRadius(scanner.nextDouble());
        System.out.println("please give PI");
       cylinder.setPI(scanner.nextDouble());

      cylinder.volumeC();

    }catch (MyException m){
        System.out.println(m.getMessage());
    }catch (InputMismatchException i){
        System.out.println("please give a number");
    }
        cylinder.areaC();
    Parallelepiped parallelepiped=new Parallelepiped();
        Scanner scanner1=new Scanner(System.in);
    try {
        System.out.println("please enter height of parallelepiped");
        parallelepiped.setHeight(scanner1.nextDouble());
        System.out.println("please enter lenght of parallelepiped");
        parallelepiped.setLength(scanner1.nextDouble());
        System.out.println("please ener width of parallelepiped");
        parallelepiped.setWidth(scanner1.nextDouble());

        cylinder.areaC();
    }catch (MyException e){
        System.out.println(e.getMessage());
    }catch (InputMismatchException i){
        System.out.println("please give number");
    }
    parallelepiped.area();
    parallelepiped.volume();

    }
}