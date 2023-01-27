import java.lang.Math;


class Divider extends Task {
    public Divider(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        return Math.round((x / y)*100.0) / 100.0;
    }
}
