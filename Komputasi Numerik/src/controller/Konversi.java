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
	
	public String OktaltoBiner(int value)
	{
		return Integer.toBinaryString(value);
	}
	
	public String OktaltoOktal(int value)
	{
		return Integer.toOctalString(value);
	}
	
	public String OktaltoDesimal(int value)
	{
		return Integer.toString(value);
	}
	
	public String OktaltoHexa(int value)
	{
		return Integer.toHexString(value);
	}
	
	public String DesimaltoBiner(int value)
	{
		return Integer.toBinaryString(value);
	}
	
	public String DesimaltoOktal(int value)
	{
		return Integer.toOctalString(value);
	}
	
	public String DesimaltoDesimal(int value)
	{
		return Integer.toString(value);
	}
	
	public String DesimaltoHexa(int value)
	{
		return Integer.toHexString(value);
	}
	
	public String HexatoBiner(int value)
	{
		return Integer.toBinaryString(value);
	}
	
	public String HexatoOktal(int value)
	{
		return Integer.toOctalString(value);
	}
	
	public String HexatoDesimal(int value)
	{
		return Integer.toString(value);
	}
	
	public String HexatoHexa(int value)
	{
		return Integer.toHexString(value);
	}
	
	public double fracBinertoDesimal(String value) {
		double sum;
		
		if(value.contains(".")) {
			String[] b = value.split("\\.");
			
			int sum1 = Integer.parseInt(b[0], 2);
			
			double sum2 = latterPart(b[1]);
			
			sum=sum1+sum2;
		} else {
			sum = Integer.parseInt(value, 2);
		}
		
		return sum;
	}
	
	public double latterPart(String number) {
		double sum = 0;
		int length = number.length();
		
		for(int i = 0; i < length; i++) {
			int e = -i-1;
			char mult = number.charAt(i);
			int num = Integer.parseInt(String.valueOf(mult));
			double num1 = num * Math.pow(2, e);
			sum = sum + num1;
		}
		
		return sum;
	}
	
	public double fracDesimaltoBiner(double value, int precision)
    {
        String binary = ".";
        int a = (int) value;
        
        value = value - a;
        
        for (int i = 0; i < precision; ++i)
        {
            value *= 2;
            int fracBit = (int) value;
            value -= fracBit;
            binary += String.valueOf(fracBit);
            
            if (value == 0) break;
        }
        
        return (Double.parseDouble(Integer.toBinaryString(a)) + Double.parseDouble(binary));
    }
	
	public double fracDesimaltoOktal(double value, int precision)
    {
        String binary = ".";
        int a = (int) value;
        
        value = value - a;
        
        for (int i = 0; i < precision; ++i)
        {
            value *= 8;
            int fracBit = (int) value;
            value -= fracBit;
            binary += String.valueOf(fracBit);
            
            if (value == 0) break;
        }
        
        return (Double.parseDouble(Integer.toOctalString(a)) + Double.parseDouble(binary));
    }
}
