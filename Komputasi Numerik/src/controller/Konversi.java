package controller;

public class Konversi
{
	public String getBinarytoOctal(String value)
	{
		int valueNew = Integer.parseInt(value);
		int result = 0, decimal = 0, i = 0;
		
		while(valueNew != 0)
        {
            decimal += (valueNew % 10) * Math.pow(2, i);
            ++i;
            valueNew /= 10;
        }

        i = 1;

        while (decimal != 0)
        {
            result += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        
        return String.valueOf(result);
	}
	
	public String getBinarytoDecimal(String value)
	{
		int valueNew = Integer.parseInt(value);
		int result = 0, i = 0;
        while(valueNew != 0)
        {
            result += ((valueNew%10) * Math.pow(2,i));
            valueNew = valueNew / 10;
            i++;
        }
        
        return String.valueOf(result);
	}
	
	public void getBinarytoHex(String value)
	{
		int valueNew = Integer.parseInt(value);
		int[] hex = new int[1000];
		int i = 1, j = 0, temp, decimal = 0;
		
		while (valueNew > 0)
		{
			temp = valueNew % 2;
			decimal = decimal + temp * i;
			i = i * 2;
			valueNew = valueNew / 10;
		}
		
		i = 0;
		while (decimal != 0)
		{
			hex[i] = decimal % 16;
			decimal = decimal / 16;
			i++;
		}
		
		for (j = i - 1; j >= 0; j--)
		{
			if (hex[j] > 9)
				System.out.print((char)(hex[j] + 55));
			else
				System.out.print(hex[j]);
		}
		
		System.out.println();
	}
	
	public String getOctaltoBinary(String value)
	{
		int valueNew = Integer.parseInt(value);
		int decimal = 0, i = 0;
        long result = 0;

        while(valueNew != 0)
        {
            decimal += (valueNew % 10) * Math.pow(8, i);
            ++i;
            valueNew/=10;
        }

        i = 1;

        while (decimal != 0)
        {
            result += (decimal % 2) * i;
            decimal /= 2;
            i *= 10;
        }
        
        return String.valueOf(result);
	}
	
	public String getOctaltoDecimal(String value)
	{
		String valueNew = this.getOctaltoBinary(value);
		return this.getBinarytoDecimal(valueNew);
	}
	
	public void getOctaltoHex(String value)
	{
		String valueNew = this.getOctaltoBinary(value);
		this.getBinarytoHex(valueNew);
	}
	
	public void getDecimaltoBinary(int value)
	{
		int temp;

        if (value <= 1) 
        {
            System.out.print(value);
            return;
        }

        temp = value % 2;
        this.getDecimaltoBinary(value >> 1);
        System.out.print(temp);
	}
	
	public String getDecimaltoOctal(String value)
	{
		String valueNew = Integer.toBinaryString(Integer.parseInt(value));
		return this.getBinarytoOctal(valueNew);
	}
	
	public void getDecimaltoHex(String value)
	{
		String valueNew = Integer.toBinaryString(Integer.parseInt(value));
		this.getBinarytoHex(valueNew);
	}
	
	public void getHextoBinary(String value)
	{
		int desimal, i=1, j;
        int biner[] = new int[100];
        
        desimal = this.getHextoDecimal(value);
        
        while(desimal != 0) {
            biner[i++] = desimal%2;
            desimal = desimal/2;
        }
        
        for(j=i-1; j>0; j--) {
            System.out.print(biner[j]);
        }
        
        System.out.println();
	}
	
	public String getHextoOctal(String value)
	{
		int valueNew = this.getHextoDecimal(value);
		return this.getDecimaltoOctal(String.valueOf(valueNew));
	}
	
	public int getHextoDecimal(String s)
	{
		String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        
        return val;
	}
	
	public double getFractionBinarytoOctal(String value)
	{
		double valueNew = this.getFractionBinarytoDecimal(value);
		return this.getFractionDecimaltoOctal(valueNew, 7);
	}
	
	public double getFractionBinarytoDecimal(String value) {
		double sum;
		
		if(value.contains(".")) {
			String[] b = value.split("\\.");
			
			int sum1 = Integer.parseInt(b[0], 2);
			
			double sum2 = fracBintoDec(b[1]);
			
			sum=sum1+sum2;
		} else {
			sum = Integer.parseInt(value, 2);
		}
		
		return sum;
	}
	
	public double fracBintoDec(String number)
	{
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
	
	public void getFractionBinarytoHex(String value)
	{
		double valueNew = this.getFractionBinarytoDecimal(value);
		
		double bilanganBaru[] = new double[100];
        
        int firstResult = (int) valueNew;
        valueNew = valueNew - firstResult;
        
        bilanganBaru[0] = valueNew;
		double a[] = new double[100];
		
		String secResult = "";
		
		for (int i = 0; i < 10; i++) {
			a[i] = bilanganBaru[i] * 16;
			int temp = (int) a[i];
				if (temp == 10) {
					secResult = secResult + "" + "A";
				}
				else if (temp == 11) {
					secResult = secResult + "" + "B";
				}
				else if (temp == 12) {
					secResult = secResult + "" + "C";
				}
				else if (temp == 13) {
					secResult = secResult + "" + "D";
				}
				else if (temp == 14) {
					secResult = secResult + "" + "E";
				}
				else if (temp == 15) {
					secResult = secResult + "" + "F";
				}
				else {
					secResult = secResult + "" + temp;
				}
				
				bilanganBaru[i+1] = a[i] - (int) a[i];
				if (temp == 0) {
					break;
				}
		}
		
		System.out.println(Integer.toHexString(firstResult)+"."+secResult);
	}
	
	public String getFractionOctaltoBinary(String value)
	{
		String[] items = value.split("\\.");
		String result = "";
		
		String left = items[0];
		String right = items[1];
		
		String temp = this.fracDectoBin(left.substring(0, 1));
		result = result + temp;
		temp = "";
		String firstResult = "", secResult = "";
		
		for (int i = 1; i < left.length(); i++) {
			temp = this.fracDectoBin(left.substring(i, i+1));
			if (temp.length() == 1) 
				firstResult = firstResult + "00" + temp;
			else if (temp.length() == 2)
				firstResult = firstResult + "0" + temp;
			else {
				firstResult = firstResult + "" + temp;
			}
		}
		
		for (int i = 0; i < right.length(); i++) {
			temp = this.fracDectoBin(right.substring(i, i+1));
			if (temp.length() == 1) 
				secResult = secResult + "00" + temp;
			else if (temp.length() == 2)
				secResult = secResult + "0" + temp;
			else {
				secResult = secResult + "" + temp;
			}
		}
		
		result = result + "" + firstResult + "." + secResult;
		
		return result;
	}
	
	public String fracDectoBin(String value)
	{
		int result = Integer.parseInt(value);
		return Integer.toBinaryString(result);
	}
	
	public double getFractionOctaltoDecimal(String value)
	{
		String temp = this.getFractionOctaltoBinary(value);
		return this.getFractionBinarytoDecimal(temp);
	}
	
	public void getFractionOctaltoHex(String value)
	{
		String temp = this.getFractionOctaltoBinary(value);
		this.getFractionBinarytoHex(temp);
	}
	
	public double getFractionDecimaltoBinary(double value, int precision)
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
	
	public double getFractionDecimaltoOctal(double value, int precision)
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
	
	public void getFractionDecimaltoHex(String value)
	{
		String temp = String.valueOf(this.getFractionDecimaltoBinary(Double.parseDouble(value), 7));
		this.getFractionBinarytoHex(temp);
	}
	
	public String getFractionHextoBinary(String value)
	{
		String[] items = value.split("\\.");
		
		String left = items[0];
		String right = items[1];
		
		String result = "", firstResult = "", secResult = "";
		String temp = this.HextoBinary(left.substring(0, 1));
		result = result + "" + temp;
		
		temp = "";
		for (int i = 1; i < left.length(); i++) {
			temp = this.HextoBinary(left.substring(i, i+1));
			
			if (temp.length() == 1)
				firstResult = firstResult + "000" + temp;
			else if (temp.length() == 2)
				firstResult = firstResult + "00" + temp;
			else if (temp.length() == 3)
				firstResult = firstResult + "0" + temp;
			else 
				firstResult = firstResult + "" + temp;
		}
		
		for (int i = 0; i < right.length(); i++) {
			temp = this.HextoBinary(right.substring(i, i+1));
			if (temp.length() == 1) 
				secResult = secResult + "000" + temp;
			else if (temp.length() == 2)
				secResult = secResult + "00" + temp;
			else if (temp.length() == 3)
				secResult = secResult + "0" + temp;
			else {
				secResult = secResult + "" + temp;
			}
		}
		
		result = result + "" + firstResult + "." + secResult;
		
		return result;
	}
	
	public String HextoBinary(String value)
	{
		int result = Integer.parseInt(value , 16);
		return Integer.toBinaryString(result);
	}
	
	public String getFractionHextoOctal(String value)
	{
		String valueNew = this.getFractionHextoBinary(value);
		return String.valueOf(this.getFractionBinarytoOctal(valueNew));
	}
	
	public String getFractionHextoDecimal(String value) {
		String valueNew = this.getFractionHextoBinary(value);
		return String.valueOf(this.getFractionBinarytoDecimal(valueNew));
	}
}
