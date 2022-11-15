public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }

    public void display() {
        int iData = 1;

        System.out.println("idata: " + this.iData + " dData: "
                + dData + " next: " + next);

    }

}
