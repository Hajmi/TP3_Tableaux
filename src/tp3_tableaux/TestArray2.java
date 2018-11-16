package tp3_tableaux;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Debut du programme de l'exo 2 du TP 03 ! ");
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int somme = 0;
		float moyenne = 0;
		int index = 0;
		int doublon =0;
		
		System.out.println("Voici l'ensemble des éléments du tableau :");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		for (int i=0; i<array.length; i++) {
			somme = somme + array[i];
		}
		moyenne = somme / (array.length);
		System.out.println("Voici la moyenne des éléments du tableau : " +moyenne);
		for (int j=0; j<array.length; j++) {
			if (array[j] == 15)
				index = j;
		}
		System.out.println("Voici l'index dans le tableau de l'entier 15 : "+index);
		System.out.println("Voici le nombre d'entiers en doublon : ");
		for (int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if (array[i] == array[j])
					doublon++;
			}
		}
		System.out.println(doublon);
		
	}

}
