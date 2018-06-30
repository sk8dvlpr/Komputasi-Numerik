package views;

import java.text.DecimalFormat;
import java.util.Scanner;

import controller.Controller;
import util.Util;

public class Nonlinier
{
	public void judul()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
	}
	
	public void titikTetap()
	{
		int i;
		double fixed;
		double gx[] = new double[100];
		double fx[] = new double[100];
		double value[] = new double[100];
		
		this.judul();
		System.out.println("===================================================");
		System.out.println("            Nonlinier Metode Titik Tetap           ");
		System.out.println("===================================================");
		System.out.println("=                    DIKETAHUI                    =");
		System.out.println("===================================================");
		System.out.println("= f(x) : x - e^(-x)                               =");
		System.out.println("= x    : e^(-x)                                   =");
		System.out.println("===================================================");
		System.out.print("= Tentukan Nilai Awal  : "); value[0] = input.nextDouble();
		System.out.print("= Tentukan Titik Tetap : "); fixed = input.nextDouble();
		
		System.out.println("===================================================");
		System.out.println("=                      HASIL                      =");
		System.out.println("===================================================");
		System.out.println("= Iterasi    x               g(x)            f(x)  ");
		
		for (i = 0; i < fixed; i++)
		{
			
			fx[i] = value[i] - proses.metode.titikTetap(value[i]);
			gx[i] = proses.metode.titikTetap(value[i]);
			
			System.out.println("= " + (i+1) + "          " + df.format(value[i]) + "          " + df.format(gx[i]) + "          " + df.format(fx[i]));
			
			value[i+1] = gx[i];
		}
		
		System.out.println("===================================================");
		System.out.println("= Jadi Hamparan Akar Yang Diperoleh Menggunakan    ");
		System.out.println("= Metode Titik Tetap Adalah : " + df.format(value[i-1]));
		System.out.println("===================================================");
		
		help.getHoldConsole();
		help.getClearConsole();
		tampilan.menu.nonlinier();
	}
	
	public void bagiDua()
	{
		int iterasi;
		double a[] = new double[100];
		double b[] = new double[100];
		double x[] = new double[100];
		double fa[] = new double[100];
		double fx[] = new double[100];
		
		this.judul();
		System.out.println("===================================================");
		System.out.println("              Nonlinier Metode Bagi Dua            ");
		System.out.println("===================================================");
		System.out.println("=                    DIKETAHUI                    =");
		System.out.println("===================================================");
		System.out.println("= f(x) : x.e - x+1                                =");
		System.out.println("===================================================");
		System.out.print("= Masukkan Nilai a : "); a[0] = input.nextDouble();
		System.out.print("= Masukkan Nilai b : "); b[0] = input.nextDouble();
		
		x[0] = ((a[0]+b[0])/2);
		
		System.out.println("=\n");
		System.out.println("= Nilai x0 : " + x[0]);
		System.out.print("= Tentukan Batas Iterasi : "); iterasi = input.nextInt();
		
		for(int i = 0; i < iterasi; i++) {
			fa[i] = (Math.pow(a[i], 3) + 4*Math.pow(a[i], 2) - 10);
			fx[i] = (Math.pow(x[i], 3) + 4*Math.pow(x[i], 2) - 10);
			
			// fa[i] = (a[i] * Math.exp(1) - a[i] + 1);
			// fx[i] = (x[i] * Math.exp(1) - x[i] + 1);
			
			System.out.println("= " + (i + 1) + "\t\t" + df.format(a[i]) + "\t\t" + df.format(b[i]) + "\t\t" + df.format(x[i]) + "\t\t" + df.format(fa[i]) + "\t\t" + df.format(fx[i]));
			
			if (fa[i] * fx[i] < 0) {
				a[i+1] = a[i];
				b[i+1] = x[i];
			} else {
				if (fa[i] * fx[i] > 0) {
					a[i+1] = x[i];
					b[i+1] = b[i];
				}
				
				x[i+1] = (a[i+1] + b[i+1] / 2);
			}
		}
	}
	
	public void regulaFalsi()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("           Nonlinier Metode Regula Falsi           ");
		System.out.println("===================================================");
	}
	
	public void newtonRaphson()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("           Nonlinier Metode Newton Raphson         ");
		System.out.println("===================================================");
	}
	
	public void scant()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("               Nonlinier Metode Scant              ");
		System.out.println("===================================================");
	}
	
	public Util help = new Util();
	public Scanner input = new Scanner(System.in);
	public static Controller proses = new Controller();
	public static Views tampilan = new Views();
	public DecimalFormat df = new DecimalFormat("##0.0000");
}
