import java.util.Scanner;

public class tempandactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hava sýcaklýðýna göre etkinlik öneren program
		Scanner input=new Scanner(System.in);
		double temperature;
		System.out.print("Hava sýcaklýðýný giriniz: ");
		temperature=input.nextDouble();
		if(temperature<=5) {
			System.out.print("Hava sýcaklýðý 5 derecenin altýnda:Kayak yapmak sizin için keyifli bir aktivite olabilir!! ");
			}
			else if(5<  temperature &&temperature<= 25) {
				if(temperature<10) {
					System.out.print("Sinemaya gidebilirsin! ");
				}
				else if (temperature<=15) {
					System.out.print("Sinemaya veya pikniðe gidebilirsin!! ");
				}
				else {
					System.out.print("Pikniðe gidebilirsin ");
				}
				}
			else {
				System.out.print("Yüzmeye gidebilirsin ");
			}
		}
	}
