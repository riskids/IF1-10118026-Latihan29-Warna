/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan29.warna;
import java.util.Scanner;
/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: Kepribadian berdasarkan warna
 */
public class IF110118026Latihan29Warna {

	/**
	 * @param args the command line arguments
	 */
	public static final String WARNA_RESET = "\u001B[0m";
    	public static final String WARNA_BLACK = "\u001B[30m";
    	public static final String WARNA_RED = "\u001B[31m";
    	public static final String WARNA_GREEN = "\u001B[32m";
    	public static final String WARNA_YELLOW = "\u001B[33m";
    	public static final String WARNA_BLUE = "\u001B[34m";
    	public static final String WARNA_PURPLE = "\u001B[35m";
    	public static final String WARNA_CYAN = "\u001B[36m";
    	public static final String WARNA_WHITE = "\u001B[37m";
	public static final String WARNA_BLACK_BACKGROUND = "\u001B[40m";
	public static final String WARNA_RED_BACKGROUND = "\u001B[41m";
	public static final String WARNA_GREEN_BACKGROUND = "\u001B[42m";
	public static final String WARNA_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String WARNA_BLUE_BACKGROUND = "\u001B[44m";
	public static final String WARNA_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String WARNA_CYAN_BACKGROUND = "\u001B[46m";
	public static final String WARNA_WHITE_BACKGROUND = "\u001B[47m";
	public static void main(String[] args) {
		// TODO code application logic here
    		System.out.println(WARNA_RED + "YUK " + WARNA_GREEN + "CEK " + WARNA_YELLOW + "KEPRIBADIANMU " + WARNA_CYAN + "DARI " + WARNA_PURPLE + "WARNA " + WARNA_BLUE + "FAVORITMU " + WARNA_RESET);	
		System.out.println(WARNA_RED_BACKGROUND+ WARNA_WHITE +"\t\tMERAH\t\t");
		System.out.println(WARNA_GREEN_BACKGROUND+ "\t\tHIJAU\t\t");
		System.out.println(WARNA_YELLOW_BACKGROUND+ "\t\tKUNING\t\t");
		System.out.println(WARNA_BLUE_BACKGROUND+ "\t\tBIRU\t\t");
		System.out.println(WARNA_PURPLE_BACKGROUND+ "\t\tUNGU\t\t" +WARNA_RESET + WARNA_WHITE_BACKGROUND);
		String[][] Kep = {
			{ 
				"Menyenangkan,",
				"Bijaksana,",
				"Pembawaan diri tenang saat menghadapi masalah,",
				"Dinamis,",
				"Senang Berbagi,",
				"Bersahabat,",
				"Tidak terlalu suka menjadi sorotan banyak orang,",
				"Menyembunyikan persaan karena karakternya yang cenderung mencari jalan damai."
			},
			{
				"Periang,",
				"Pemberani,",
				"Berani mengambil risiko dalam setiap langkah,",
				"Menyukai tantangan,",
				"Kurang sabar,",
				"Dapat menahan marah namun jika sudah tahap puncak tolerWARNA, kemarahannya akan sulit dikontrol,",
				"Memiliki energi kehangatan dan cinta."
			},
			{
				"Optimis,",
				"Suka bergaul,",
				"Periang,",
				"Senang menolong,",
				"Lincah dan Aktif,",
				"Tidak suka meremehkan kekurangan orang lain,",
				"Loyal,",
				"Hangat,",
				"Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,",
				"Cenderung penakut."
			},
			{
				"Optimis,",
				"Tidak pernah ragu,",
				"Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,",
				"Memiliki ambisi yang besar,",
				"Memiliki empati yang besar,",
				"Memiliki sisi misterius sebab seringkali menutupi persaannya,",
				"Terkadang bersikap keras kepala dan angkuh."
			},
			{
				"Romantis,",
				"Menyukai hal yang berbau alami dan keindahan,",
				"Teguh pada prinsip,",
				"Menginginkan Kesempurnaan,",
				"Mudah Cemburu,",
				"Mudah merasa iri,",
				"Menjunjung tinggi suatu nilai tolerWARNA dan kepercayaan."
			}
		};
		int[] pnjg = {8, 7, 10, 7, 7};
		System.out.print("PILIH WARNAFAVORITMU : ");
		Scanner sc = new Scanner(System.in);
		String favorit = sc.next().toUpperCase();
		String nama = sc.nextLine();
		System.out.print("\n=== HASIL TEST KEPRIBADIAN " + nama + " ===" + "\nWarna Favoritmu Adalah ");
		int pilih = 0;
		switch(favorit){
			case "BLUE":
				pilih = 0;
				System.out.print(WARNA_BLUE);
				break;
			case "MERAH":
				pilih = 1;
				System.out.print(WARNA_RED);
				break;
			case "KUNING":
				pilih = 2;
				System.out.print(WARNA_YELLOW);
				break;
			case "UNGU":
				pilih = 3;
				System.out.print(WARNA_PURPLE);	
				break;
			case "HIJAU":
				pilih = 4;
				System.out.print(WARNA_GREEN);
				break;
			default:
				pilih = 5;
				break;
				
		};
		System.out.println(  favorit + WARNA_RESET);
		if (pilih == 5)
			System.out.println("Ooops.. Belum teridentifikasi");
		else {
			for( int i = 0; i < pnjg[pilih]; i++){
				System.out.println((i+1) + ". " + Kep[pilih][i]);
			}
		}	
	}
	
}
