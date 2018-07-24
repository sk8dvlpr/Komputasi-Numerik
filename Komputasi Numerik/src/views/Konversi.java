package views;

import java.util.Scanner;
import controller.Controller;
import util.Utilities;

public class Konversi
{
	public void title()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
	}
	
	public void binary()
	{
		this.title();
        System.out.println("===================================================");
        System.out.println("=             Konversi Bilangan Biner             =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Biner : ");
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + value);
                System.out.println("= Oktal       : " + process.convert.getBinarytoOctal(value));
                System.out.println("= Desimal     : " + process.convert.getBinarytoDecimal(value));
                System.out.print  ("= Hexadesimal : "); process.convert.getBinarytoHex(value);
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public void octal()
	{
		this.title();
        System.out.println("===================================================");
        System.out.println("=             Konversi Bilangan Oktal             =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Oktal : ");
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + process.convert.getOctaltoBinary(value));
                System.out.println("= Oktal       : " + value);
                System.out.println("= Desimal     : " + process.convert.getOctaltoDecimal(value));
                System.out.print  ("= Hexadesimal : "); process.convert.getOctaltoHex(value);
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public void decimal()
	{
		this.title();
        System.out.println("===================================================");
        System.out.println("=            Konversi Bilangan Desimal            =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Desimal : ");
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.print  ("= Biner       : "); process.convert.getDecimaltoBinary(Integer.parseInt(value));
                System.out.println("\n= Oktal       : " + process.convert.getDecimaltoOctal(value));
                System.out.println("= Desimal     : " + value);
                System.out.print  ("= Hexadesimal : "); process.convert.getDecimaltoHex(value);
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public void hex()
	{
		this.title();
        System.out.println("===================================================");
        System.out.println("=          Konversi Bilangan Hexadesimal          =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Hexadesimal : ");
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.print  ("= Biner       : "); process.convert.getHextoBinary(value);
                System.out.println("= Oktal       : " + process.convert.getHextoOctal(value));
                System.out.println("= Desimal     : " + process.convert.getHextoDecimal(value));
                System.out.println("= Hexadesimal : " + value);
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public void fractionBinary()
	{
		this.title();
		System.out.println("===================================================");
        System.out.println("=         Konversi Bilangan Pecahan Biner         =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Pecahan Biner : ");
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + value);
                System.out.println("= Oktal       : " + process.convert.getFractionBinarytoOctal(value));
                System.out.println("= Desimal     : " + process.convert.getFractionBinarytoDecimal(value));
                System.out.print  ("= Hexadesimal : "); process.convert.getFractionBinarytoHex(value); 
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public void fractionOctal()
	{
		this.title();
		System.out.println("===================================================");
        System.out.println("=         Konversi Bilangan Pecahan Oktal         =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Pecahan Oktal : ");
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + process.convert.getFractionOctaltoBinary(value));
                System.out.println("= Oktal       : " + value);
                System.out.println("= Desimal     : " + process.convert.getFractionOctaltoDecimal(value));
                System.out.print  ("= Hexadesimal : "); process.convert.getFractionOctaltoHex(value);
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public void fractionDecimal()
	{
		this.title();
		System.out.println("===================================================");
        System.out.println("=        Konversi Bilangan Pecahan Desimal        =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Pecahan Desimal : ");
                double value = input.nextDouble();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + process.convert.getFractionDecimaltoBinary(value, 7));
                System.out.println("= Oktal       : " + process.convert.getFractionDecimaltoOctal(value, 7));
                System.out.println("= Desimal     : " + value);
                System.out.print  ("= Hexadesimal : "); process.convert.getFractionDecimaltoHex(String.valueOf(value));
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public void fractionHex()
	{
		this.title();
		System.out.println("===================================================");
        System.out.println("=      Konversi Bilangan Pecahan Hexadesimal      =");
        System.out.println("===================================================");
        
        while (true) {
            try {
            	System.out.print("Masukkan Bilangan Pecahan Hexa : ");
                String value = input.next();
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                System.out.println("= Biner       : " + process.convert.getFractionHextoBinary(value));
                System.out.println("= Oktal       : " + process.convert.getFractionHextoOctal(value));
                System.out.println("= Desimal     : " + process.convert.getFractionHextoDecimal(value));
                System.out.println("= Hexadesimal : " + value);
                System.out.println("===================================================");
                help.getHoldConsole();
                views.menu.konversi();
            } catch (java.util.InputMismatchException ex) {
                help.getErrorMessage();
                input.nextLine();
            }
        }
	}
	
	public Utilities help = new Utilities();
	public Scanner input = new Scanner(System.in);
	public static Views views = new Views();
	public static Controller process = new Controller();
}
