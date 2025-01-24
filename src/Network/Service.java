package Network;

public abstract class Service {
    public static int randomID() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}
