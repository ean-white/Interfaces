import java.awt.Rectangle;

public class BigRectangleFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        if (x instanceof Rectangle)
        {
            Rectangle r = (Rectangle) x;
            return 2 * (r.width + r.height) > 10;
        }
        return false;
    }
}
