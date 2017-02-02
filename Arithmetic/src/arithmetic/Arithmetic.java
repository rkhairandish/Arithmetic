package arithmetic;

public class Arithmetic {

    public static void main(String[] args) {
        //initialise three integer variables 
        int num = 100;
        int factor = 20;
        int sum = 0;
        
        //This performs performs addition, displaying each returned total
        sum = num + factor; //100 + 20
        System.out.println("Addition Sum: " + sum);
        
        //This performs substraction operations, displaying each returned total
        sum = num - factor; //100-20
        System.out.println("Subtraction sum: " + sum);
        
        //
        sum = num * factor; //100 x 20 
        System.out.println("Multiplication sum: " + sum);
        
        //
        sum = num/factor; //100/20
        System.out.println("Division sum: " + sum);
        
    }
    
}
