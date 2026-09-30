class Solution {
    public List<String> generateParenthesis(int n) {
        int N=n*2,open=0,close=0,idx=0;
        char[] arr=new char[n*2];
        List<String> list=new ArrayList<>();
        generate(N,open,close,arr,idx,list);
        return list;
    }
    public void generate(int N,int open,int close,char arr[],int idx, List<String> list){
        if(idx==N){
            list.add(new String(arr));
            return;
        }
        if(open<N/2){
            arr[idx]='(';
            generate(N,open+1,close,arr,idx+1,list);
        }if(close<open){
            arr[idx]=')';
            generate(N,open,close+1,arr,idx+1,list);
        }
    }
}
