/**

  P5: Minimum Operations to Exceed Threshold Value II

  Example 1:
  Input: nums = [2,11,10,1,3], k = 10
  Output: 2
  Explanation: In the first operation, we remove elements 1 and 2, then add 1 * 2 + 2 to nums. nums becomes equal to [4, 11, 10, 3].
  In the second operation, we remove elements 3 and 4, then add 3 * 2 + 4 to nums. nums becomes equal to [10, 11, 10].
  At this stage, all the elements of nums are greater than or equal to 10 so we can stop.
  It can be shown that 2 is the minimum number of operations needed so that all elements of the array are greater than or equal to 10.
  
  Example 2:
  Input: nums = [1,1,2,4,9], k = 20
  Output: 4
  Explanation: After one operation, nums becomes equal to [2, 4, 9, 3].
  After two operations, nums becomes equal to [7, 4, 9].
  After three operations, nums becomes equal to [15, 9].
  After four operations, nums becomes equal to [33].
  At this stage, all the elements of nums are greater than 20 so we can stop.
  It can be shown that 4 is the minimum number of operations needed so that all elements of the array are greater than or equal to 20.

*/

class Problem5 {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<Long>();
        int count = 0;
        for(int no: nums){
            //pq.offer((long)no);
            pq.add((long)no);
        }
        while((pq.size()>1) && (pq.peek() < k)){
            //long n1 = pq.poll();
            long n1 = pq.remove();
            //long n2 = pq.poll();
            long n2 = pq.remove();
            //pq.offer(Math.min(n1,n2)*2+Math.max(n1,n2));
            //pq.offer(n1*2+n2);
            pq.add(n1*2+n2);
            count++;
        }
        return count;
    }
}

/*

>nums = [999999999,999999999,999999999]
>k = 1000000000
2

>nums = [1000000000,999999999,1000000000,999999999,1000000000,999999999]
>k = 1000000000
2

*/
