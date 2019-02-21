package Zadanie_dod;

import Zadanie_dod.part.HardDisc;
import Zadanie_dod.part.Procesor;
import Zadanie_dod.part.Ram;


public class TestClass {


    public static void main(String[] args) {

        Ram ram = new Ram("Rcor4", "Intel", "313135", 25, 65, 4096, 1066);
        Procesor procesor = new Procesor("80088", "Intel", "154s45", 25, 60, 3000);
        HardDisc hardDisc = new HardDisc("cienki", "WD", "W154w", 125);

//        System.out.println(procesor.toString());
//        procesor.increase(500);
//        System.out.println(procesor.toString());

        try {
            procesor.increase(100);
            System.out.println(procesor.toString());
        } catch (TempratureAlarmException ex) {
            System.out.println(ex);

        }

        try {
            ram.increase(500);
            System.out.println(ram.toString());
        } catch (TempratureAlarmException ex) {
            System.out.println(ex);
        }

//        System.out.println(ram.toString());
//        ram.increase(1500);
//        System.out.println(ram.toString());


    }
}
