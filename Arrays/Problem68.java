/**
  P68: 1-bit and 2-bit Characters

  Example 1:
  Input: bits = [1,0,0]
  Output: true
  Explanation: The only way to decode it is two-bit character and one-bit character.
  So the last character is one-bit character.
  
  Example 2:
  Input: bits = [1,1,1,0]
  Output: false
  Explanation: The only way to decode it is two-bit character and two-bit character.
  So the last character is not one-bit character.
  
*/

class Problem68 {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length-1){
            i += bits[i] + 1;
        }
        return (i == bits.length-1);
    }
}
