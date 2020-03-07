package c_operational.interpreter_demo;

/**
 * Created by Technician on 2019-01-17.
 */
public class Client {
    public static void main(String args[]){
        String str1 = "31 in Binary";
        String str2 = "31 in Hexadecimal";

        Interpreter interpreter = new Interpreter();
        System.out.println(str1+"= "+interpreter.interpret(new Context(str1)));
        System.out.println(str2+"= "+interpreter.interpret(new Context(str2)));

    }
}
