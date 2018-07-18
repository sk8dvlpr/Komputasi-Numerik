package views;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

import controller.Controller;
import util.Util;

public class Interpolasi
{
	public void judul()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
	}
	
	public void pendekatanLagrange()
	{
		double nilaiX[] = new double[4];
        double nilaiY[] = new double[4];
        
		this.judul();
        System.out.println("===================================================");
        System.out.println("=               Pendekatan Lagrange               =");
        System.out.println("===================================================");
        System.out.print("= Masukkan nilai x0 : ");
		nilaiX[0] = input.nextDouble();
		System.out.print("= Masukkan nilai y0 : ");
		nilaiY[0] = input.nextDouble();
		System.out.print("= Masukkan nilai x1 : ");
		nilaiX[1] = input.nextDouble();
		System.out.print("= Masukkan nilai y1 : ");
		nilaiY[1] = input.nextDouble();
		System.out.print("= Masukkan nilai x2 : ");
		nilaiX[2] = input.nextDouble();
		System.out.print("= Masukkan nilai y2 : ");
		nilaiY[2] = input.nextDouble();
		System.out.print("= Masukkan nilai x3 : ");
		nilaiX[3] = input.nextDouble();
		System.out.print("= Masukkan nilai y3 : ");
		nilaiY[3] = input.nextDouble();
		
		System.out.println("===================================================");
		System.out.println("Nilai x dan y yang diketahui : ");
        for (int i = 0; i < nilaiX.length; i++) {
        	System.out.println("x = " + nilaiX[i] + ", \ty = " + nilaiY[i]);
        }

        BigDecimal titikX = BigDecimal.valueOf(0.5);
        int derajatPolinom = nilaiX.length - 1;
        int tingkatKetelitian = 10;

        BigDecimal lagrange = process.interpolasi.lagrangeInterpolasi(titikX, derajatPolinom, nilaiX, nilaiY, tingkatKetelitian);
        System.out.println("===================================================");
        System.out.println("Derajat polinom             : " + derajatPolinom);
        System.out.println("Hitung nilai y pada titik x : " + titikX + "!");
        System.out.println("===================================================");
        System.out.println("Hasil Interpolasi pada titik x = " + titikX + " adalah " + df.format(lagrange));
        System.out.println("===================================================");
        
        help.getHoldConsole();
        views.menu.turunan();
	}
	
	public void polinomialNewton()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=                 Polinomial Newton               =");
        System.out.println("===================================================");
        System.out.print("= Masukkan Nilai x0 : ");
		double a = input.nextDouble();
		System.out.print("= Masukkan Nilai x1 : ");
		double b = input.nextDouble();
		System.out.print("= Masukkan Nilai x2 : ");
		double c = input.nextDouble();
		System.out.print("= Masukkan Nilai x3 : ");
		double d = input.nextDouble();
		System.out.print("= Masukkan Nilai x4 : ");
		double e = input.nextDouble();
		
		double fa = process.interpolasi.fx_polinomialNewton(a), fb = process.interpolasi.fx_polinomialNewton(b), fc = process.interpolasi.fx_polinomialNewton(c), fd = process.interpolasi.fx_polinomialNewton(d), fe = process.interpolasi.fx_polinomialNewton(e), f45;
		
		f45 = process.interpolasi.fx_polinomialNewton(4.5);
		System.out.println();
        System.out.println("fx = 0.2657* x + 2.895");
        System.out.println("f(4,5)= " + df.format(f45));
        System.out.println("Polinom newton");
        
        double st1a, st1b, st1c, st1d;
        double st2a, st2b, st2c;
        double st3a, st3b;
        double st4a;

        st1a = (fb - fa) / (b - a);
        st1b = (fc - fb) / (c - b);
        st1c = (fd - fc) / (d - c);
        st1d = (fe - fd) / (e - d);
        
        st2a = (st1b - st1a) / (c - a);
        st2b = (st1c - st1b) / (d - b);
        st2c = (st1d - st1c) / (e - c);
        
        st3a = (st2b - st2a) / (d - a);
        st3b = (st2c - st2b) / (e - b);
        
        st4a = (st3b - st3a) / (e - a);
        
        System.out.println("===================================================");
		System.out.println("x \t\ty \t\tst1 \t\tst2 \t\tst3 \t\tst4");
        System.out.println(a + "\t\t" + df.format(fa) + "\t\t" + df.format(st1a) + "\t\t" + df.format(st2a) + "\t\t" + df.format(st3a) + "\t\t" + df.format(st4a));
        System.out.println(b + "\t\t" + df.format(fb) + "\t\t" + df.format(st1b) + "\t\t" + df.format(st2b) + "\t\t" + df.format(st3b));
        System.out.println(c + "\t\t" + df.format(fc) + "\t\t" + df.format(st1c) + "\t\t" + df.format(st2c));
        System.out.println(d + "\t\t" + df.format(fd) + "\t\t" + df.format(st1d));
        System.out.println(e + "\t\t" + df.format(fe) + "\t\t");
        System.out.println("===================================================");
        
        double f45p;
        f45p = fa + st1a * (4.5 - a) + st2a * (4.5 - a) * (4.5 - b) + st3a * (4.5 - a) * (4.5 - b) * (4.5 - c) + st4a * (4.5 - a) * (4.5 - b) * (4.5 - c) * (4.5 - d);
        System.out.println("Hasil polinom newton : " + df.format(f45p));
        System.out.println("===================================================");
        help.getHoldConsole();
        views.menu.turunan();
	}
	
	public Util help = new Util();
	public Scanner input = new Scanner(System.in);
	public static Views views = new Views();
	public static Controller process = new Controller();
	public DecimalFormat df = new DecimalFormat("#.#####");
}
