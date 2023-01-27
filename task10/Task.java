

class Task extends TaskQueue {
    double x, y;

    public Task(double a, double b) {
        x = a;
        y = b;
    }

    public double execute() {
        throw new UnsupportedOperationException();
    }

    public static Task getInstance(String oper,
            double a, double b) {
        char check = oper.charAt(0);
        if (check == '+') {
            return new Adder(a, b);
        } else if (check == '-') {
            return new Subtractor(a, b);
        } else if (check == '*') {
            return new Multiplier(a, b);
        } else if (check == '/') {
            return new Divider(a, b);
        }
        return null;
    }
}

