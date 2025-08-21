import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        String input = "100000000 JPY";
        try {
            Object result = engine.eval(input);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}