package sesion9;

/**
 * Created by mcarvajal on 24/05/2017.
 */
public class MyCar implements Car {
    @SuppressWarnings("deprecation")
    public void open() {
        System.out.println("Open");
    }
    public void openRight() {
        System.out.println("Open Right");
    }
    public void openLeft() {
        System.out.println("Open Left");
    }
}
