package Stack_Queue;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 933. Number of Recent Calls 
 * https://leetcode.com/problems/number-of-recent-calls/
 * Tags: #Queue
 */


public class _933_Number_of_Recent_Calls {
    
    Queue<Integer> myQueue = new LinkedList<>();
    public int ping(int t) {
        myQueue.add(t);
        while (myQueue.peek() < (t - 3000)) {
            myQueue.remove();
        }
        return myQueue.size();
    }
}
