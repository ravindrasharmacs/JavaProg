import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 6, 7};
        int[] arr2 = {4,5, 8, 9, 10};//

        int[] mergedArray = mergeArrays(arr1, arr2);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");//
        }
         System.out.println();
        //Integrate a linked list
        LinkList list = new LinkList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.reverse();
        System.out.println("Reversed list :");
        list.display();
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result);
        return result;
    }
}