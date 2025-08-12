import java.util.*;

public class noS {

    static Map<String, Integer> digitMap = Map.of(
        "zero", 0, "one", 1, "two", 2, "three", 3, "four", 4,
        "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9
    );

    static Set<String> allowedOps = Set.of("add", "sub", "mul", "rem", "pow");

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String userInput = reader.nextLine().trim();
        String[] components = userInput.split("\\s+");

        List<Object> parsedTokens = new ArrayList<>();

        for (String token : components) {
            if (allowedOps.contains(token)) {
                parsedTokens.add(token);
            } else if (isComposableNumber(token)) {
                try {
                    parsedTokens.add(convertToNumber(token));
                } catch (Exception e) {
                    System.out.print("expression evaluation stopped invalid words present");
                    return;
                }
            } else {
                System.out.print("expression evaluation stopped invalid words present");
                return;
            }
        }

        try {
            int outcome = processExpression(parsedTokens);
            System.out.print(outcome); // ⚠️ Don't use println
        } catch (Exception ignore) {
            System.out.print("expression is not complete or invalid");
        }
    }

    static boolean isComposableNumber(String value) {
        String[] subParts = value.split("c");
        for (String fragment : subParts) {
            if (!digitMap.containsKey(fragment)) return false;
        }
        return true;
    }

    static int convertToNumber(String encoded) {
        String[] digitWords = encoded.split("c");
        StringBuilder numericString = new StringBuilder();
        for (String word : digitWords) {
            if (!digitMap.containsKey(word)) {
                throw new RuntimeException("invalid digit word");
            }
            numericString.append(digitMap.get(word));
        }
        return Integer.parseInt(numericString.toString());
    }

    static int processExpression(List<Object> elements) {
        if (elements.size() == 3 &&
            elements.get(0) instanceof String &&
            elements.get(1) instanceof Integer &&
            elements.get(2) instanceof Integer) {
            return computeOperation((String) elements.get(0), (int) elements.get(1), (int) elements.get(2));
        }

        if (elements.size() == 5) {
            if (elements.get(0) instanceof String && elements.get(1) instanceof String &&
                elements.get(2) instanceof Integer && elements.get(3) instanceof Integer &&
                elements.get(4) instanceof Integer) {
                int tempResult = computeOperation((String) elements.get(1), (int) elements.get(2), (int) elements.get(3));
                return computeOperation((String) elements.get(0), tempResult, (int) elements.get(4));
            } else if (elements.get(0) instanceof String &&
                       elements.get(1) instanceof Integer && elements.get(2) instanceof String &&
                       elements.get(3) instanceof Integer && elements.get(4) instanceof Integer) {
                int tempResult = computeOperation((String) elements.get(2), (int) elements.get(3), (int) elements.get(4));
                return computeOperation((String) elements.get(0), (int) elements.get(1), tempResult);
            }
        }

        throw new RuntimeException("invalid");
    }

    static int computeOperation(String operator, int val1, int val2) {
        return switch (operator) {
            case "add" -> val1 + val2;
            case "sub" -> val1 - val2;
            case "mul" -> val1 * val2;
            case "rem" -> (val2 == 0) ? 0 : val1 % val2;
            case "pow" -> (int) Math.pow(val1, val2);
            default -> throw new RuntimeException("invalid op");
        };
    }
}
