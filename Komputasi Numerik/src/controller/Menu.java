package controller;

import util.*;
import views.*;

public class Menu
{
	public void utama(int menu)
	{
		switch (menu) {
		case 1:
			tampilan.pecahan.penjumlahanPecahan();
			break;
		case 2:
			tampilan.menu.konversi();
			break;
		case 3:
			tampilan.menu.galat();
			break;
		case 4:
			tampilan.menu.nonlinier();
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			help.getClearConsole();
			System.out.println("Terimakasih Telah Menggunakan Aplikasi Ini ...");
			help.getHoldConsole();
			System.exit(0);
			break;
		default:
			help.getErrorMessage();
			tampilan.menu.utama();
			break;
		}
	}
	
	public void konversi_bilangan(int menu)
	{
		switch (menu) {
		case 1:
			tampilan.konversi.binary();
			break;
		case 2:
			tampilan.konversi.octal();
			break;
		case 3:
			tampilan.konversi.decimal();
			break;
		case 4:
			tampilan.konversi.hex();
			break;
		case 5:
			tampilan.konversi.fractionBinary();
			break;
		case 6:
			tampilan.konversi.fractionOctal();
			break;
		case 7:
			tampilan.konversi.fractionDecimal();
			break;
		case 8:
			tampilan.konversi.pecahanHexa();
			break;
		case 9:
			tampilan.menu.utama();
			break;
		default:
			help.getErrorMessage();
			tampilan.menu.konversi();
			break;
		}
	}
	
	public void galat(int menu)
	{
		switch (menu) {
		case 1:
			tampilan.galat.relatif();
			break;
		case 2:
			tampilan.galat.mutlak();
			break;
		case 3:
			tampilan.galat.penjalaran();
			break;
		case 4:
			tampilan.menu.utama();
			break;
		default:
			help.getErrorMessage();
			tampilan.menu.galat();
			break;
		}
	}
	
	public void nonlinier(int menu)
	{
		switch (menu) {
		case 1:
			tampilan.metode.titikTetap();
			break;
		case 2:
			tampilan.metode.bagiDua();
			break;
		case 3:
			tampilan.metode.regulaFalsi();
			break;
		case 4:
			tampilan.metode.newtonRaphson();
			break;
		case 5:
			tampilan.metode.scant();
			break;
		case 6:
			tampilan.menu.utama();
			break;
		default:
			help.getErrorMessage();
			tampilan.menu.nonlinier();
			break;
		}
	}
	
	public Util help = new Util();
	public Views tampilan = new Views();
}
