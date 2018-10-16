import java.util.ArrayList;
import java.util.List;

public class PancakeHouselterator implements Iterator {

    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouselterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
