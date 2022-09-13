public class Main {
    public static void main(String[] args) throws RuntimeException {
        MagicBox<String> stringMagicBox = new MagicBox<>(3);
        System.out.println("stringMagicBox.add() = " + stringMagicBox.add("One"));
        System.out.println("stringMagicBox.add() = " + stringMagicBox.add("Two"));
        System.out.println("stringMagicBox.add() = " + stringMagicBox.add("Three"));
        System.out.println("stringMagicBox.add() = " + stringMagicBox.add("Four"));
        System.out.println("Случайный элемент pick() = " + stringMagicBox.pick());

        MagicBox<Integer> intMagicBox = new MagicBox<>(4);
        System.out.println("intMagicBox.add() = " + intMagicBox.add(1));
        System.out.println("intMagicBox.add() = " + intMagicBox.add(2));
        intMagicBox.pick();
    }
}
