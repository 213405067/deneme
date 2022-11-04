package deneme5;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
int proje;
int vize;
int son;
double ortalama;
Scanner input= new Scanner(System.in);
System.out.println("vize notunuzu giriniz: ");
vize= input.nextInt();
System.out.println("Proje notunuzu giriniz: ");
proje= input.nextInt();
System.out.println("Son notunuzu giriniz: ");
son= input.nextInt();
 
ortalama= (proje*0.2)+(vize*0.3)+(son*0.5);
System.out.println("Not ortalamaniz: " +ortalama);
String sonuc= (ortalama >=50) ? "geçtiniz" : "kaldiniz";
System.out.println(sonuc);


	}

}
