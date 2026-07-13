/**

  P34: Sequential Digits

  Example 1:
  Input: low = 100, high = 300
  Output: [123,234]
  
  Example 2:
  Input: low = 1000, high = 13000
  Output: [1234,2345,3456,4567,5678,6789,12345]

*/

class Problem34 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ls = new ArrayList<Integer>();
        String num = "123456789";
        for(int i = String.valueOf(low).length(); i <= String.valueOf(high).length(); i++){
            for(int j = 0; j <= 9-i; j++){
                int temp = Integer.parseInt(num.substring(j,i+j));
                if(temp >=low  && temp <=high){
                    ls.add(temp);
                }
                //optimization
                if(temp>high)
                    break;
            }
        }
        return ls;
    }
}
