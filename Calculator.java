import java.util.LinkedList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator extends CalculatorBaseListener {
    private final LinkedList<Integer> firstStack = new LinkedList<>();
    private final LinkedList<Integer> secondStack = new LinkedList<>();

    private final LinkedList<Integer> thirdStack = new LinkedList<>();

    public Integer getResult() {
        return thirdStack.pop();
    }

    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {
        Integer result = thirdStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.PLUS)) {
                result = result + thirdStack.removeLast();
            } else {
                result = result - thirdStack.removeLast();
            }
        }
        thirdStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> " + result);
    }

    @Override
    public void exitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        Integer result = secondStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.TIMES)) {
                result = result * secondStack.removeLast();
            } else {
                result = result / secondStack.removeLast();
            }
        }
        thirdStack.push(result);
        System.out.println("MultiplyingExpression: \"" + ctx.getText() + "\" -> " + result);
    }

    @Override
    public void exitPovExpression(CalculatorParser.PovExpressionContext ctx) {
        Integer result = firstStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.TIMES)) {
                result = Math.pow(result, firstStack.removeLast());
            }
            else{
                result = Math.pow(result, 1/firstStack.removeLast());
            }
        }
        secondStack.push(result);
        System.out.println("PowExpression: \"" + ctx.getText() + "\" -> " + result);
    }


    private boolean symbolEquals(ParseTree child, int symbol) {
        return ((TerminalNode) child).getSymbol().getType() == symbol;
    }

    @Override
    public void exitIntegralExpression(CalculatorParser.IntegralExpressionContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        if (ctx.MINUS() != null) {
            firstStack.push(-1 * value);
        } else {
            firstStack.push(value);
        }
        System.out.println("IntegralExpression: \"" + ctx.getText() + "\" ");
    }

    public static Integer calc(CharStream charStream) {
        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens.getText());

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        Calculator calculatorListener = new Calculator();
        walker.walk(calculatorListener, tree);
        return calculatorListener.getResult();
    }

    public static Integer calc(String expression) {
        return calc(CharStreams.fromString(expression));
    }

    public static void main(String[] args) throws Exception {
        CharStream charStreams = CharStreams.fromFileName("C:\\Users\\Marta Bieńko\\Desktop\\kalkulatorantlr\\src\\example.txt");
        Integer result = calc(charStreams);
        System.out.println("Result = " + result);
    }
}