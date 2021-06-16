
package encryptionalgorithm;
//Libraries
import java.util.Scanner;



public class EncryptionAlgorithm {


    public static void main(String[] args) {
     Encryption(); 
    }
    //Overloading method so we can simply change the key from here
    static int enckey(){
        int key =4;
        return key;
    }
    public static void Encryption(){
        //Scanner
        Scanner sc = new Scanner (System.in); 
        System.out.print("Insert text: ");
        String text = sc.nextLine();
       
        //Encryption
        int key = enckey();
        char [] encryption = text.toCharArray(); //converting String to char by using .toCharArray()
        for (int i = 0; i<encryption.length; i++) { //for loop to read all the chars
            encryption[i] += key; //adding 10 ASCII values to each char 
        }
        System.out.println("Encrypted Value:");
        System.out.println(encryption);
       
        //Decryption
        char [] decryption = encryption;
        for (int i = 0; i <decryption.length; i++) {
            decryption[i]-= key;
        }
          System.out.println("Decrypted Value: ");
          System.out.println(decryption);              
    
    }

    
}


