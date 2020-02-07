public class Komplex {
    private double im;
    private double re;

    public Komplex(double Im, double Re) {
        this.im = Im;
        this.re = Re;
    }

    @Override
    public String toString() {
        return "Komplex{" + re + " + " + im + "i}";
    }

    public static void main(String[] args) {
        Komplex a = new Komplex(8, 3);
        Komplex b = new Komplex(7, 4);
        Komplex c = a.add(b);
        System.out.println("Talet borde vara 15 + 7i:\n" + c);
    }

    public double getIm() {
        return im;
    }

    public double getRe() {
        return re;
    }

   private Komplex add(Komplex b) {
       return new Komplex(this.re + b.re, this.im + b.im);
    }
}