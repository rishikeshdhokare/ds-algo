package array;

class MoveZeros {

    int[] moveZeros(int[] input) {
        int i = 0;
        for (int j = 0; j < input.length; j++) {
            if (input[j] != 0)
                input[i++] = input[j];
        }
        while (i < input.length) {
            input[i++] = 0;
        }
        return input;
    }
}
