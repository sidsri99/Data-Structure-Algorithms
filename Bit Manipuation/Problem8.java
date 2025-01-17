/**

  P8: Neighboring Bitwise XOR

  Example 1:
  Input: derived = [1,1,0]
  Output: true
  Explanation: A valid original array that gives derived is [0,1,0].
  derived[0] = original[0] ⊕ original[1] = 0 ⊕ 1 = 1 
  derived[1] = original[1] ⊕ original[2] = 1 ⊕ 0 = 1
  derived[2] = original[2] ⊕ original[0] = 0 ⊕ 0 = 0
  
  Example 2:
  Input: derived = [1,1]
  Output: true
  Explanation: A valid original array that gives derived is [0,1].
  derived[0] = original[0] ⊕ original[1] = 1
  derived[1] = original[1] ⊕ original[0] = 1

  Example 3:
  Input: derived = [1,0]
  Output: false
  Explanation: There is no valid original array that gives derived.
  
*/

class Problem8{
    public boolean doesValidArrayExist(int[] derived) {
        int ans = 0;
        for(int num: derived){
            ans = ans^num;
        }
        return ans == 0;
    }
  /*
    public boolean doesValidArrayExist(int[] derived) {
        int sum = 0;
        for (int num : derived) {
            sum += num;
        }
        return sum % 2 == 0;
    }
  
  */

  /*

  public boolean doesValidArrayExist(int[] derived) {
        // Create an original array initialized with 0.
        int[] original = new int[derived.length + 1];
        original[0] = 0;
        for (int i = 0; i < derived.length; i++) {
            original[i + 1] = derived[i] ^ original[i];
        }
        // Store the validation results in checkForZero and checkForOne respectively.
        boolean checkForZero = (original[0] == original[original.length - 1]);

        original[0] = 1;
        for (int i = 0; i < derived.length; i++) {
            original[i + 1] = derived[i] ^ original[i];
        }
        boolean checkForOne = (original[0] == original[original.length - 1]);

        return checkForZero || checkForOne;
    }
  
  */
  
}

/*

>0
true
>1
false

*/
