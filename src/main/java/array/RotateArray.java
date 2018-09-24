package array;

class RotateArray {

    // Time - O(n)
    // Space - O(n)
    int[] rotateWithAuxSpace(int[] array, int offset) {
        int[] auxiliary = new int[offset];
        for (int i = 0; i < offset; i++) {
            auxiliary[i] = array[i];
        }

        int j;
        for (j = 0; j < array.length - offset; j++) {
            array[j] = array[j + offset];
        }

        for (int i = 0; i < offset; i++) {
            array[j++] =  auxiliary[i];
        }

        return array;
    }

    // Time - O(n)
    // Space - O(1)
    int[] rotateInMemory(int[] array, int offset) {
        for (int i = 0; i < offset; i++) {
            rotateByOne(array);
        }
        return array;
    }

    private void rotateByOne(int array[]) {
        int i, temp;
        temp = array[0];
        for (i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] = temp;
    }
}
