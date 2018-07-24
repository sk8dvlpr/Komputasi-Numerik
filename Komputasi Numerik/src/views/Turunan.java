package views;

import java.text.DecimalFormat;
import java.util.Scanner;

import controller.Controller;
import util.Utilities;

public class Turunan 
{
	public void judul()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
	}
	
	public void selisihBagi()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=            Formula Limit Selisih Bagi           =");
        System.out.println("===================================================");
        System.out.print("= Masukkan Nilai H : ");
		double nilaiH = input.nextDouble();
		System.out.print("= Masukkan Niali X : ");
		double nilaiX = input.nextDouble();
		
		System.out.println("===================================================");
        System.out.println("=                      HASIL                      =");
        System.out.println("===================================================");
		System.out.println("Limit Selisih Bagi : " + process.turunan.f_selisihBagi(nilaiX, nilaiH));
		System.out.println("===================================================");
        
        help.getHoldConsole();
        views.menu.turunan();
	}
	
	double x, ft, fek, fx, error, sigma = 0, total;
	
	public void orderh2()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=           Formula Terpusat Order O(h2)          =");
        System.out.println("===================================================");
        System.out.print("= Masukkan Batas Atas  : ");
		double batas_atas = input.nextDouble();
		System.out.print("= Masukkan Batas Bawah : ");
		double batas_bawah = input.nextDouble();
		System.out.print("= Masukkan nilai H     : ");
		double h = input.nextDouble();
		
	    int i = 0;
		
	    for (x = batas_atas; x <= batas_bawah; x += h) {
            i++;
            fx = process.turunan.f_order(x);
            ft = process.turunan.fungsi_tengahH2(x, h);
            fek = process.turunan.f_eksak(x);
            error = Math.abs(fek - ft);
            sigma = sigma + error;
            total = sigma / i;
        }
		
	    System.out.println("===================================================");
        System.out.println("=                      HASIL                      =");
        System.out.println("===================================================");
		System.out.println("X     : " + df.format(x));
		System.out.println("f(x)  : " + df.format(fx));
		System.out.println("f'(x) : " + df.format(ft));
		System.out.println("Eksak : " + df.format(fek));
		System.out.println("Error : " + df.format(error));
		System.out.println("===================================================");
		System.out.println("Rata - Rata Error : " + df.format(total));
		System.out.println("===================================================");
        
        help.getHoldConsole();
        views.menu.turunan();
	}
	
	public void orderh4()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=           Formula Terpusat Order O(h4)          =");
        System.out.println("===================================================");
        System.out.print("Masukkan batas atas : ");
		double batas_atas = input.nextDouble();
		System.out.print("Masukkan batas bawah : ");
		double batas_bawah = input.nextDouble();
		System.out.print("Masukkan nilai H : ");
		double h = input.nextDouble();
		
	    int i = 0;
		
		for (x = batas_atas; x <= batas_bawah; x += h) {
            i++;
            fx = process.turunan.f_order(x);
            ft = process.turunan.fungsi_tengahH4(x, h);
            fek = process.turunan.f_eksak(x);
            error = Math.abs(fek - ft);
            sigma = sigma + error;
            total = sigma / i;
        }
		
		System.out.println("===================================================");
        System.out.println("=                      HASIL                      =");
        System.out.println("===================================================");
		System.out.println("X     : " + df.format(x));
		System.out.println("f(x)  : " + df.format(fx));
		System.out.println("f'(x) : " + df.format(ft));
		System.out.println("Eksak : " + df.format(fek));
		System.out.println("Error : " + df.format(error));
		System.out.println("===================================================");
		System.out.println("Rata - Rata Error : " + df.format(total));
		System.out.println("===================================================");
        
        help.getHoldConsole();
        views.menu.turunan();
	}
	
	public Utilities help = new Utilities();
	public Scanner input = new Scanner(System.in);
	public static Views views = new Views();
	public static Controller process = new Controller();
	public DecimalFormat df = new DecimalFormat("#.#####");
}
