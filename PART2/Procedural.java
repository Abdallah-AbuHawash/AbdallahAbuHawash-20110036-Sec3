
package procedural;

public class Procedural {

    public static void main(String[] args) {
        int sum =0;

        for (int j = 0; j < 10; j++) {
            sum+=j;
        }
        if(sum>10)
            System.out.println("The sum is:" +sum);
        else
            System.out.println("Sum should be more than 10");
    }
    
}
