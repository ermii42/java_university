package laby.lab_9;

public class Exception5 {
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
    }
}
