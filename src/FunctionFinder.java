/**
 * Created by administrator on 07.02.16.
 */
public class FunctionFinder {
    private static final Function PLUS = new FunctionPlus();
    private static final Function MINUS = new FunctionMinus();
    private static final Function MULTIPLE = new FunctionMultiply();

    public Function getFunction(String name) {
        switch (name) {
            case "+":
                return PLUS;
            case "-":
                return MINUS;
            case "*":
                return MULTIPLE;
        }
        throw new RuntimeException("Can't find function with name=" + name + "!");
    }
}
