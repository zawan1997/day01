package myapp.core;
//this is a test 123
import java.io.Console;

public class Operator{

    public static void main(String[] args){
        // get the console
        Console cons= System.console();

        String opnd0 = cons.readLine("Operand 0: ").trim();
        String opnd1 = cons.readLine("Operand 1: ").trim();
        String operator= cons.readLine("operator; add, sub, div, mul: ").trim();

        //Convert String to Integer
        Integer val0 = Integer.parseInt(opnd0);
        Integer val1 = Integer.parseInt(opnd1);
        Float result = 0f; //float quotation

        switch (operator){
            case"add":
            result= (float)(val0 + val1);
            break;
            case"sub":
            result= (float)(val0 - val1);
            break;
            case "mul":
            result= (float)(val0 * val1);
            break;
            case "div":
            result= ((float)(val0) / val1);
            break;
            default: 
        }
        System.out.printf("Result; %d %s %d = %.3f", val0, operator, val1, result);

    }
}

       