class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char task : tasks) {
            freqMap.put(task, freqMap.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.addAll(freqMap.values());

        int time = 0;

        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;
            int tasksDone = 0;

            for (int i = 0; i < cycle && !pq.isEmpty(); i++) {
                int freq = pq.poll();
                if (freq - 1 > 0) {
                    temp.add(freq - 1);
                }
                tasksDone++;
                time++;
            }

            for (int remaining : temp) {
                pq.offer(remaining);
            }

            // Only add idle time if there's still work to do
            if (!pq.isEmpty()) {
                time += (cycle - tasksDone);
            }
        }

        return time;
    }
}
