class Solution {
public:
    int fo(vector<int>& nums , int target){
        int s = 0 ;
        int e = nums.size() - 1;
        int ans = -1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                ans = m;
                e = m - 1; 
            } else if (nums[m] < target){
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
    int lo(vector<int>& nums , int target){
        int s = 0 ;
        int e = nums.size() - 1;
        int ans = -1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                ans = m;
                s = m + 1; 
            } else if (nums[m] < target){
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        int f = fo(nums , target);
        int l = lo(nums , target);
        vector<int> ans;
        ans.push_back(f);
        ans.push_back(l);
        return ans;
    }
};