class Solution {
    public boolean checkIfPangram(String sentence) {
    //         if(sentence.length()<26) return false;
    //     for(char i='a'; i<='z';i++){
    //         if(sentence.indexOf(i)<0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }



        HashSet<Character> charSet = new HashSet<Character>();
        char[] charArray = sentence.toCharArray();
        for(char c : charArray){
            if(Character.isLetter(c)){
                charSet.add(c);
            }
        }
        if(charSet.size()==26){
            return true;
        }
    return false;
    }
}

