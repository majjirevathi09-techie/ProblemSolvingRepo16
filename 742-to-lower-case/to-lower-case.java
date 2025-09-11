class Solution {
    public String toLowerCase(String s) {
       char[]A = s.toCharArray();
       StringBuilder sb = new StringBuilder();
        for(int i =0;i<A.length;i++){
            if(A[i]>='A' && A[i]<='Z'){ 
                A[i] =  (char)(A[i]+32);
                sb.append(A[i]);
        }else{
            sb.append(A[i]);
        }
        }
        
        return sb.toString();
    }
}