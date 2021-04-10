package Annotations;

import java.util.ArrayList;
import java.util.List;

public class Cube {

    private int width;

    public Cube(int width) {
        this.width = width;
    }

    /**
     * this method is not used any more
     * please use {@link #calculateVolume()} instead
     * @return volume of cube
     */
    @Deprecated
    public int getVolume() {
        int a = width;

        int s = a * a;

        int v = s * a;

        return v;
    }

    public int calculateVolume() {
        return width * width * width;
    }

    @SuppressWarnings("all")
    public void manager() {
        List list = new ArrayList();

        list.add(new Cube(1));
    }
}
