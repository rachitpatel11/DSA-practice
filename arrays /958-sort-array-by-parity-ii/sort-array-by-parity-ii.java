class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int e = 0 ;
        int o = 1;
        for(int num : nums){
            if(num % 2 == 0){
                res[e] = num;
                e += 2;
            } else {
                res[o] = num;
                o += 2;
            }
        }
    return res;
    }
}