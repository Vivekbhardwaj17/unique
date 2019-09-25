import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class ListinsideList {
    public static void main(String[] args) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> first=new ArrayList<>();
        first.add(2);
        first.add(3);
        first.add(4);
        List<Integer> second=new ArrayList<>();
        second.add(5);
        second.add(6);
        second.add(7);
        List<Integer> third=new ArrayList<>();
        third.add(8);
        third.add(9);
        third.add(10);
        arr.add(first);
        arr.add(second);
        arr.add(third);
       // System.out.println(arr.get(0).get(1));
        int sum=0;
        int sum2=0;
        for(int i=0;i<arr.size();i++){
          sum+=arr.get(i).get(i);
          // System.out.println(sum);
          sum2+=arr.get(i).get((arr.size()-1)-i);
           // System.out.println(sum2);
            int n=Integer.MAX_VALUE;

        }
      //  List<List<Integer>>newlist=new HashSet<Integer>();
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.size());
        System.out.println("Ans is"+Math.abs(sum-sum2));
    }
}
