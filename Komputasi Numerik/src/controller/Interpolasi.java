package controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Interpolasi
{

	public double fx_polinomialNewton(double x) 
	{
        double fx;
        fx = 0.2657 * x + 2.895;
        return fx;
    }

	public BigDecimal lagrangeInterpolasi(BigDecimal titikX, int derajatPolinom, double[] nilaiX, double[] nilaiY, int tingkatKetelitian)
	{
        BigDecimal lagrange = new BigDecimal("0");
        
        for (int i = 0; i <= derajatPolinom; i++) {
            BigDecimal pi = new BigDecimal("1");
            
            for (int j = 0; j <= derajatPolinom; j++) {
                if (i != j)
                    pi = pi.multiply((titikX.subtract(BigDecimal.valueOf(nilaiX[j]))).divide(BigDecimal.valueOf(nilaiX[i]).subtract(BigDecimal.valueOf(nilaiX[j])),tingkatKetelitian, RoundingMode.HALF_EVEN));
            }
            
            lagrange = lagrange.add(pi.multiply(BigDecimal.valueOf(nilaiY[i])));
        }
        return lagrange;
    }

}
