/**

  P58: Finding 3-Digit Even Numbers

  Example 1:
  Input: digits = [2,1,3,0]
  Output: [102,120,130,132,210,230,302,310,312,320]
  Explanation: All the possible integers that follow the requirements are in the output array. 
  Notice that there are no odd integers or integers with leading zeros.
  
  Example 2:
  Input: digits = [2,2,8,8,2]
  Output: [222,228,282,288,822,828,882]
  Explanation: The same digit can be used as many times as it appears in digits. 
  In this example, the digit 8 is used twice each time in 288, 828, and 882. 
  
  Example 3:
  Input: digits = [3,7,5]
  Output: []
  Explanation: No even integers can be formed using the given digits.

*/

class Problem58 {
    public int[] findEvenNumbers(int[] digits) {
        int count[]=new int[10];
        for(int d: digits){
            count[d] += 1;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=100; i<1000;i++){
            if((i & 1) == 0){
                int unit    = i%10;
                int tenth   = (i/10)%10;
                int hundred = (i/100)%10;
                int tmpCount[]=new int[10];
                tmpCount[unit]    += 1;
                tmpCount[tenth]   += 1;
                tmpCount[hundred] += 1;
                if(count[unit]    >= tmpCount[unit]  &&
                   count[tenth]   >= tmpCount[tenth] &&
                   count[hundred] >= tmpCount[hundred]){
                        list.add(i);
                }
            }
        }
        int res[] = new int[list.size()]; 
        for(int i =0; i< res.length ;i++){
            res[i] = list.get(i);
        }
        return res;
        /*
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                for(int k=0; k<digits.length; k++){
                    if(i!=j && j!=k && i!=k && digits[i]!=0 && (digits[k]&1)==0){
                        hs.add(digits[i]*100+digits[j]*10+digits[k]);
                    }
                }
            }
        }
        List<Integer> res=new ArrayList<>(hs);
        int ans[]=new int[hs.size()];
        for(int i=0; i<ans.length;i++){
            ans[i]=res.get(i);
        }
        Arrays.sort(ans);
        return ans;
        */
    }
}

/*

Input
digits =
[1,8,7,7,1,1,5,4,0,0,7,5,1,7,9]
Output
[100,104,108,110,114,118,140,148,150,154,158,170,174,178,180,184,190,194,198,400,408,410,418,450,458,470,478,480,490,498,500,504,508,510,514,518,540,548,550,554,558,570,574,578,580,584,590,594,598,700,704,708,710,714,718,740,748,750,754,758,770,774,778,780,784,790,794,798,800,804,810,814,840,850,854,870,874,890,894,900,904,908,910,914,918,940,948,950,954,958,970,974,978,980,984]

*/
