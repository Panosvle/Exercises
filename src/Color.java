public class Color {
    private String name;
    private int r;
    private int g;
    private int b;

    public Color(String name, int r, int g, int b) {
        this.name = name;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String convertToHex(){

        String redString = Integer.toHexString(r);
        redString = r < 16 ?  "0" + redString : redString;

        String greenString = Integer.toHexString(g);
        greenString = g < 16 ?  "0" + greenString : greenString;

        String blueString = Integer.toHexString(b);
        blueString = b < 16 ?  "0" + blueString : blueString;


        return "#" + redString + greenString  + blueString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
