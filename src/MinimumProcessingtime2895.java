import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumProcessingtime2895 {




    public static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        processorTime.sort(Collections.reverseOrder());

        int i = 0;
        int ans = 0;
        for (int processing_time : processorTime) {

            int max = 0;
            int cnt = 0;
            while (i < tasks.size() && cnt < 4) {
                max = Math.max(max, processing_time + tasks.get(i));
                i++;
                cnt++;
            }
            ans = Math.max(ans, max);

        }
        return ans;

    }
    public static void main(String[] args) {
        List<Integer> time = new ArrayList<>();
        List<Integer> tasks = new ArrayList<>();
        time.add(8);
        time.add(10);
//        2,2,3,1,8,7,4,5
        tasks.add(2);
        tasks.add(2);
        tasks.add(3);
        tasks.add(1);
        tasks.add(8);
        tasks.add(7);
        tasks.add(4);
        tasks.add(5);

        System.out.println(minProcessingTime(time,tasks));

    }
}
