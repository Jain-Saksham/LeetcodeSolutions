**Add Two Numbers**

**Problem**
- You are given two non-empty linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the result as a linked list.
- Each input list has no leading zeros except the number 0 itself.

**Approach**
- Traverse both linked lists simultaneously while maintaining a carry value (initially 0).
- At each step, sum the values of the current nodes (treating missing nodes as 0) plus the carry.
- Create a new node with the digit part of the sum (`sum % 10`) and append it to the result list.
- Update the carry to `sum / 10` (integer division).
- Continue until both lists are exhausted and carry is 0.

**Time Complexity**
- O(max(m, n)) — one pass through the longer of the two lists.

**Space Complexity**
- O(max(m, n)) — the size of the output list, not counting input lists.

**Example**
- Input: `(2 -> 4 -> 3)` + `(5 -> 6 -> 4)` (represents 342 + 465)
- Output: `7 -> 0 -> 8` (represents 807)

**Notes**
- The solution builds the resulting linked list in forward order while iterating.
- Handles carry at the end by appending an extra node if needed.
