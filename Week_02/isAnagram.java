class Solution {
   //ֱ��ʹ������ 
   public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);
    }

    //��ϣ
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(char c:s.toCharArray()){
            count[c-97]+=1;
        }
        for(char c:t.toCharArray()){
            count[c-97]-=1;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            };
        }
        return true;
    }