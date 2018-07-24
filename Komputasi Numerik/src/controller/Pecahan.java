package controller;

public class Pecahan
{
	public void penjumlahanPecahan(double value, int looping)
    {
        double result = 0;
        for (int i = 1; i <= looping; i++) {
            result = result + value;
            System.out.println("= Hasil Penjumlahan Ke-[" + i + "] = " + result);
        }
        
        System.out.println("===================================================");
        System.out.println("= Hasil Perjumlahan Adalah : " + result);
        System.out.println("===================================================");
    }
}
