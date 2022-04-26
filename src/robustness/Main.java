package robustness;

import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        UI ui = new UI();
        System.out.println("Echo of input: " + ui.readInteger());
        //System.out.println("Echo of input: " + ui.readIntegerImproved());
        //System.out.println("Echo of input: " + ui.readDouble());
        //System.out.println("Echo of input: " + ui.readDoubleAsString());
    }
}
