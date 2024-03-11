import enums.RespirationType;
import interfaces.IRespiratorySystem;

public abstract class Animal implements IRespiratorySystem {
    AnimalInformation animalInfo;

    public Animal(String name, String scietificName, String admissionDate, String family, String feeding) {
        animalInfo = new AnimalInformation(name,scietificName,admissionDate,family,feeding);
    }

    public Animal(String name){
        animalInfo = new AnimalInformation(name);
    }

    public Animal() {
    }

    public String getName() {
        String name = animalInfo.getName();
        return name;
    }

    @Override
    public void breathe(RespirationType respirationType) {
        System.out.println("Animal " + getName() + " breaths through " + respirationType.toString());
    }
}
