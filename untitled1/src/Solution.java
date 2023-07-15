//class Solution {
////    public static int maxProfit(int[] prices) {
////        System.out.println(prices[1]);
////
////        return 1;
////    }
//
//    public static void main(String[] args) {
////        int prices[] = {7,1,5,3,6,4,0};
//        int prices[] = {2,4,1};
//        int minimum = 99999;
//        int minPos = -1;
//        for(int i = 0 ; i < prices.length;i++){
//            // System.out.println(prices[i]);
//            if(prices[i] < minimum){
//                minimum = prices[i];
//                minPos = i;
//            }
//        }
//        System.out.println(minimum + "  " + minPos);
//
//        System.out.println("Minimum = " + minimum + "MinPosition = " + minPos + "length = " + prices.length);
//        if(minPos == prices.length-1)
//        {
//            System.out.println("EQUALLLLLLLLL");
//            return ;
//        }
//
//        int maximum = -99999;
//        int maxPos = -1;
//        for(int i = minPos ; i < prices.length;i++){
//            // System.out.println(prices[i]);
//            if(prices[i] > maximum){
//                maximum = prices[i];
//                maxPos = i;
//            }
//        }
//        System.out.println(maximum + "  " + maxPos);
//    }
//}
class Solution {
    public static void main(String[] args) {
        int x[] = {2,4,1};
        maxProfit(x);
    }
    public static int maxProfit(int[] prices) {
        //int prices[] = {7,1,5,3,6,4};
        int minimum = 99999;
        int minPos = -1;
        for(int i = 0 ; i < prices.length;i++){
            if(prices[i] < minimum){
                minimum = prices[i];
                minPos = i;
            }
        }
        System.out.println(minimum + "  " + minPos);


        if(minPos == (prices.length-1))
        {
            return 0;
        }
        else
            {
                int maximum = -99999;
                int maxPos = -1;
                for(int i = minPos ; i < prices.length;i++){
                    if(prices[i] > maximum){
                        maximum = prices[i];
                        maxPos = i;
                    }
                }
                System.out.println(maximum + "  " + maxPos);
                return maximum-minimum;
            }
        }
    }