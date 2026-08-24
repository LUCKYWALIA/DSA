class Solution {
final long M = 1_000_000_007;
    long pow(long a,long b){
if(b==0){
    return 1;
}
long half=pow(a,b/2);
long res=(half*half)%M;
if(b%2==1) res=(res*a)%M;
return res;
    }
    public int countGoodNumbers(long n) {
        long first = pow(5, (n + 1) / 2);
            long second = pow(4, n / 2);
return (int) ((first * second) % M);
}
}