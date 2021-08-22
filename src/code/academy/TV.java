package code.academy;

public class TV extends Product {

    private int size;
    private String make;

    public TV(int ID, int garanacija, int size, String make) {
        this.size = size;
        this.make = make;
    }

    public TV() {

    }

    public void getTvInfo() {
        System.out.println("Size :" + size);
        System.out.println("Make :" + make);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String dajGarancija() {
        return "Za televizori imame "+ getGarnacija() + " godini garancija";
    }
}
