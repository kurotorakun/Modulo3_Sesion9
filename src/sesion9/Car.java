package sesion9;

/**
 * Created by mcarvajal on 24/05/2017.
 */
public interface Car {
    /**
     * @deprecated use
     * openRight or
     * openLeft instead.
     */
    @Deprecated
    public void open();
    public void openRight();
    public void openLeft();
}
