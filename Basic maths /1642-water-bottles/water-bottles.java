class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int d = numBottles;
        int e = numBottles;
        while(e >= numExchange){
            int nb = e / numExchange ;
            d += nb;
            e = e%numExchange + nb;
        }
        return d;
    }
}