import java.util.Scanner;

public class ArtıkYılHesaplama {

	public static void main(String[] args) {
		// 4'e tam bölünecek
		// 100'ün katlarından 400'ün katları olanlar sayılacak.

		Scanner sc = new Scanner(System.in);
		System.out.print("Yıl Giriniz : ");
		int year = sc.nextInt();
		
		//1700
		//2024
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " Artık Yıldır");
		}else {
			System.out.println(year + " Artık Yıl Değildir.");
		}
	}

}
