package views;

import util.Util;

public class Galat
{
	public void judul()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
	}
	
	public void relatif()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("             Perhitungan Galat Relatif             ");
		System.out.println("===================================================");
	}
	
	public void mutlak()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("             Perhitungan Galat Mutlak              ");
		System.out.println("===================================================");
	}
	
	public void penjalaran()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("            Perhitungan Penjalaran Galat           ");
		System.out.println("===================================================");
	}
	
	public Util help = new Util();
}
