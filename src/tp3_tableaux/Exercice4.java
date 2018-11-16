package tp3_tableaux;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix = 0;
		int tableau [] = new int[10];
		System.out.println("Debut du programme de l'exo 2 du TP 03 ! ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre choix svp \r\n1 : Ajouter un nombre. \r\n2 : Afficher les nombres existants.  ");
		choix = sc.nextInt();
		//if (choix == 1) {
			//if tableau
			
		//}
		//if ()
		System.out.println("");
	}
	
	private int[] tab1;
	private int position=0;
	 
	 
	//methode qui charge le tableau et qui appelle l'ajustement .
	public void add(int ajout)
	{
	     ajuster();
	     tab1[position] = ajout ;
	 
	}
	 
	public void ajuster()
	{
	    if (tab1==null)
	      tab1 = new int[1];
	   else {
	   position++;
	   int[] tab2 = new int [position+1];
	   for( int i = 0 ;i<tab1.length ; i++)
	    {
	         tab2[i] = tab1[i];
	    }
	      tab1=tab2;
	   }
	}

}
