class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for(String s: strs){
            String key = sort(s);
            if(!m.containsKey(key)){
                m.put(key, new ArrayList<>());
            }
            m.get(key).add(s);

        }
        return new ArrayList<>(m.values());
    }

    public String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        return key;
    }
}