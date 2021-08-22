package code.academy;

public abstract class Product {

    private int ID;
    private int garancija;

    public void setID(int ID){
        this.ID = ID;
    }

    public void setGarancija(int garancija) {
        this.garancija = garancija;
    }

    public int getGarnacija() {
        return garancija;
    }

    public int getID() {
        return ID;
    }

    public abstract String dajGarancija();

}
