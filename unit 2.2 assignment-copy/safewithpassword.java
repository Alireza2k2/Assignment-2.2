


import java.util.Scanner;

class safewithpassword {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Please Enter Password"); // Println leaves a new-line character at the end which makes the next print or println will be on the line under it.
    System.out.println("------------------------------");
    System.out.println("");
    System.out.println("Password: ");
    int password = sc.nextInt();
    
    
    if(password == 1234){
        System.out.println("Password Correct!");
    } else{
     System.out.println("GO AWAY!");   
    }

    

}
   
    
}
