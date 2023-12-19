public class LeetCode605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                // check left and right plots are empty
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i-1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length-1) || (flowerbed[i+1] == 0);
                // both plats are empty we plat here
                if(emptyLeftPlot && emptyRightPlot){
                    flowerbed[i] =1;
                    cnt++;
                }
            }
        }
        return cnt>=n;
    }

    public static void main(String[] args) {
    int[] flowerbed = {1,0,0,0,1};
    int n =2;
        System.out.println(canPlaceFlowers(flowerbed,n));

    }
}
