import java.util.*;

class RecentCounter {

    Queue<Integer> q; // queue to store timestamps

    // Constructor
    public RecentCounter() {
        q = new LinkedList<>();
    }

    // Function to count requests in last 3000 ms
    public int ping(int t) {

        // Step 1: Add current request time
        q.add(t);

        // Step 2: Remove outdated requests
        // Keep only those in range [t-3000, t]
        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll(); // remove old request
        }

        // Step 3: Remaining queue size = valid requests
        return q.size();
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));    // [1] → 1
        System.out.println(rc.ping(100));  // [1,100] → 2
        System.out.println(rc.ping(3001)); // [1,100,3001] → 3
        System.out.println(rc.ping(3002)); // [100,3001,3002] → 3
    }
}