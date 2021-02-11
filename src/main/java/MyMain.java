import java.util.ArrayList;

public class MyMain {

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        int x = 0; 
        int y = 0; 
        for(int i = 0; i < list.size(); i++){
            x = list.get(i); 
            y = i - 1; 
            while(y >= 0 && list.get(y) > x){
                list.set(y+1,list.get(y));
                y--; 
            }
            list.set(y + 1, x); 
        }
        return list;
    }   

    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] SortedArr = new int[arr1.length + arr2.length];
        int x = 0;
        int y = 0;
        int z = 0;
        while (x < arr1.length && y < arr2.length){
            if (arr1[x] < arr2[y]) {
                SortedArr[z] = arr1[x];
                x++;
            }
            else {
                SortedArr[z] = arr2[y];
                y++;
            }
            z++;
        }
        while (x < arr1.length) {
            SortedArr[z] = arr1[x];
            x++;
            z++;
        }
        while (y < arr2.length) {
            SortedArr[z] = arr2[y];
            y++;
            z++;
        }
        return SortedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test= new ArrayList<Integer>();
        test.add(5);
        test.add(3);
        test.add(6);
        test.add(1);
        test.add(2);
        System.out.println(insertionSort(test));
        int[] arr1 = new int[]{ 1,3,4,6,8,10 };
        int[] arr2 = new int[]{ 2,5,7,9 };
        System.out.println(merge(arr1, arr2));
    }
}
