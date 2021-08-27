package code.academy;

public class Processor {

    String name;
    String speed;
    int yearMade;

    public Processor() {

    }

    public Processor(String name, String speed, int yearMade) {
        this.name = name;
        this.speed = speed;
        this.yearMade = yearMade;
    }

    public String toString(){
        return "Processor ("+ name + ", " + speed + ", " + yearMade + ")";
    }

    public void novProcessor() {
        System.out.println("Nov processor");
    }
}
