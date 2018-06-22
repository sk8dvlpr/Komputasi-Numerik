package controller;

import util.*;
import views.*;

public class Menu
{
	public void utama(int menu)
	{
		switch (menu) {
		case 1:
			
			break;
		case 2:
			tampilan.menu.konversi_bilangan();
			break;
		case 3:
			
			break;
		case 4:
			
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
			tampilan.konversi.biner();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			tampilan.menu.utama();
			break;
		default:
			help.getErrorMessage();
			tampilan.menu.konversi_bilangan();
			break;
		}
	}
	
	public Util help = new Util();
	public Views tampilan = new Views();
}
