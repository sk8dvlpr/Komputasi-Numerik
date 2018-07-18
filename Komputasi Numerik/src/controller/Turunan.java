package controller;

public class Turunan
{
	public double f_selisihBagi(double x, double h) {
        double f, f2, f3, f4;
        f = x - h;
        f2 = Math.pow(f, f);
        f3 = Math.pow(f, f2);
        f4 = (x - f3) / h;
        return f4;
    }
	
	public double f_order(double x) {
        return (Math.exp(-x) * Math.sin(2 * x) + 1);
    }

    public double f_eksak(double x) {
        return (-Math.exp(-x) * Math.sin(2 * x) + Math.exp(-x) * 2 * Math.cos(2 * x));
    }

    public double fungsi_tengahH2(double x, double h) {
        return ((f_order(x + h) - f_order(x - h)) / (2 * h));
    }

    public double fungsi_tengahH4(double x, double h) {
        return ((f_order(x + h) - f_order(x - h)) / (4 * h));
    }
}
