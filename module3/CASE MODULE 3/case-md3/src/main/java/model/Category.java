package model;

public class Category {
    private int cID;
    private String cName;

    public Category(int cID, String cName) {
        this.cID = cID;
        this.cName = cName;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}