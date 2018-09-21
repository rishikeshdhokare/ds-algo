package codility;

class StringBuilder {

    String build(int a, int b) {
        return a >= b ? build(a, b, 'a', 'b')
                      : build(b, a, 'b', 'a');
    }

    private String build(int first, int second, char firstChar, char secondChar) {
        java.lang.StringBuilder result = new java.lang.StringBuilder();
        if (first == 0) {
            return "";
        } else if (first == 1) {
            result.append(firstChar);
            first--;
        } else if (first >= second) {
            result.append(firstChar);
            result.append(firstChar);
            first -= 2;
        } else {
            result.append(firstChar);
            first--;
        }
        result.append(build(second, first, secondChar, firstChar));
        return result.toString();
    }
}