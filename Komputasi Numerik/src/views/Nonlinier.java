package views;

import java.text.DecimalFormat;
import java.util.Scanner;

import controller.Controller;
import util.Utilities;

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
		this.judul();
		System.out.println("===================================================");
		System.out.println("            Nonlinier Metode Titik Tetap           ");
		System.out.println("===================================================");
		System.out.print("= Tentukan Nilai Awal  : ");
		double value = input.nextDouble();
		System.out.print("= Tentukan Nilai Error : ");
		double error = input.nextDouble();
		System.out.print("= Iterasi              : ");
		double iterasi = input.nextDouble();
		
		double y = 0;
		int i = 0;
		
		System.out.println("===================================================");
        System.out.println("=                      HASIL                      =");
        System.out.println("===================================================");
		System.out.println("iterasi \tx0 \t\tfx");
		System.out.println("===================================================");
        while (Math.abs(process.nonlinier.fTitikTetap(value)) >= error && i < iterasi) {
            i++;
            value = process.nonlinier.gTitikTetap(value);
            y = process.nonlinier.fTitikTetap(value);
            System.out.println(i + "\t\t" + df.format(value) + "\t\t" + df.format(y));
        }
        System.out.println("===================================================");
        System.out.println("Akar Terletak Di " + df.format(value) +  " Dengan Nilai f(x) = " + y);
        System.out.println("===================================================");
		
		help.getHoldConsole();
		help.getClearConsole();
		views.menu.nonlinier();
	}
	
	public void bagiDua()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("              Nonlinier Metode Bagi Dua            ");
		System.out.println("===================================================");
		System.out.print("= Masukkan nilai x(0) : ");
		double x0 = input.nextDouble();
		System.out.print("= Masukkan batas x(1) : ");
		double x1 = input.nextDouble();
		System.out.print("= Iterasi             : ");
		int iterasi = input.nextInt();
		
		double c, fa, fb, fc, lebar2 = 0;
		System.out.println("===================================================");
		System.out.println("Iterasi \tNilai Tengah \tError \t\tLebar");
		System.out.println("===================================================");
		for (int i = 0; i < iterasi; i++) {
            c = (x0 + x1) / 2;
            lebar2 = c - x0;
            fa = process.nonlinier.bagidua(x0);
            fb = process.nonlinier.bagidua(x1);
            fc = process.nonlinier.bagidua(c);
            if ((fa * fc < 0)) {
                x0 = x0;
                x1 = c;
            } else {
                x0 = c;
                x1 = x1;
            }
            
            System.out.println(i + "\t\t" + df.format(c) + "\t\t" + df.format(fc) + "\t\t" + df.format(lebar2));
        }
		System.out.println("===================================================");
		help.getHoldConsole();
		views.menu.nonlinier();
	}
	
	public void regulaFalsi()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("           Nonlinier Metode Regula Falsi           ");
		System.out.println("===================================================");
		System.out.print("= Masukkan nilai x     : ");
		double bilX = input.nextDouble();
		System.out.print("= Masukkan nilai y     : ");
		double bilY = input.nextDouble();
		System.out.print("= Masukkan nilai error : ");
		double error = input.nextDouble();
		System.out.print("= Iterasi              : ");
		int iterasi = input.nextInt();
		
		double fa, fb, fc = 1000, c = 0;
		
		System.out.println("===================================================");
		System.out.println("iterasi \tX \t\tY \t\tHamparan Akar \tGalat");
		System.out.println("===================================================");
		for (int j = 0; j < iterasi; j++) {
            if (Math.abs(bilX - bilY) > error) {
                fa = process.nonlinier.regulaFalsi(bilX);
                fb = process.nonlinier.regulaFalsi(bilY);
                c = bilY - (fb * (bilY - bilX) / (fb - fa));
                fc = process.nonlinier.regulaFalsi(c);
                System.out.println(j + "\t\t" + df.format(bilX) + "\t\t" + df.format(bilY) + "\t\t" + df.format(c) + "\t\t" + df.format(fc));
                if (Math.abs(fc) < error) {
                    bilX = c;
                    bilY = c;

                } else {
                    if (fa * fc < 0) {
                        bilY = c;
                    } else {
                        bilX = c;
                    }
                }
            }
        }
		System.out.println("===================================================");
		help.getHoldConsole();
		views.menu.nonlinier();
	}
	
	public void newtonRaphson()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("           Nonlinier Metode Newton Raphson         ");
		System.out.println("===================================================");
		System.out.print("= Masukkan nilai x     : ");
		double bilX = input.nextDouble();
		System.out.print("= Masukkan nilai error : ");
		double error = input.nextDouble();
		System.out.print("= Iterasi              : ");
		int iterasi = input.nextInt();
		
		double fx, fxAksen;
		System.out.println("===================================================");
		System.out.println("Iterasi \tX \t\tfx \t\tfx'");
		System.out.println("===================================================");
		for (iterasi = 0; iterasi <= 1000; iterasi++) {
            fx = process.nonlinier.newtonRaphson(bilX);
            fxAksen = process.nonlinier.newtonRaphsonAksen(bilX);
            System.out.println(iterasi + "\t\t" + df.format(bilX) + "\t\t" + df.format(fx) + "\t\t" + df.format(fxAksen));
            bilX = bilX - (fx / fxAksen);
            if (fx < 0) {
                fx = (-fx);
                if (fx <= error)
                    break;
            } else {
                if (fx <= error)
                    break;
            }
		}
		System.out.println("===================================================");
		help.getHoldConsole();
		views.menu.nonlinier();
	}
	
	public void scant()
	{
		this.judul();
		System.out.println("===================================================");
		System.out.println("=              Nonlinier Metode Scant             =");
		System.out.println("===================================================");
		System.out.print("= Masukkan Nilai x : ");
		double nilaiX = input.nextDouble();
		System.out.print("= Masukkan Nilai y : ");
		double nilaiY = input.nextDouble();
		System.out.print("= Iterasi          : ");
		int iterasi = input.nextInt();
		System.out.println("===================================================");
		System.out.println("Iterasi \tNilai Tengah \tLebar \t\tGalat");
		System.out.println("===================================================");
		
		double fa, fb, c, lebar = 0;
		for (int i = 1; i < iterasi; i++) {
            fa = process.nonlinier.scant(nilaiX);
            fb = process.nonlinier.scant(nilaiY);
            
            c = nilaiY - (fb * (nilaiY - nilaiX) / (fb - fa));
            lebar = c - nilaiX;
            nilaiX = nilaiY;
            nilaiY = c;
            if (fa == fb)
                break;
            
            System.out.println(i + "\t\t" + df.format(c) + "\t\t" + df.format(lebar) + "\t\t" + df.format(fb));
        }
		System.out.println("===================================================");
		help.getHoldConsole();
		views.menu.nonlinier();
	}
	
	public Utilities help = new Utilities();
	public Scanner input = new Scanner(System.in);
	public static Controller process = new Controller();
	public static Views views = new Views();
	public DecimalFormat df = new DecimalFormat("##0.0000");
}
