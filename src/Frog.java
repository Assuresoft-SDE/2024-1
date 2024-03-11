public class Frog extends Animal {
    public Frog(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            String feeding) {
        super(name, scientificName, admissionDate, family, feeding);
    }

    public Frog(String name) {
        super(name);
    }

    public Frog() {
        super(); /* optional */
    }

    public String getName() {
        return super.getName();
    }
}
