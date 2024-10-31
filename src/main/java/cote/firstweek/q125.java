package cote.firstweek;

public class q125 {

    class Solution {
        public boolean isPalindrome(String s) {


           s= s.toLowerCase().replaceAll("[^a-z0-9]", "");


            // 대칭인지 확인해야하잖아 ,
            //  21개면 >  10번 까지 >  둘이 같은지 연산하면됨
            // 문제는 입력받은 문자열을 >
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    return false;
                }
            }

            return true;
        }
    }


}
