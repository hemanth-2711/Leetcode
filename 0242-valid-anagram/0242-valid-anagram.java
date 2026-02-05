class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character, Integer> FreqS = new HashMap<>();
        HashMap <Character, Integer> FreqT = new HashMap<>();

        for(int i =0; i < s.length(); i++){
            FreqS.put(s.charAt(i), FreqS.getOrDefault(s.charAt(i),0)+1);
            FreqT.put(t.charAt(i), FreqT.getOrDefault(t.charAt(i),0)+1);
        }
        return FreqS.equals(FreqT);
    }
}