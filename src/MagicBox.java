import java.util.Random;

public class MagicBox<T> {
    private int maxItem;
    T[] items;

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
        int numNull = 0;
        try {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    numNull = i;
                    items[items.length] = null;
                }
            }
        } catch (RuntimeException exception) {
            System.out.println("Коробка не полна, осталось еще " + (items.length - numNull) + " ячеек");
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
/*
 try {
                productNumber = Integer.parseInt(parts[0]);
                productCount = Integer.parseInt(parts[1]);
            } catch (RuntimeException exception) {
                System.out.println("Введен не корректный текст");
                continue;
            }
* */
    }
}
