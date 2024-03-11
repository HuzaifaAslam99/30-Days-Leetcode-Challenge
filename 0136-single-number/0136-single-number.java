class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            array.add(nums[i]);
        }

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).equals(array.get(j))) {
                    array.remove(j);
                    array.remove(i);
                    i--;
                    break;
                }
            }
        }
        return array.get(0);
    }
}

