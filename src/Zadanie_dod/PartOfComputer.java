package Zadanie_dod;

public abstract class PartOfComputer extends Compter {
    private String nameModel;
    private String producer;
    private String serialNumber;

    public PartOfComputer(String nameModel, String producer, String serialNumber) {
        this.nameModel = nameModel;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "PartOfComputer{" +
                "nameModel='" + nameModel + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
