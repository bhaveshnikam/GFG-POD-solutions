class Solution {
    public static int noConseBits(int n) {
        // code here
        String s=Integer.toBinaryString(n);
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length-2;i++){
            if(arr[i] == '1'&& arr[i+1] == '1' && arr[i+2] == '1' ){
                arr[i+2]='0';
            }
        }
        String b=String.valueOf(arr);
        return Integer.parseInt(b,2);
    }
}
