import java.util.*;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);

        int totalUnits = 0;

        for(int []box : boxTypes) {
            int noOfBoxes = box[0];
            int unitsPerBox = box[1];

            int boxTaken = Math.min(noOfBoxes, truckSize);

            totalUnits = totalUnits + boxTaken * unitsPerBox;
            truckSize = truckSize - boxTaken;

            if(truckSize == 0) {
                break;
            }
        }
        return totalUnits;
    }
}