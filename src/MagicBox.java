import java.util.Random;

public class MagicBox<T> {
    private int maxItem;
    private T[] items;

    public MagicBox(int maxItem) {
        this.maxItem = maxItem;
        this.items = (T[]) new Object[maxItem];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, осталось еще " + (items.length - i) + " ячеек");
            }
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
