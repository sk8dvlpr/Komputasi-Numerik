package views;

import java.text.DecimalFormat;
import java.util.Scanner;

import controller.Controller;
import util.Utilities;

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
		double galatRelatif = process.error.galatRelatif(galatMutlak, nilaiHamparan);
		double persentase = process.error.galatRelatif(galatMutlak, nilaiSejati);
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
		double nilaiSejati[] = new double[5];
		double nilaiHamparan[] = new double[5];
		
		this.judul();
		System.out.println("===================================================");
		System.out.println("            Perhitungan Penjalaran Galat           ");
		System.out.println("===================================================");
		
		for	(int i = 1; i <= 2; i++) {
			System.out.print("= Masukkan Nilai Sejati Bilangan " + i + " : ");
			nilaiSejati[i] = input.nextDouble();
		}
		
		for	(int i = 1; i <= 2; i++) {
			System.out.print("= Masukkan Nilai Hamparan Bilangan " + i + " : ");
			nilaiHamparan[i] = input.nextDouble();
		}
		
		double galatMutlak[] = new double[5];
		double galatRelatif[] = new double[5];
		double presentase[] = new double[5];
		double presentaseGalat[] = new double[5];
		
		for	(int i = 1; i <= 2; i++) {
			galatMutlak[i] = process.error.galatMutlak(nilaiSejati[i], nilaiHamparan[i]);
			galatRelatif[i] = process.error.galatRelatif(galatMutlak[i], nilaiHamparan[i]);
			presentase[i] = process.error.galatRelatif(galatMutlak[i], nilaiSejati[i]);
			presentaseGalat[i] = process.error.persentaseGalat(presentase[i], 100);
		}

		double totalSejati = nilaiSejati[1] + nilaiSejati[2];
		double totalHampiran = nilaiHamparan[1] + nilaiHamparan[2];
		double error = galatMutlak[1] + galatMutlak[2];
		
		galatMutlak[3] = process.error.galatMutlak(totalSejati, totalHampiran);
		presentase[3] = process.error.galatRelatif(galatMutlak[3], totalSejati);
		presentaseGalat[3] = process.error.persentaseGalat(presentase[3], 100);
		
		System.out.println("===================================================");
        System.out.println("=                      HASIL                      =");
        System.out.println("===================================================");
        
        for	(int i = 1; i <= 2; i++) {
			System.out.println("= BILANGAN " + i);
			System.out.println("===================================================");
			System.out.println("= Galat Mutlak     : " + df.format(galatMutlak[i]));
			System.out.println("= Galat Relatif    : " + df.format(galatRelatif[i]));
			System.out.println("= Presentase Galat : " + df.format(presentaseGalat[i]));
			System.out.println("===================================================");
		}
        
		System.out.println("= PENJALARAN GALAT =");
		System.out.println("===================================================");
		System.out.println("Bilangan 1 + Bilangan 2 : " + df.format(totalSejati));
		System.out.println("Nilai A'   + Nilai B'   : " + df.format(totalHampiran));
		System.out.println("Total Penjalaran        : " + df.format(error));
		System.out.println("Persentase Galat        : " + df.format(presentaseGalat[3]) + "%");
		System.out.println("===================================================");
	}
	
	public Utilities help = new Utilities();
	public Scanner input = new Scanner(System.in);
	public DecimalFormat df = new DecimalFormat("#.#####");
	public static Views views = new Views();
	public static Controller process = new Controller();
}
