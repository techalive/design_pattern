package c_operational.interpreter_demo;

public class Interpreter implements AbstractExpression {

    @Override
    public String interpret(Context context){
        AbstractExpression exp; // teraz to null
        //tworzymy zasady dla wyrażeń
        if(context.data.contains("Hexadecimal")){
            exp=new IntToHexAbstractExpression(Integer.parseInt(context.data.substring(0,context.data.indexOf(" "))));
        }else if(context.data.contains("Binary")){
            exp=new IntToBinaryAbstractExpression(Integer.parseInt(context.data.substring(0,context.data.indexOf(" "))));
        }else return context.data;

        return exp.interpret(context);
    }
}
