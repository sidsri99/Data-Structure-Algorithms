/*
    Valid Palindrome
    A phrase is a palindrome if,
    after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters,
    it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.

    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.

*/

class Problem4 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="", s2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' &&ch<='9') ){
                s1=s1+(char)ch;
                s2=(char)ch+s2;
            }
        }
        return s1.equals(s2);
    }
}

/*
    Optimize run time:
    After removing alpha numeric char
    Check both From start & From end
    If char do not meet return false
*/