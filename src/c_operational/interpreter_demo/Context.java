package c_operational.interpreter_demo;

/**
 * Created by Technician on 2019-01-17.
 */
class Context {

    Context(String data) {
        this.data = data;
    }

    String data;

    String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }


}
