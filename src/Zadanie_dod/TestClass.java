package Zadanie_dod;

import Zadanie_dod.Part.HardDisc;
import Zadanie_dod.Part.Procesor;
import Zadanie_dod.Part.Ram;



public class TestClass {


    public static void main(String[] args) {

        Ram ram = new Ram("Rcor4", "Intel", "313135", 25, 85, 4096, 1066);
        Procesor procesor = new Procesor("80088", "Intel", "154s45", 25, 85, 3000);
        HardDisc hardDisc = new HardDisc("cienki", "WD", "W154w", 125);


        System.out.println(procesor.toString());
        procesor.increase(500);
        System.out.println(procesor.toString());

        System.out.println(ram.toString());
        ram.increase(1500);
        System.out.println(ram.toString());


    }
}
