package tp3_tableaux;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Debut du programme de l'exo 1 du TP 03 ! ");
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		System.out.println("Voici le contenu du tableau créé :");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		System.out.println("Voici l'ensemble des éléments du tableau dans l'ordre inverse :");
		for (int j= (array.length)-1; j>=0; j--) {
			System.out.print(array[j]+" ");
		}
		System.out.println("");
		System.out.println("Voici la liste des entiers supérieurs à 3 :");
		for (int i=0; i<array.length; i++) {
			if (array[i] > 3)
				System.out.print(array[i]+" ");
		}
		System.out.println("");
		System.out.println("Voici la liste des entiers pairs :");
		for (int i=0; i<array.length; i++) {
			if ((array[i]%2 == 0) && (array[i]>0))
				System.out.print(array[i]+" ");
		}
		System.out.println("");
		int maximum = 0;
		System.out.println("Voici le plus grand élément du tableau :");
		for (int i=0; i<array.length; i++) {
			if ((array[i] > maximum))
				maximum = array[i];
		}
		System.out.println(maximum);
		/////////////////////////////////////////////////////////////////
		int minimum = 0;
		System.out.println("Voici le plus petit élément du tableau :");
		for (int i=0; i<array.length; i++) {
			if ((array[i] < minimum))
				minimum = array[i];
		}
		System.out.println(minimum);
	}

}
