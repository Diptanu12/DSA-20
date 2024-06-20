public class optimalLongestSubArrayWithSumK {


    public static void main(String[] args) {
        int[] a = {-1, 1, 1};
        long k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    static int getLongestSubarray(int[] a, long k) {
        int left = 0;
        int right = 0;
        long sum = a[0];

        int maxlen = 0;
        int n = a.length;

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;

            }
            if(sum==k){
                maxlen=Math.max(maxlen, right-left+1);
            }
            right++;
            if (right < n) {
                sum += a[right];
            }
        }
        return  maxlen;
    }
}
