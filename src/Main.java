// TODO: we need to add the missing classes!
// , I will add 'Adder' and s35243 will add 'Subtractor'.
public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(10, 20));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}