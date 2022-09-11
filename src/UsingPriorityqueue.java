import java.util.PriorityQueue;
// Space Complexity=O(n)
// Time Complexity=O(nlogn)
public class UsingPriorityqueue {
    public static int kthlargest(int[] arr, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int i : arr) {
            minheap.add(i);

            if (minheap.size() > k) {
                minheap.remove();
            }

        }

        return minheap.remove();
    }
}