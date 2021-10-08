package recursion;

public class BinarySearch {

    public static int performBinarySearch(int[] arr, int start,int end, int searchValue){
        //indentfy the center index
        int mid = (end+start)/2;

        // need this condition to end the loop when searched value not present
        if(end >= start) {
            if(arr[mid]== searchValue)
                return mid;
            else if(arr[mid] > searchValue) {
                // going into left half
                return performBinarySearch(arr, start, mid-1, searchValue);
            }
            else if (arr[mid] < searchValue) {
                // going into right half
                return performBinarySearch(arr, mid + 1, end, searchValue);
            }
        }
        // value not present so returning  -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {7,9,22,34,56,73,121,243,454,655,888};
        int index = performBinarySearch(array, 0, array.length-1, 8);
        System.out.println("index of searched value : " + index);

        System.out.println(performBinarySearch(array, 0, array.length-1, 7));
        System.out.println(performBinarySearch(array, 0, array.length-1, 9));
        System.out.println(performBinarySearch(array, 0, array.length-1, 22));
        System.out.println(performBinarySearch(array, 0, array.length-1, 34));
        System.out.println(performBinarySearch(array, 0, array.length-1, 56));
        System.out.println(performBinarySearch(array, 0, array.length-1, 73));
        System.out.println(performBinarySearch(array, 0, array.length-1, 121));
        System.out.println(performBinarySearch(array, 0, array.length-1, 243));
        System.out.println(performBinarySearch(array, 0, array.length-1, 454));
        System.out.println(performBinarySearch(array, 0, array.length-1, 655));
        System.out.println(performBinarySearch(array, 0, array.length-1, 888));

    }
}
