public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToRemove = 3;
        int[] newArray = removeElement(arr, elementToRemove);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

}

    private static int[] removeElement(int[] arr, int elementToRemove) {
        int[] result= new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove && index < arr.length -1) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
    }
