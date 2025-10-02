/**
  P6: Water Bottles II
  Example 1:
  Input: numBottles = 13, numExchange = 6
  Output: 15
  Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.
    
  Example 2:
  Input: numBottles = 10, numExchange = 3
  Output: 13
  Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.
*/

class Probblem6 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        int drinkBottles = numBottles;
        numBottles = 0;
        while(emptyBottles >= numExchange){
            drinkBottles += 1;
            emptyBottles = emptyBottles - numExchange + 1;
            numExchange += 1;
        }
        return drinkBottles;
    }
}
