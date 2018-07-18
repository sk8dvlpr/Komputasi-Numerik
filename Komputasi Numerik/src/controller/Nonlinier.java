package controller;

public class Nonlinier
{
	public double fTitikTetap(double value)
	{
        return (Math.exp(-value)) - value;
    }

    public double gTitikTetap(double value)
    {
        return (Math.exp(-value));
    }
	
	public double bagidua(double value) 
	{
		return Math.pow(Math.E, value) - 5 * Math.pow(value, 2);
	}
	
	public double regulaFalsi(double value) {
        double e = 2.718281828459;
        return (3 * Math.pow(e, value)) - (2 * Math.pow(value, 2)) + 5;
	}
	
	public double newtonRaphson(double value)
	{
		return (value * value * value) + (value * value) - 10;
	}
	
	public double newtonRaphsonAksen(double value)
	{
		return (3 * value * value) + (2 * value);
	}
	
	public double scant(double value)
	{
		return  Math.pow(Math.E, value)-5*Math.pow(value, 2);
	}
}
