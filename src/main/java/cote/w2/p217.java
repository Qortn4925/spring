package cote.w2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class p217 {
    // 정렬 이용한 풀이 + 투 포인터
    /*
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
return false;
    }
     */

    // map
    /*
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.containsKey(nums[i])&&map.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
     */
    // 반복문 2번 써서,  0> 1,2,3,4, 비교 , 1 >,2,3,4, 비교도 있고
    // set   > 제일 적합한 풀이임
    /*
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;

        HashSet<Integer> set = new HashSet<>((int)(nums.length / 0.75) + 1);
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
     */

}
