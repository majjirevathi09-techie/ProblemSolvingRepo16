class Solution {
    public String removeDuplicateLetters(String s) {

   //storing last index value in array
		int[] lastIndex = new int[26];
		for(int i=0;i<s.length();i++) {
			int valOfAlpha = s.charAt(i)-'a';
			lastIndex[valOfAlpha]=i;
		}
		boolean [] seen = new boolean[26]; //by default false
		Stack <Character>st = new Stack();
		for(int i=0;i<s.length();i++) {
			int curr = s.charAt(i)-'a';
			if(seen[curr])continue; //if already seen move forward
			while(!st.isEmpty() && st.peek()>s.charAt(i)
					&& i<lastIndex[st.peek()-'a']) {
				seen[st.peek()-'a']=false;
				st.pop();
			}
			st.push(s.charAt(i));
			seen[curr]=true;
			}
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty()) {
			sb.append(st.pop());
			
			
		}
		return sb.reverse().toString();
	}
}

     //cant use HashSet or TreeSet(asc/des order) because order needs to be maintained
     //to maintain order we should use Linked HashSet
    //  Set<Character> treeSet = new TreeSet<Character>();
    //    char inputCharArray[] = s.toCharArray();
    //    StringBuilder sb = new StringBuilder();
    //             for(char character:inputCharArray){
    //                 if(treeSet.add(character)){
    //                         sb.append(character);
    //                 }
    //             }
    //             return sb.toString();
    