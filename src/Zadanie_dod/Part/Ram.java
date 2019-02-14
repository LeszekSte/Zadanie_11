package Zadanie_dod.Part;

import Zadanie_dod.PatrtMotherBoard;
import Zadanie_dod.TempratureAlarmException;

public class Ram extends PatrtMotherBoard {
    private int memory;
    private int clockSpeed;
    static private final int STEP_RAM = 10;




    public Ram(String nameModel, String producer, String serialNumber, double tempetature, int maxTemp, int memory, int clockSpeed) {
        super(nameModel, producer, serialNumber, tempetature, maxTemp);
        this.memory = memory;
        this.clockSpeed = clockSpeed;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Override
    public void increase(int jump) {
        setTempetature(getTempetature()+jump/100*STEP_RAM);

        if (getTempetature()>= getMaxTemp()){
            throw new TempratureAlarmException();
        }
        this.clockSpeed+=jump;
    }

//    public void increase(int jump) {
//       try{
//
//           setTempetature(getTempetature()+jump/100*STEP_RAM);
//           this.clockSpeed+=jump;
//
//       }catch (TempratureAlarmException ex){
//            System.out.println(ex);
//       }
//
//    }


    @Override
    public String toString() {
        return  "Ram{" +
                "Temp " + getTempetature() +
                ", clockSpeed=" + clockSpeed +
                '}';
    }
}
