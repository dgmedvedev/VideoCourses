package videoCourse_04.jav.lesson404;

public class AddressTest {
    public static void main(String[] args) {
        AddressEqualsHashCode address1 = new AddressEqualsHashCode("Минск", "Корш-Саблина", 2);
        AddressEqualsHashCode address2 = new AddressEqualsHashCode("Минск", "Корш-Саблина", 2);

        System.out.println(address1.equals(address2));

        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}