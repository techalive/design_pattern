package c_operational.interpreter_demo;

/**
 * Created by Technician on 2019-01-17.
 */
public class IntToHexAbstractExpression implements AbstractExpression {

    private int i;

    IntToHexAbstractExpression(int c){
        this.i=c;
    }

    @Override
    public String interpret(Context ic) {
        return ic.getHexadecimalFormat(i);
    }

}
