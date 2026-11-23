class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>arr = new HashSet<>();
        HashSet<Integer>arr2 = new HashSet<>();
    
        for(int a : nums1){
            arr.add(a);
        }
        for(int a : nums2){
            if(arr.contains(a)){
                arr2.add(a);
            }
        }
        int[] ress = new int[arr2.size()];
        int i=0;
        for(int a : arr2){
            ress[i] = a;
            i++;

        }
        return ress;
    }
}