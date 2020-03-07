package c_operational.interpreter_demo;

/**
 * Created by Technician on 2019-01-17.
 */
public class IntToHexExpression implements Expression {

    private int i;

    IntToHexExpression(int c){
        this.i=c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }

}
