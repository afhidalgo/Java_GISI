package census;

/**
 * This class represents an inhabitant with a name and two surnames.
 */
public class Inhabitant {

    private String name;
    private String surname1;
    private String surname2;

    /**
     * Constructor to create an Inhabitant.
     * @param name First name of the inhabitant.
     * @param surname1 First surname of the inhabitant.
     * @param surname2 Second surname of the inhabitant.
     */
    public Inhabitant(String name, String surname1, String surname2) {
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
    }

    /**
     * Get the string representation of the inhabitant.
     * @return String with name and surnames.
     */
    @Override
    public String toString() {
        return name + " " + surname1 + " " + surname2;
    }
}
