package views;

import java.text.DecimalFormat;
import java.util.Scanner;

import controller.Controller;
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
	
	public void galat()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("     Perhitungan Galat Relatif & Galat Mutlak      ");
		System.out.println("===================================================");
		System.out.println("= Masukkan Nilai Sejati   : ");
		double nilaiSejati = input.nextDouble();
		System.out.println("= Masukkan Nilai Hamparan : ");
		double nilaiHamparan = input.nextDouble();
		
		double galatMutlak = process.error.galatMutlak(nilaiSejati, nilaiHamparan);
		double galatRelatif = process.error.galatRalatif(galatMutlak, nilaiHamparan);
		double persentase = process.error.galatRalatif(galatMutlak, nilaiSejati);
        double persentase_galat = process.error.persentaseGalat(persentase, 100);
		
        System.out.println("===================================================");
        System.out.println("=                      HASIL                      =");
        System.out.println("===================================================");
        System.out.println("Galat Mutlak     : " + df.format(galatMutlak));
        System.out.println("Galat Relatif    : " + df.format(galatRelatif));
        System.out.println("Presentase Galat : " + df.format(persentase_galat) + "%");
        System.out.println("===================================================");
        help.getHoldConsole();
        views.menu.galat();
	}
	
	public void penjalaran()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("            Perhitungan Penjalaran Galat           ");
		System.out.println("===================================================");
		System.out.print("= Masukkan Nilai Sejati Bilangan 1   : ");
		double nilaiSejatiA = input.nextDouble();
		System.out.print("= Masukkan Nilai Hamparan Bilangan 1 : ");
		double nilaiHamparanA = input.nextDouble();
		System.out.print("= Masukkan Nilai Sejati Bilangan 2   : ");
		double nilaiSejatiB = input.nextDouble();
		System.out.print("= Masukkan Nilai Hamparan Bilangan 2 : ");
		double nilaiHamparanB = input.nextDouble();
		
		double galatMutlakA = process.error.galatMutlak(nilaiSejatiA, nilaiHamparanA);
		double galatMutlakB = process.error.galatMutlak(nilaiSejatiB, nilaiHamparanB);

		double galatRelatifA = process.error.galatRalatif(galatMutlakA, nilaiHamparanA);
		double galatRelatifB = process.error.galatRalatif(galatMutlakB, nilaiHamparanB);

		double persentaseA = process.error.galatRalatif(galatMutlakA, nilaiSejatiA);
        double persentaseGalatA = process.error.persentaseGalat(persentaseA, 100);
        
        double persentaseB = process.error.galatRalatif(galatMutlakB, nilaiSejatiB);
        double persentaseGalatB = process.error.persentaseGalat(persentaseB, 100);

		double totalSejati = nilaiSejatiA + nilaiSejatiB;
		double totalHampiran = nilaiHamparanA + nilaiHamparanB;
		double error = galatMutlakA + galatMutlakB;

		double persentaseSejati = totalSejati;
		double persentaseHampiran = totalHampiran;
		
		double galatMutlakC = process.error.galatMutlak(persentaseSejati, persentaseHampiran);
		double persentaseC = process.error.galatRalatif(galatMutlakC, persentaseSejati);
		double persentaseGalatC = process.error.persentaseGalat(persentaseC, 100);
		
		System.out.println("===================================================");
        System.out.println("=                      HASIL                      =");
        System.out.println("===================================================");
		System.out.println("= BILANGAN 1 =");
		System.out.println("===================================================");
		System.out.println("Galat Mutlak     : " + df.format(galatMutlakA));
		System.out.println("Galat Relatif    : " + df.format(galatRelatifA));
		System.out.println("Persentase Galat : " + df.format(persentaseGalatA) + "%");
		System.out.println("===================================================");
		System.out.println("= BILANGAN 2 =");
		System.out.println("===================================================");
		System.out.println("Galat Mutlak     : " + df.format(galatMutlakB));
		System.out.println("Galat Relatif    : " + df.format(galatRelatifB));
		System.out.println("Persentase Galat : " + df.format(persentaseGalatB) + "%");
		System.out.println("===================================================");
		System.out.println("= PENJALARAN GALAT =");
		System.out.println("===================================================");
		System.out.println("Bilangan 1 + Bilangan 2 : " + df.format(totalSejati));
		System.out.println("Nilai A'   + Nilai B'   : " + df.format(totalHampiran));
		System.out.println("Total Penjalaran        : " + df.format(error));
		System.out.println("Persentase Galat        : " + df.format(persentaseGalatC) + "%");
		System.out.println("===================================================");
	}
	
	public Util help = new Util();
	public Scanner input = new Scanner(System.in);
	public DecimalFormat df = new DecimalFormat("#.#####");
	public static Views views = new Views();
	public static Controller process = new Controller();
}
