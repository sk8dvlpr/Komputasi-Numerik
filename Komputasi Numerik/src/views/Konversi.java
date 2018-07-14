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
	
	public void binary()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=             Konversi Bilangan Biner             =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Biner : ");
        
        while (true) {
            try {
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + value);
                System.out.println("= Oktal       : " + proses.konversi.getBinarytoOctal(value));
                System.out.println("= Desimal     : " + proses.konversi.getBinarytoDecimal(value));
                System.out.print  ("= Hexadesimal : "); proses.konversi.getBinarytoHex(value);
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
	
	public void octal()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=             Konversi Bilangan Oktal             =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Oktal : ");
        
        while (true) {
            try {
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.getOctaltoBinary(value));
                System.out.println("= Oktal       : " + value);
                System.out.println("= Desimal     : " + proses.konversi.getOctaltoDecimal(value));
                System.out.print  ("= Hexadesimal : "); proses.konversi.getOctaltoHex(value);
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
	
	public void decimal()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=            Konversi Bilangan Desimal            =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Desimal : ");
        
        while (true) {
            try {
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.print  ("= Biner       : "); proses.konversi.getDecimaltoBinary(Integer.parseInt(value));
                System.out.println("\n= Oktal       : " + proses.konversi.getDecimaltoOctal(value));
                System.out.println("= Desimal     : " + value);
                System.out.print  ("= Hexadesimal : "); proses.konversi.getDecimaltoHex(value);
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
	
	public void hex()
	{
		this.judul();
        System.out.println("===================================================");
        System.out.println("=          Konversi Bilangan Hexadesimal          =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Hexadesimal : ");
        
        while (true) {
            try {
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.print  ("= Biner       : "); proses.konversi.getHextoBinary(value);
                System.out.println("= Oktal       : " + proses.konversi.getHextoOctal(value));
                System.out.println("= Desimal     : " + proses.konversi.getHextoDecimal(value));
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
	
	public void fractionBinary()
	{
		this.judul();
		System.out.println("===================================================");
        System.out.println("=         Konversi Bilangan Pecahan Biner         =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Pecahan Biner : ");
        
        while (true) {
            try {
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + value);
                System.out.println("= Oktal       : " + proses.konversi.getFractionBinarytoOctal(value));
                System.out.println("= Desimal     : " + proses.konversi.getFractionBinarytoDecimal(value));
                System.out.print  ("= Hexadesimal : "); proses.konversi.getFractionBinarytoHex(value); 
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
	
	public void fractionOctal()
	{
		this.judul();
		System.out.println("===================================================");
        System.out.println("=         Konversi Bilangan Pecahan Oktal         =");
        System.out.println("===================================================");
        System.out.print("Masukkan Bilangan Pecahan Oktal : ");
        
        while (true) {
            try {
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.getFractionOctaltoBinary(value));
                System.out.println("= Oktal       : " + value);
                System.out.println("= Desimal     : " + proses.konversi.getFractionOctaltoDecimal(value));
                System.out.print  ("= Hexadesimal : "); proses.konversi.getFractionOctaltoHex(value);
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
	
	public void fractionDecimal()
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
                System.out.println("= Biner       : " + proses.konversi.getFractionDecimaltoBinary(value, 7));
                System.out.println("= Oktal       : " + proses.konversi.getFractionDecimaltoOctal(value, 7));
                System.out.println("= Desimal     : " + value);
                System.out.print  ("= Hexadesimal : "); proses.konversi.getFractionDecimaltoHex(String.valueOf(value));
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
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + proses.konversi.getFractionHextoBinary(value));
                System.out.println("= Oktal       : " + proses.konversi.getFractionHextoOctal(value));
                System.out.println("= Desimal     : " + proses.konversi.getFractionHextoDecimal(value));
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
