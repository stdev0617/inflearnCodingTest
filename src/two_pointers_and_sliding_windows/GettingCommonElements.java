package two_pointers_and_sliding_windows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GettingCommonElements {
    public List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(p1 < n && p2 < m) {
            if(arr1[p1] == arr2[p2]) {
                list.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if(p1 < arr1.length && arr1[p1] < arr2[p2]) p1++;
            else if(p2 < arr2.length && arr1[p1] > arr2[p2]) p2++;
        }
        return list;
    }
}
