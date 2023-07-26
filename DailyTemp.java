// https://leetcode.com/problems/daily-temperatures/
class Solution {
    public int[] dailyTemperatures(int[] temp) {
       int[] count=new int[temp.length];
       Stack<Integer> st = new Stack<>();
       for(int i=0;i<temp.length;i++){
           while(!st.isEmpty() && temp[st.peek()]<temp[i])
            {
                count[st.peek()]=i-st.peek();    
                st.pop();   
            }
            st.push(i);
       }
       return count;
    }
}
