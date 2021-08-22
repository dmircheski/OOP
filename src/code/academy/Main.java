package code.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Processor objekti
        Processor iphoneProcessor = new Processor("A15", "25GHz", 2020);
        Processor androidProcesor = new Processor("Android2020", "25Ghz", 2020);


        // Printanje na eden mobilen koi sodrzhi processor objekt
        MobilePhone novMobilen = new MobilePhone("Iphone", "X", "Red", "13MP", iphoneProcessor);
        novMobilen.setID(1111);
        novMobilen.setGarancija(3);
        System.out.println(novMobilen.toString());

        novMobilen.makeCall("Gjorgji");
        novMobilen.makeCall("Gjorgji", "Petrusevski");
        novMobilen.makeCall("Gjorgji", "Petrusevski", "070510510");

        // instanciranje objekt od klasata televizor
        TV televizor1 = new TV(222, 1, 65, "Samsung");


        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");


        // zadavanje na vrednosti za ID i garancija, koi klasata MobilePhone gi nasleduva od klasata Product
        System.out.println("Mobilen");
        novMobilen.setID(555);
        novMobilen.setGarancija(3);
        System.out.println(novMobilen.getID());

        // gledame deka prethodnata i ovaa metoda se povikuvaat od Product klasata
        System.out.println(novMobilen.dajGarancija());


        // zadavanje na vrednosti za ID i garancija, koi klasata TV gji nasleduva od klasata Product
        System.out.println("Televizor");
        televizor1.setID(666);
        televizor1.setGarancija(1);
        televizor1.setSize(62);
        televizor1.getGarnacija();

        System.out.println(televizor1.getID());
        System.out.println(televizor1.dajGarancija());

    }

}
