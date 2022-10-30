package codewars.kyu8;

/*Your task is to create a function that does four basic mathematical operations.

The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.

Examples(Operator, value1, value2) --> output

('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7*/

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2)
    {
        int result = 0;
        switch(op){
            case "+": result = v1 + v2;
                break;
            case "-": result = v1 - v2;
                break;
            case "*": result = v1 * v2;
                break;
            case "/": result = v1 / v2;
                break;
        }
        return result;
    }
}

/*BP
*  public static Integer basicMath(String op, int v1, int v2)
  {
  switch (op) {
    case "-":
      return v1 - v2;
    case "+":
      return v1 + v2;
    case "*":
      return v1 * v2;
    case "/": {
      if (v2 == 0)
        throw new IllegalArgumentException("Division by zero");
      return v1 / v2;
    }
    default:
      throw new IllegalArgumentException("Unknown operation: " + op);
    }
  }
  *
  * public static Integer basicMath(String symbol, int x, int y){
    switch (symbol){
      case "+": return x+y;
      case "-": return x-y;
      case "*": return x*y;
      case "/": return x/y;
    }
    return 0;
  }
  *
  * public static Integer basicMath(String op, int v1, int v2)
  {
    return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);

  }*/
