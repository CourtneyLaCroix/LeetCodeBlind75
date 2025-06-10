class Solution {
    public int hammingWeight(int n) {

        int binaryOfN = convertToBinary(n);

        return binaryOfN;
    }


    public int convertToBinary(int n){

        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}