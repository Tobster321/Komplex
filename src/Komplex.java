public class Komplex {
    private double im;
    private double re;

    public Komplex(double Im, double Re) {
        this.im = Im;
        this.re = Re;
    }

    @Override
    public String toString() {
        return "Komplex{" +
                "im=" + im +
                ", re=" + re +
                '}';
    }

    public static void main(String[] args) {
        Komplex a = new Komplex(3, 8);
        Komplex b = new Komplex(4, 7);
        Komplex c = a.add(b);
        System.out.println(c);
    }

    private Komplex add(Komplex b) {
        return new Komplex(d);
    }
}


