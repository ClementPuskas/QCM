import java.util.Scanner;

public class question {


	
	
  public static void main(String[] args){
    @SuppressWarnings("resource")
    int compte = 0;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenue au Quizz de la Maison des Ligues de Lorraine ! ");
    System.out.println("Dans ce quizz, vous devrez r�pondre � 5 questions sur la M2L.");
    System.out.println("D�but du Quizz !");
    System.out.println("Question #1: Combien d'�quipes lorraines sont dans les 2 premi�res divisions masculines des sports suivant: Rugby, Handball, Football, BasketBall ?");
    int i = sc.nextInt();
    if (i == 4) {
        System.out.println("Effectivement, la r�ponse est bien 4 !");
        System.out.println("Question #2. ");
        compte = compte+1;
    }
    else {
        System.out.println("Malheureusement pour vous, ce n'�tait pas la bonne r�ponse. ");
        System.out.println("Question #2.");
    }
     
    System.out.println("En quelle ann�e a �t� reprise la Maison des Ligues de Lorraine par la r�gion ? ( 4 chiffres )");
    int crea = sc.nextInt();
    if (crea == 2000) {
        System.out.println("Oui, la Maison des ligues de Lorraine � �t� cr��e en 2000 !");
        System.out.println("Question #3.");
        compte = compte+1;
    }
    else {
        System.out.println("Non, la Maison des ligues de Lorraine � �t� cr��e en 2000 " );
        System.out.println("Question #3.");
    }
    sc.nextLine();
    System.out.println("Comment s'appelle le directeur de la M2L ? ( Avec majuscules et accents !! )");
    String directeur = sc.nextLine();
    if (directeur.equals ("Lucien Sapin")) {
        System.out.println("Oui, Lucien Sapin est bien le directeur de la M2L. !");
        System.out.println("Question #4.");
        compte = compte+1;
    }
    else {
        System.out.println("Non, le directeur de la M2L est Lucien Sapin " );
        System.out.println("Question #4.");
    }
    System.out.println("Quelle groupe g�re la Maison des Ligues de Lorraine ( Avec majuscules et accents !! )");
    String gerant = sc.nextLine();
    if (gerant.equals("Conseil R�gional")) {
        System.out.println("Oui, le Conseil R�gional g�re la M2L. !");
        System.out.println("Question #5.");
        compte = compte+1;
    }
    else {
        System.out.println("Non, le Conseil R�gional g�re la M2L " );
        System.out.println("Question #5.");
    }
    
    System.out.println("En quelle ann�e la convention a �t� r�dig�e ? ( 4 chiffres )");
    int conv = sc.nextInt();
    if (conv == 2003) {
        System.out.println("Oui, la convention a �t� r�dig�e en 2003 !");
        System.out.println("Fin du Quizz");
        compte = compte+1;
    }
    else {
        System.out.println("Non, la convention a �t� r�dig�e en 2003 " );
        System.out.println("Fin du Quizz.");
    }
    System.out.println("Vous avez " + compte + " points");
    }


   }
