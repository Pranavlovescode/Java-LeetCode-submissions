class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> basket = new ArrayList<>();
        for (int b : baskets) {
            basket.add(b);
        }

        int unplaced = 0;

        for (int fruit : fruits) {
            int j = 0;
            boolean placed = false;

            while (j < basket.size()) {
                if (fruit <= basket.get(j)) {
                    basket.remove(j);
                    placed = true;
                    break;
                }
                j++;
            }

            if (!placed) {
                unplaced++;
            }
        }

        return unplaced;
    }
}