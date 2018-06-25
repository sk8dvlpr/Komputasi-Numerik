package views;

import java.util.Scanner;
import controller.Controller;
import util.Util;

public class Konversi
{
	public void judul()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
	}
	
	public void biner()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=             Konversi Bilangan Biner             =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Biner : ");
        
        while (true) {
            try {
                int value = Integer.parseInt(input.nextLine(), 2);
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.BinertoBiner(value));
                System.out.println("= Oktal       : " + proses.konversi.BinertoOktal(value));
                System.out.println("= Desimal     : " + proses.konversi.BinertoDesimal(value));
                System.out.println("= Hexadesimal : " + proses.konversi.BinertoHexa(value));
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public void oktal()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=             Konversi Bilangan Oktal             =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Oktal : ");
        
        while (true) {
            try {
                int value = Integer.parseInt(input.nextLine(), 8);
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.OktaltoBiner(value));
                System.out.println("= Oktal       : " + proses.konversi.OktaltoOktal(value));
                System.out.println("= Desimal     : " + proses.konversi.OktaltoDesimal(value));
                System.out.println("= Hexadesimal : " + proses.konversi.OktaltoHexa(value));
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public void desimal()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=            Konversi Bilangan Desimal            =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Desimal : ");
        
        while (true) {
            try {
                int value = Integer.parseInt(input.nextLine(), 10);
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.DesimaltoBiner(value));
                System.out.println("= Oktal       : " + proses.konversi.DesimaltoOktal(value));
                System.out.println("= Desimal     : " + proses.konversi.DesimaltoDesimal(value));
                System.out.println("= Hexadesimal : " + proses.konversi.DesimaltoHexa(value));
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public void hexadesimal()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=          Konversi Bilangan Hexadesimal          =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Hexadesimal : ");
        
        while (true) {
            try {
                int value = Integer.parseInt(input.nextLine(), 16);
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.HexatoBiner(value));
                System.out.println("= Oktal       : " + proses.konversi.HexatoOktal(value));
                System.out.println("= Desimal     : " + proses.konversi.HexatoDesimal(value));
                System.out.println("= Hexadesimal : " + proses.konversi.HexatoHexa(value));
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public void pecahanBiner()
	{
		this.judul();
		System.out.println("===================================================");
        System.out.println("=         Konversi Bilangan Pecahan Biner         =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Pecahan Biner : ");
        
        while (true) {
            try {
                double value = input.nextDouble();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + value);
                System.out.println("= Oktal       : ");
                System.out.println("= Desimal     : ");
                System.out.println("= Hexadesimal : ");
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public void pecahanOktal()
	{
		this.judul();
		System.out.println("===================================================");
        System.out.println("=         Konversi Bilangan Pecahan Oktal         =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Pecahan Oktal : ");
        
        while (true) {
            try {
                double value = input.nextDouble();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : ");
                System.out.println("= Oktal       : " + value);
                System.out.println("= Desimal     : ");
                System.out.println("= Hexadesimal : ");
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public void pecahanDesimal()
	{
		this.judul();
		System.out.println("===================================================");
        System.out.println("=        Konversi Bilangan Pecahan Desimal        =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Pecahan Desimal : ");
        
        while (true) {
            try {
                double value = input.nextDouble();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.fracDesimaltoBiner(value, 7));
                System.out.println("= Oktal       : " + proses.konversi.fracDesimaltoOktal(value, 7));
                System.out.println("= Desimal     : " + value);
                System.out.println("= Hexadesimal : ");
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public void pecahanHexa()
	{
		this.judul();
		System.out.println("===================================================");
        System.out.println("=      Konversi Bilangan Pecahan Hexadesimal      =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Pecahan Hexa : ");
        
        while (true) {
            try {
                double value = input.nextDouble();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : ");
                System.out.println("= Oktal       : ");
                System.out.println("= Desimal     : ");
                System.out.println("= Hexadesimal : " + value);
                System.out.println("===================================================");
                help.getHoldConsole();
                tampilan.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                System.out.print("\nMasukkan Bilangan Biner : ");
                input.nextLine();
            }
        }
	}
	
	public Util help = new Util();
	public Scanner input = new Scanner(System.in);
	public static Views tampilan = new Views();
	public static Controller proses = new Controller();
}
