import java.util.Scanner;

public class tempandactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hava s�cakl���na g�re etkinlik �neren program
		Scanner input=new Scanner(System.in);
		double temperature;
		System.out.print("Hava s�cakl���n� giriniz: ");
		temperature=input.nextDouble();
		if(temperature<=5) {
			System.out.print("Hava s�cakl��� 5 derecenin alt�nda:Kayak yapmak sizin i�in keyifli bir aktivite olabilir!! ");
			}
			else if(5<  temperature &&temperature<= 25) {
				if(temperature<10) {
					System.out.print("Sinemaya gidebilirsin! ");
				}
				else if (temperature<=15) {
					System.out.print("Sinemaya veya pikni�e gidebilirsin!! ");
				}
				else {
					System.out.print("Pikni�e gidebilirsin ");
				}
				}
			else {
				System.out.print("Y�zmeye gidebilirsin ");
			}
		}
	}
