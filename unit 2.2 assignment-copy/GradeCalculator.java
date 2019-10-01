

import java.util.Scanner;

class GradeCalculator {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Claculate your Grade"); // Println leaves a new-line character at the end which makes the next print or println will be on the line under it.
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("Your Score: ");
        double score = sc.nextDouble();
        System.out.println("Max Score: ");
        double maxscore = sc.nextDouble();

        double gradepercent = ((score/maxscore)*100);

        if(gradepercent >= 86.0){
            System.out.println("Grade Letter: A");
        }else if (gradepercent >= 76.0 && gradepercent < 86.0){
            System.out.println("Grade Letter: B");
        }else if (gradepercent >= 69.0 && gradepercent < 76.0){
            System.out.println("Grade Letter: C");
        }else if (gradepercent >= 50.0 && gradepercent < 69.0){
            System.out.println("Grade Letter: D");
        }else{
            System.out.println("Grade Letter: F");   
        }

    }
    
}
