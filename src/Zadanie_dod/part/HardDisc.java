package Zadanie_dod.part;

import Zadanie_dod.PartOfComputer;

public class HardDisc extends PartOfComputer {

    public HardDisc(String nameModel, String producer, String serialNumber, int capcity) {
        super(nameModel, producer, serialNumber);
        this.capcity = capcity;
    }

    private int capcity;

    public int getCapcity() {
        return capcity;
    }

    public void setCapcity(int capcity) {
        this.capcity = capcity;
    }

    @Override
    public String toString() {
        return "HardDisc{" +
                "capcity=" + capcity +
                '}';
    }
}
