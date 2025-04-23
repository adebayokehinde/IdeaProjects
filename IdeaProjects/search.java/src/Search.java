public class Search {
    public static int searchValue(int[] arr, int value) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] inputArray = {12, 17, 24, 32, 14};
            int valueToSearch = 24;
            int index = searchValue(inputArray, valueToSearch);

            if (index != -1) {
                System.out.println("Index of " + valueToSearch + ": " + index);
            } else {
                System.out.println(valueToSearch + " not found in the array.");
            }
        }



}