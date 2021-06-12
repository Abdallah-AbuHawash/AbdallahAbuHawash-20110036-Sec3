package encryptionalgorithm;
//Libraries
import java.util.Scanner;



public class EncryptionAlgorithm {


    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner (System.in); 
        System.out.print("Insert text: ");
        String text = sc.nextLine();
       
        //Encryption
        int key = 4;
        char [] text2 = text.toCharArray(); //converting String to char by using .toCharArray()
        for (int i = 0; i <text2.length; i++) { //for loop to read all the chars
            text2[i] += key; //adding 10 ASCII values to each char 
        }
        System.out.println("Encrypted Value:");
        System.out.println(text2);
        
        //Decryption
        char [] text3 = text2;
        for (int i = 0; i <text3.length; i++) {
            text3[i]-= key;
        }
          System.out.println("Decrypted Value: ");
          System.out.println(text3);
    }
    
}
