package two_pointers_and_sliding_windows;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MergingTwoArrays {
    public List<Integer> solution(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] < arr2[p2]) list.add(arr1[p1++]);
            else list.add(arr2[p2++]);
        }
        while(p1<arr1.length) {
            list.add(arr1[p1++]);
        }
        while(p2<arr2.length) {
            list.add(arr2[p2++]);
        }
        return list;
    }
}
