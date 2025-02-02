public class Main {
    public static void main(String[] args) {
        System.out.println("Результат метода findFirst: " + Arrays.findFirst(new int[]{1, 2, 3, 4, 5, 6}, 2));
        System.out.println("Результат метода findLast: " + Arrays.findLast(new int[]{1, 2, 3, 4, 2, 2, 5}, 2));
        System.out.println("Результат метода maxAbs: " + Arrays.maxAbs(new int[]{1, -2, -7, 4, 2, 2, 5}));
        System.out.println("Результат метода countPositive: " + Arrays.countPositive(new int[]{1, -2, -7, 4, 2, 2, 5}));
        System.out.println("Результат метода palindrom: " + Arrays.palindrom(new int[]{1, -2, -7, 4, -7, -2, 1}));

        int[] arr = {1, 2, 3, 4, 4, 5};
        Arrays.reverse(arr);
        System.out.println("Результат метода reverse: " + Tools.printArray(arr));

        System.out.print("Результат метода reverseBack: " + Tools.printArray(Arrays.reverseBack(new int[]{1, 2, 3, 4, 5})));
        System.out.print("Результат метода concat: " + Tools.printArray(Arrays.concat(new int[]{1, 2, 3, 4, 5}, (new int[]{6, 7, 8, 9, 10}))));
        System.out.print("Результат метода findAll: " + Tools.printArray(Arrays.findAll(new int[]{1, 2, 2, 4, 2}, 2)));
        System.out.print("Результат метода deleteNegative: " + Tools.printArray(Arrays.deleteNegative(new int[]{1,2,-3,4,-2,2,-5})));
        System.out.print("Результат метода add: " + Tools.printArray(Arrays.add(new int[]{1, 2, 3, 4, 5}, 9, 3)));
        System.out.print("Результат метода add: " + Tools.printArray(Arrays.add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 3)));
    }
}