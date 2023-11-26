import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class TwoSumPresent{
    public static void main(String[] args) {
        Integer[] input = {4, 2, 6, 5, 2};
        List<Integer> inputList = new ArrayList<>();
        //Collections.addAll(inputList, input);
        //Arrays.stream(input).boxed().collect(Collectors.toCollection(ArrayList::new));
        int sum  = 4;
        for(int i = 0; i < inputList.size(); i++){
            int diff = Math.abs(sum - input[i]);
            if(inputList.contains(diff) && inputList.indexOf(diff) != i){
                System.out.println(true);
                break;
            }
        }
    }
}