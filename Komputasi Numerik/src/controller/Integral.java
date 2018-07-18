package controller;

public class Integral 
{
	public double f_trapesium(double value) {
        return 1 / (1 + value * value);
    }

    public double trapesium(double nilaiA, double nilaiB, double n) {
        double h = (nilaiB - nilaiA) / n;
        double s = f_trapesium(nilaiA) + f_trapesium(nilaiB);

        for (int i = 1; i < n; i++) {
            s += 2 * f_trapesium(nilaiA + i * h);
        }

        return (h / 2) * s;
    }
    
    public double f_simpson(double value) {
        return Math.log(value);
    }

    public double simpsons(double lower, double upper, int n) {
        double h = (upper - lower) / n;
        double[] x = new double[10];
        double[] fx = new double[10];

        for (int i = 0; i <= n; i++) {
            x[i] = lower + i * h;
            fx[i] = f_simpson(x[i]);
        }

        double res = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n) {
                res += fx[i];
            } else if (i % 2 != 0) {
                res += 4 * fx[i];
            } else {
                res += 2 * fx[i];
            }
        }

        res = res * (h / 3);
        return res;
    }
    
    public double f_romberg(double value) {
        double e = 2.718281828;
        value = Math.pow(value, 2);
        e = Math.pow(e, -value);
        value = e;
        return value;
    }
}
