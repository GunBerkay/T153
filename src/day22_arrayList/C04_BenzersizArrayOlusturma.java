package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_BenzersizArrayOlusturma {
    public static void main(String[] args) {

        int[]arr={1,2,5,8,2,5,8,5,2,3,5,1};

        List<Integer> tekrarsizList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println("Tekrarsiz list : "+tekrarsizList);

        arr=new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= tekrarsizList.get(i);
        }

        System.out.println("Array'in son hali : "+ Arrays.toString(arr));

    }
}
