package videoCourse_04.jav.lesson404;

import java.util.Objects;

public class AddressEqualsHashCode {
    private final String city;
    private final String street;
    private final int numberOfHouse;

    public AddressEqualsHashCode(String city, String street, int numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.hashCode() != obj.hashCode()) {
            return false;
        }
        AddressEqualsHashCode address = (AddressEqualsHashCode) obj;
        return numberOfHouse == address.numberOfHouse &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, numberOfHouse);
    }
}