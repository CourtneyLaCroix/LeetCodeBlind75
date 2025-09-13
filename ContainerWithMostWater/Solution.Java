class Solution {
    public int maxArea(int[] height) {
    
    int maxArea = 0;
    int pointerOnLeft = 0;
    int pointerOnRight = height.length - 1;


    while(pointerOnLeft < pointerOnRight) {
        maxArea = Math.max(maxArea, (pointerOnRight - pointerOnLeft) * 
                Math.min(height[pointerOnLeft], height[pointerOnRight]));

        if(height[pointerOnLeft] < height[pointerOnRight]){
            pointerOnLeft++;
        }else{
            pointerOnRight--;
        }

    }

    return maxArea;
        
    }
}