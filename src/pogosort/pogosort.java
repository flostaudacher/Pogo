package pogosort;

import java.util.Random;

public class pogosort {
	static int arr[]=new int [10];
	static int anzahlDerAufrufe=1;
	public static void main(String[] args) {
		for (int i = 1; i < arr.length; i++) {
			arr [i]= random();
		}
		pogoSort();
		System.out.println("Anzahl der Aufrufe : "+pogoSort());
	}
	static int pogoSort() {
		do {
			shuffle();
			anzahlDerAufrufe++;
		}while (!sorted());
		return anzahlDerAufrufe;
	}
	static void shuffle() {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			int x = random();
			int y = random();
			temp = arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
		}
	}
	static boolean sorted() {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	static int random() {
		Random zufall=new Random();
		int zufallszahl=zufall.nextInt(arr.length);
		return zufallszahl;
	}
}
