package Numerik;

import java.io.IOException;
import java.util.Scanner;

/*
 * @author Muhammad Faturrahman
 * @version 1.0
 * @since 28 May 2018 
 */

public class Process
{
	/***** View *****/
	
	// Menu View //
	
	public void judul()
    {
		this.clearConsole();
        System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
        System.out.println("===================================================");
        System.out.println("=                   DIBUAT OLEH                   =");
        System.out.println("= Nama  : Muhammad Faturrahman                    =");
        System.out.println("= NPM   : 43A87006160078                          =");
        System.out.println("= Kelas : S1 / 4B / Malam                         =");
        System.out.println("= Dosen : Taufik Maulana                          =");
    }
	
	public void utama()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=                    Main Menu                    =");
        System.out.println("===================================================");
        System.out.println("= 1. Penjumlahan Bilangan Pecahan                 =");
        System.out.println("= 2. Konversi Bilangan                            =");
        System.out.println("= 3. Menghitung Galat                             =");
        System.out.println("= 4. Akar Persamaan Non Linier                    =");
        System.out.println("= 5. Interpolasi                                  =");
        System.out.println("= 6. Turunan Fungsi                               =");
        System.out.println("= 7. Keluar                                       =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        this.menuProcess(input.nextInt());
    }
	
	public void konversi_bilangan()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=                Konversi Bilangan                =");
        System.out.println("===================================================");
        System.out.println("= 1. Input Biner                                  =");
        System.out.println("= 2. Input Oktal                                  =");
        System.out.println("= 3. Input Desimal                                =");
        System.out.println("= 4. Input Hexadesimal                            =");
        System.out.println("= 5. Input Pecahan Biner                          =");
        System.out.println("= 6. Input Pecahan Oktal                          =");
        System.out.println("= 7. Input Pecahan Desimal                        =");
        System.out.println("= 8. Input Pecahan Hexadesimal                    =");
        System.out.println("= 9. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
    }
	
	public void galat()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=                 Menghitung Galat                =");
        System.out.println("===================================================");
        System.out.println("= 1. Galat Relatif                                =");
        System.out.println("= 2. Galat Mutlak                                 =");
        System.out.println("= 3. Penjalaran Galat                             =");
        System.out.println("= 4. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
    }
    
    public void non_linier()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=            Akar Persamaan Non Linier            =");
        System.out.println("===================================================");
        System.out.println("= 1. Metode Titik Tetap                           =");
        System.out.println("= 2. Metode Bagi Dua                              =");
        System.out.println("= 3. Metode Regula Falsi                          =");
        System.out.println("= 4. Metode Newton Raphson                        =");
        System.out.println("= 5. Metode Scant                                 =");
        System.out.println("= 6. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
    }
    
    public void interpolasi()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=                    Interpolasi                  =");
        System.out.println("===================================================");
        System.out.println("= 1. Pendekatan Lagrange                          =");
        System.out.println("= 2. Polinomial Newton                            =");
        System.out.println("= 3. Polinomial Chebechev (optional)              =");
        System.out.println("= 4. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
    }
    
    public void menuTurunanFungsi()
    {
        
    }
    
    // End Menu View //    
	
	/***** End View *****/
	
    /***** Process Control *****/
    
    // Menu Process //
    
    public void menuProcess(int menu)
    {
    	switch (menu) {
        case 1:
            
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
            this.clearConsole();
            System.out.println("Terima Kasih Telah Menggunakan Aplikasi Ini !!!");
            this.holdConsole();
            System.exit(0);
            break;
        default:
            this.errorMessage();
            this.utama();
            break;
		}
    }
    
    /***** End Process Control *****/
    
	/***** Tools *****/
	
	public void clearConsole() 
	{
		try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
	}
	
	public void holdConsole() 
	{
		try	{
			System.out.println("\nTekan ENTER untuk melanjutkan...");
			System.in.read();
		} catch (IOException ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void errorMessage()
    {
        this.clearConsole();
        System.out.println("Maaf Input Yang Anda Masukkan Salah!!!");
        this.holdConsole();
    }
	
	/***** End Tools *****/
	
	/***** Calling Object *****/
	
	private final Scanner input = new Scanner(System.in);
	
	/***** End Object *****/
}
