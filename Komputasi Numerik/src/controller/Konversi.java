package controller;

public class Konversi
{
	public String BinertoBiner(int value)
	{
		return Integer.toBinaryString(value);
	}
	
	public String BinertoOktal(int value)
	{
		return Integer.toOctalString(value);
	}
	
	public String BinertoDesimal(int value)
	{
		return Integer.toString(value);
	}
	
	public String BinertoHexa(int value)
	{
		return Integer.toHexString(value);
	}
}
