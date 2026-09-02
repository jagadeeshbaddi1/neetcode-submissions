class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(str);
        s=String.valueOf(str);
        Arrays.sort(t1);
        t=String.valueOf(t1);

        if(s.equals(t))return true;
        else return false;
    }
}
