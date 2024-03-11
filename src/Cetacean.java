public abstract class Cetacean extends Animal {
    public Cetacean(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            String feeding) {
        super(name, scientificName, admissionDate, family, feeding);
    }

    public Cetacean(String name) {
        super(name);
    }

    public Cetacean() {
    }
}
