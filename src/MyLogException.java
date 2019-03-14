import java.util.Date;

public class MyLogException extends Exception {

    public MyLogException(String msg, String importance) {
        System.out.println(new Date().toString() + " " + msg+ " " + " " + importance);
    }
}
