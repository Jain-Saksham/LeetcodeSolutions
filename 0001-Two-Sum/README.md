**Two Sum**

**Problem**
- Given an array of integers and a target integer, return the indices of the two numbers that add up to the target. The implementation assumes exactly one valid answer (as per typical problem constraints).

**Approach**
- Iterate through the array while maintaining a `HashMap<Integer,Integer>` that maps value -> index.
- For each element `nums[i]`, compute the complement `target - nums[i]` and check if it exists in the map.
- If the complement is present, return the stored index for the complement and the current index `i`.
- Otherwise, store the current value and its index in the map and continue.

**Time Complexity**
- Average: O(n) — single pass through the array with O(1) average-time hashmap operations.

**Space Complexity**
- O(n) — additional space for the hashmap storing up to n elements.

**Example**
- Input: `nums = [2, 7, 11, 15]`, `target = 9`
- Output: `[0, 1]` (because `nums[0] + nums[1] == 9`)

**Notes**
- The provided implementation returns the first matching pair of indices as soon as it finds them.
- If no valid pair exists the method returns the default array (which in the given code is an array of two zeros), but most problem statements guarantee exactly one solution.
