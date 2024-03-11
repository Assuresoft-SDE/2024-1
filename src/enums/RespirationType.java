package enums;

public enum RespirationType {
    PULMONAR, GILLS, CUTANEOUS, TRACHEA;

    @Override
    public String toString() {
        switch (this) {
            case PULMONAR:
                return "lungs";
            case GILLS:
                return "gills";
            case CUTANEOUS:
                return "skin";
            case TRACHEA:
                return "trachea";
            default:
                return null;
        }
    }
}
