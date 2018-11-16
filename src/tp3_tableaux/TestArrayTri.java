package tp3_tableaux;
import java.util.*;

public class TestArrayTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Debut du programme de l'exo 3 du TP 03 ! ");
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		Arrays.sort(array);
		System.out.println("Voici la liste des éléments du tableau trié : ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
