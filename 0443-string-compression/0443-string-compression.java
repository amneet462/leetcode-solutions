class Solution {
    public int compress(char[] chars) {
     int wr=0;
     int read=0;
     while(read<chars.length ){
        int count=0;
        char curr=chars[read];
        while(read<chars.length && chars[read]==curr){
            count++;
            read++;
        }
        chars[wr++]=curr;
    
     if(count>1){
        for(char c:String.valueOf(count).toCharArray()){
            chars[wr++]=c;
        }
     }
      }
     return wr;
    }
}