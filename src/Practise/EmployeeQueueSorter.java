package Practise;
import java.util.*;
public class EmployeeQueueSorter {
    public static void main(String[] args) {
        // Input queue (Front -> Rear)
        Queue<String> inStrQueue = new LinkedList<>();
        inStrQueue.add("John:3");
        inStrQueue.add("Alice:2");
        inStrQueue.add("Bob:2");
        inStrQueue.add("Eve:1");
        // Call the sorting method
        Queue<String> outStrQueue = sortEmployeeQueue(inStrQueue);
        // Print Output Queue (Front -> Rear)
        System.out.println("Output Queue (Front -> Rear): " + outStrQueue);
    }
    public static Queue<String> sortEmployeeQueue(Queue<String> inStrQueue) {
        // Convert queue to list for sorting
        List<String> list = new ArrayList<>(inStrQueue);

        // Sort using custom comparator
        Collections.sort(list, (a, b) -> {
            String[] empA = a.split(":");
            String[] empB = b.split(":");

            String nameA = empA[0];
            String nameB = empB[0];
            int rankA = Integer.parseInt(empA[1]);
            int rankB = Integer.parseInt(empB[1]);

            if (rankA != rankB) {
                return Integer.compare(rankA, rankB); // sort by rank
            } else {
                return nameA.compareToIgnoreCase(nameB); // if same rank, by name
            }
        });

        // Add sorted elements into new queue
        Queue<String> outStrQueue = new LinkedList<>(list);

        return outStrQueue;
    }
}
