public class Whale extends Cetacean {
    public Whale(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            String feeding) {
        super(name, scientificName, admissionDate, family, feeding);
    }

    public Whale(String name) {
        super(name);
    }

    public Whale() {
        super(); /* optional */
    }
}
