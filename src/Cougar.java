public class Cougar extends Animal {
    public Cougar(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            String feeding) {
        super(name, scientificName, admissionDate, family, feeding);
    }

    public Cougar(String name) {
        super(name);
    }

    public Cougar() {
        super(); /* optional */
    }

}
