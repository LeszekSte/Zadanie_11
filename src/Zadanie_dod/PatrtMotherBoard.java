package Zadanie_dod;

public abstract class PatrtMotherBoard extends PartOfComputer {
    private double tempetature;
    private int maxTemp;

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    private int jump;

    public PatrtMotherBoard(String nameModel, String producer, String serialNumber, double tempetature, int maxTemp) {
        super(nameModel, producer, serialNumber);
        this.tempetature = tempetature;
        this.maxTemp = maxTemp;
    }

    public double getTempetature() {
        return tempetature;
    }

    public void setTempetature(double tempetature) {
        this.tempetature = tempetature;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }


    public abstract void increase(int jump);

    @Override
    public String toString() {
        return  super.toString()  +"PatrtMotherBoard{" +
                "tempetature=" + tempetature +
                ", maxTemp=" + maxTemp +
                '}';
    }
}


