public class Dog extends Animal{
    private String woof;

    public void setWoof(String woof) {
        this.woof = woof;
    }

    public String getWoof() {
        return woof;
    }

    @Override
    public String toString() {
        String s = "";
        s += woof+"\n";
        return super.toString() + s;
    }
}
