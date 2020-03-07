package c_operational.interpreter_demo;

/**
 * Created by Technician on 2019-01-17.
 */
class InterpreterContext {

    String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
