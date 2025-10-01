class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        if(numBottles < numExchange) return numBottles;
        while(numBottles >= numExchange){
            total += numBottles/numExchange;
            numBottles = (numBottles/numExchange) + (numBottles - (numBottles/numExchange)*numExchange);
        }
        return total;
    }
};