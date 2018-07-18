package controller;

public class Galat
{
	public double galatMutlak(double nilaiSejati, double nilaiHamparan) 
	{
		return (nilaiSejati - nilaiHamparan);
	}
	
	public double galatRalatif(double galatMutlak, double value)
	{
		return (galatMutlak / value);
	}
	
	public double persentaseGalat(double persentase, int value) 
	{
		return (persentase * value);
	}
}
