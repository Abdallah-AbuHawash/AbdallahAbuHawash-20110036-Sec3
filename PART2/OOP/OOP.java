
package oop;


public class OOP {


    public static void main(String[] args) {
        //Genius Mouse
        mouse genius = new mouse();
        genius.name = "Genius ";
        genius.color = "White ";
        genius.price = 20;
        System.out.println("The name: "+genius.name+ "The color: "+ genius.color+"The price:"+ genius.price+" The type: "+ genius.type );
        
        //Unkown Mouse
        mouse unknown = new mouse();
        System.out.println("The name: "+unknown.name+"The color: "+unknown.color+"The price:"+ unknown.price+" The type: "+ unknown.type );
    }
    
}
