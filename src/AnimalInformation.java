public class AnimalInformation {
    private String name;
    private String scientificName;
    private String admissionDate;
    private String family;
    private String feeding;

    public AnimalInformation(String name,
                             String scientificName,
                             String admissionDate,
                             String family,
                             String feeding) {
        this.name = name;
        this.scientificName = scientificName;
        this.admissionDate = admissionDate;
        this.family = family;
        this.feeding = feeding;
    }

    public AnimalInformation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public String getFamily() {
        return family;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }
}
