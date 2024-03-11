public class Delfin extends Animal {
    public Delfin(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            String feeding) {
        super(name, scientificName, admissionDate, family, feeding);
    }

    public Delfin() {
        super(); /* optional */
    }

    public String getName() {
        return super.getName();
    }
}
