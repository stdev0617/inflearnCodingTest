package array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintBigNumber {
    public List<Integer> solution(int target, List<Integer> list) {
        list.stream().filter(dest -> target < dest).collect(Collectors.toList());
        return list;
    }
}
