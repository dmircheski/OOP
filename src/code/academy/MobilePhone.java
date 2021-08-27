package code.academy;

public class MobilePhone extends Product {

    String make;
    String model;
    String color;
    String camera;
    Processor processor;

    public MobilePhone(String marka, String modelce, String boja, String kamera, Processor processor) {
        make = marka;
        model = modelce;
        color = boja;
        camera = kamera;
        this.processor = processor;
    }

    public MobilePhone(String marka, String modelce) {
        make = marka;
        model = modelce;
    }

    public MobilePhone() {}

    public void makeCall(String name) {
        System.out.println(make + model + "is calling "+ name + " ...");
    }

    public void makeCall(String name, String surname) {
        System.out.println(make + model + "is calling "+ name + surname + " ...");
    }

    public void makeCall(String name, String surname, String phone) {
        System.out.println(make + model + "is calling "+ name + surname + phone + " ...");
    }

    public String dajGarancija() {
        return "Za telefoni imame "+ getGarnacija() + " godini garancija";
    }

    public String toString(){
        return "Mobile Phone = ("+ getID()+  ", " + getGarnacija()+ ", " + make + ", "+ model+ ", " + color+ ", " +
                camera+")" + processor.toString();
    }
    
}
