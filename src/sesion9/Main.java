package sesion9;

import java.io.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        /* QUESTION 2 */
        try {
            OutputStream y = new FileOutputStream("./test.txt");
            //FileOutputStream x = (FileOutputStream) new OutputStream();

            y.write(100);
            //x.flush();
            System.out.println("Hola Mundo!\n"+ y.toString());
        }
        catch (Exception e){
            System.out.println("Exception: "+e);
        }

        /* QUESTION 4 */
        MyCar car = new MyCar();
        car.open();
        car.openLeft();
        car.openRight();
    }
}
