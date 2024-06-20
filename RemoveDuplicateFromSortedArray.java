public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        int length = RemoveDup(arr);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int RemoveDup(int arr[]) {
        if (arr.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
