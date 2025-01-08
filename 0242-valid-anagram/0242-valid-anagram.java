class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>() ;

        for (int i = 0 ; i < s.length() ; i++){
            sList.add(s.charAt(i));
        }
        for (int i = 0 ; i < t.length() ; i++){
            tList.add(t.charAt(i));
        }

        Collections.sort(sList);
        Collections.sort(tList);
        return tList.equals(sList) ;
    }
}