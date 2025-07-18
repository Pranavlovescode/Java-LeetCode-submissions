class Solution {
    public boolean isNStraightHand(int[] hand, int k) {
        if(hand.length%k !=0 )return false;
        // used treemap to store the keys in sorted order;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num :hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        while(!map.isEmpty()){
            int num = map.firstKey();
            int freq = map.get(num);
            for(int i=0;i<k;i++){
                int curr = num+i;
                if(map.getOrDefault(curr, 0)<freq) return false;
                map.put(curr,map.get(curr) - freq);
                if(map.get(curr) ==0) map.remove(curr);
            }
        }
        return true;
    }
}