package c_operational.interpreter_demo;

/**
 * Created by Technician on 2019-01-17.
 */
public class IntToBinaryAbstractExpression implements AbstractExpression {

    private int i;

    IntToBinaryAbstractExpression(int c){
        this.i=c;
    }
    @Override
    public String interpret(Context ic) {
        return ic.getBinaryFormat(this.i);
    }

}
