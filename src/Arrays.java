public class Arrays {

    public static int findFirst(int[] arr, int x) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int findLast(int[] arr, int x) {
        int i = arr.length - 1;
        while (i >= 0) {
            if (arr[i] == x) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int maxAbs(int[] arr) {
        int maxAbsValue = arr[0];
        int i = 1;

        while (i < arr.length) {
            int absValue = (arr[i] < 0) ? -arr[i] : arr[i];
            int maxAbs = (maxAbsValue < 0) ? -maxAbsValue : maxAbsValue;

            if (absValue > maxAbs) {
                maxAbsValue = arr[i];
            }
            i++;
        }
        return maxAbsValue;
    }

    public static int countPositive(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean palindrom(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static int[] reverseBack(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int[] reversed = new int[arr.length];

        while (i <= j) {
            reversed[i] = arr[j];
            reversed[j] = arr[i];

            i++;
            j--;
        }
        return reversed;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j++] = i;
            }
        }

        return result;
    }

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    public static int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];
        int j = 0;

        for (int i = 0; i < pos; i++) {
            result[j] = arr[i];
            j++;
        }

        result[j++] = x;

        for (int i = pos; i < arr.length; i++) {
            result[j++] = arr[i];
        }

        return result;
    }

    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        int j = 0;

        for (int i = 0; i < pos; i++) {
            result[j++] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[j++] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[j++] = arr[i];
        }

        return result;
    }
}
