import java.lang.Math;
class Solution {
    public int trailingZeroes(int n) {
        if(n<=4) return 0;
        if(n==5) return 1;
        int sum=0;
        int i=1;
        while(n>(int)Math.pow(5,i)){
            sum=sum+(n/((int)Math.pow(5,i)));
            i++;
        }
        for(int j=2;j<n;j++){
            if(Math.pow(5,j)==n){
                sum=sum+1;
                break;
            }
        }
        return sum;
    }
}
