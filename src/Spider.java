public class Spider extends Animal {
    public Spider(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            String feeding) {
        super(name, scientificName, admissionDate, family, feeding);
    }

    public Spider(String name) {
        super(name);
    }

    public Spider() {
        super(); /* optional */
    }

    public String getName() {
        return super.getName();
    }
}
