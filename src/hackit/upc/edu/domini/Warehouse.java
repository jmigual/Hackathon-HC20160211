package hackit.upc.edu.domini;

/**
 * Created by Joan on 11/02/2016.
 */
public class Warehouse {
    public Inventory inventory;
    private Point position;
    public int puntuation;

    public Warehouse(Point position) {
        this.position = position;
        puntuation = -1;
    }
}
