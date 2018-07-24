package controller;

import util.*;
import views.*;

public class Menu
{
	public void utama(int menu)
	{
		switch (menu) {
		case 1:
			views.fraction.penjumlahanPecahan();
			break;
			
		case 2:
			views.menu.konversi();
			break;
			
		case 3:
			views.menu.galat();
			break;
			
		case 4:
			views.menu.nonlinier();
			break;
			
		case 5:
			views.menu.interpolasi();
			break;
			
		case 6:
			views.menu.turunan();
			break;
			
		case 7:
			views.menu.integral();
			break;
			
		case 8:
			help.getClearConsole();
			System.out.println("Terimakasih Telah Menggunakan Aplikasi Ini ...");
			help.getHoldConsole();
			System.exit(0);
			break;
			
		default:
			help.getErrorMessage();
			views.menu.utama();
			break;
			
		}
	}
	
	public void konversi_bilangan(int menu)
	{
		switch (menu) {
		case 1:
			views.convert.binary();
			break;
			
		case 2:
			views.convert.octal();
			break;
			
		case 3:
			views.convert.decimal();
			break;
			
		case 4:
			views.convert.hex();
			break;
			
		case 5:
			views.convert.fractionBinary();
			break;
			
		case 6:
			views.convert.fractionOctal();
			break;
			
		case 7:
			views.convert.fractionDecimal();
			break;
			
		case 8:
			views.convert.fractionHex();
			break;
			
		case 9:
			views.menu.utama();
			break;
			
		default:
			help.getErrorMessage();
			views.menu.konversi();
			break;
			
		}
	}
	
	public void galat(int menu)
	{
		switch (menu) {
		case 1:
			views.error.galat();
			break;
			
		case 2:
			views.error.penjalaran();
			break;
			
		case 3:
			views.menu.utama();
			break;
			
		default:
			help.getErrorMessage();
			views.menu.galat();
			break;
			
		}
	}
	
	public void nonlinier(int menu)
	{
		switch (menu) {
		case 1:
			views.nonlinier.titikTetap();
			break;
			
		case 2:
			views.nonlinier.bagiDua();
			break;
			
		case 3:
			views.nonlinier.regulaFalsi();
			break;
			
		case 4:
			views.nonlinier.newtonRaphson();
			break;
			
		case 5:
			views.nonlinier.scant();
			break;
			
		case 6:
			views.menu.utama();
			break;
			
		default:
			help.getErrorMessage();
			views.menu.nonlinier();
			break;
			
		}
	}

	public void interpolasi(int menu)
	{
		switch (menu) {
		case 1:
			views.interpolasi.pendekatanLagrange();
			break;
			
		case 2:
			views.interpolasi.polinomialNewton();
			break;
			
		case 3:
			views.menu.utama();
			break;
			
		default:
			help.getErrorMessage();
			views.menu.interpolasi();
			break;
			
		}
	}
	
	public void turunan(int menu)
	{
		switch (menu) {
		case 1:
			views.turunan.selisihBagi();
			break;
			
		case 2:
			views.turunan.orderh2();
			break;
			
		case 3:
			views.turunan.orderh4();
			break;
			
		case 4:
			views.menu.utama();
			break;
			
		default:
			help.getErrorMessage();
			views.menu.turunan();
			break;
			
		}
	}
	
	public void integral(int menu)
	{
		switch (menu) {
		case 1:
			views.integral.trapesium();
			break;
			
		case 2:
			views.integral.simpson();
			break;
			
		case 3:
			views.integral.romberg();
			break;
			
		case 4:
			views.menu.utama();
			break;
			
		default:
			help.getErrorMessage();
			views.menu.integral();
			break;
			
		}
	}
	
	public Utilities help = new Utilities();
	public Views views = new Views();
}
