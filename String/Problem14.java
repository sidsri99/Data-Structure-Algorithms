/**
  
  P14: String Matching in an Array
  Example 1:
  Input: words = ["mass","as","hero","superhero"]
  Output: ["as","hero"]
  Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
  ["hero","as"] is also a valid answer.
  
  Example 2:
  Input: words = ["leetcode","et","code"]
  Output: ["et","code"]
  Explanation: "et", "code" are substring of "leetcode".
  
  Example 3:
  Input: words = ["blue","green","bu"]
  Output: []
  Explanation: No string of words is substring of another string.
  
*/

class Problem14 {
    public List<String> stringMatching(String[] words) {
        List<String> ls=new ArrayList<String>();
        /*
        for(int i=0;i<words.length;i++){
            boolean flag = false;
            for(int j=0; j<words.length;j++){
                if(i!=j && words[i].length()<=words[j].length()){
                    for(int k=0;k<=words[j].length()-words[i].length();k++)
                    {
                        String tmp = words[j].substring(k,k+words[i].length());
                        if(tmp.equals(words[i])){
                            ls.add(words[i]);
                            flag = true;
                            break;
                        }
                    }
                    if(flag == true)
                        break;
                }
            }
        }
        */
        /*for(int i=0; i<words.length;i++){
            for(int j=0; j<words.length; j++){
                //if(i!=j && words[i].length()<=words[j].length()){
                //    if(words[j].contains(words[i]) && ! ls.contains(words[i]))
                //        ls.add(words[i]);
                }
                if(i!=j && words[j].indexOf(words[i])>=0){
                    ls.add(words[i]);
                    break;
                }
            }

        }*/
        /*String tmp = " ";
        for(String s: words){
            tmp += " " + s;
        }*/
        String tmp = String.join(" ",words);
        for(String s: words){
            if(tmp.indexOf(s) != tmp.lastIndexOf(s)){
                ls.add(s);
            }
        }
        return ls;
    }
}

/*

>["leetcoder","leetcode","od","hamlet","am"]
["leetcode","od","am"]
>["uexk","aeuexkf","wgxih","yuexk","gxea","yuexkm","ypmfx","jjuexkmb","wqpri","aeuexkfpo","kqtnz","pkqtnza","nrbb","hmypmfx","krqs","jjuexkmbyt","zvru","ypmfxj"]
["uexk","aeuexkf","yuexk","ypmfx","jjuexkmb","kqtnz"]
>["e","green","bu"]
[]
>["leetcode","et","code"]
["et","code"]
>["mass","as","hero","superhero"]
["as","hero"]

*/
