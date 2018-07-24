package views;

import java.util.Scanner;

import controller.Controller;
import util.Utilities;

public class Integral
{
	public void judul()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
	}
	
	public void trapesium()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=                 Metode Trapesium                =");
        System.out.println("===================================================");
        System.out.print("= Masukkan Nilai a : ");
		double nilaiA = input.nextDouble();
		System.out.print("= Masukkan Nilai b : ");
		double nilaiB = input.nextDouble();
		System.out.print("= Masukkan Nilai n : ");
		int n = input.nextInt();
		System.out.println("===================================================");
		System.out.println("Nilai Integral Adalah : " + Math.round(process.integral.trapesium(nilaiA, nilaiB, n) * 10000.0) / 10000.0);
		System.out.println("===================================================");
        help.getHoldConsole();
        views.menu.integral();
	}
	
	public void simpson()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=                  Metode Simpson                 =");
        System.out.println("===================================================");
        System.out.print("= Masukkan Batas Bawah : ");
		double batas_bawah = input.nextDouble();
		System.out.print("= Masukkan Batas Atas  : ");
		double batas_atas = input.nextDouble();
		System.out.print("= Masukkan nilai n     : ");
		int n = input.nextInt();
		System.out.println("===================================================");
		System.out.println("Nilai Simpson Adalah : " + process.integral.simpsons(batas_bawah,batas_atas, n));
		System.out.println("===================================================");		
        help.getHoldConsole();
        views.menu.integral();
	}
	
	public void romberg()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=                  Metode Romberg                 =");
        System.out.println("===================================================");
        System.out.print("= Masukkan nilai a : ");
		double bilA = input.nextDouble();
		System.out.print("= Masukkan nilai b : ");
		double bilB = input.nextDouble();
		System.out.print("= Masukkan nilai n : ");
		int n = input.nextInt();
		
		int i, j, k;
		double h, sum;
		double[][] r = new double[n][n];

        h = bilB - bilA;
        r[0][0] = (h / 2) * (process.integral.f_romberg(bilA) + process.integral.f_romberg(bilB));

        for (i = 1; i <= n - 1; i++) {
            h = h / 2;
            sum = 0;

            for (k = 1; k <= (Math.pow(2, i) - 1); k++) {
                sum = sum + process.integral.f_romberg(bilA + k * h);
            }

            r[i][0] = 0.5 * r[i - 1][0] + sum * h;
            System.out.println("r[" + i + "][0] = " + r[i][0]);
            for (j = 1; j <= i; j++) {
                r[i][j] = r[i][j - 1] + (r[i][j - 1] - r[i - 1][j - 1]) / (Math.pow(4, j) - 1);
                System.out.println("r[" + i + "][" + j + "] = " + r[i][j]);
            }
        }
        
        help.getHoldConsole();
        views.menu.integral();
	}
	
	public Utilities help = new Utilities();
	public Scanner input = new Scanner(System.in);
	public static Views views = new Views();
	public static Controller process = new Controller();
}
