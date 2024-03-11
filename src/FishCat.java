public class FishCat extends Animal {
    public FishCat(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            String feeding) {
        super(name, scientificName, admissionDate, family, feeding);
    }

    public FishCat(String name) {
        super(name);
    }

    public FishCat() {
        super(); /* optional */
    }

    public String getName() {
        return super.getName();
    }
}
