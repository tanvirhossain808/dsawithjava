public class TrappedRainWater {
    public static int trapedWater(int height[]) {
        int n = height.length;
        int leftMaxHeight[] = new int[n];
        leftMaxHeight[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxHeight[i] = Math.max(height[i], leftMaxHeight[i - 1]);
        }

        int rightMaxHeight[] = new int[n];
        rightMaxHeight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            rightMaxHeight[i] = Math.max(rightMaxHeight[i + 1], height[i]);
            // System.out.print(rightMaxHeight[i]);
        }

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLever = Math.min(leftMaxHeight[i], rightMaxHeight[i]);
            if (leftMaxHeight[i] == rightMaxHeight[i])
                System.out.print(rightMaxHeight[i] + "hey");
            trappedWater += waterLever - height[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {

        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        int ansOfWaterLever = trapedWater(heights);
        System.out.println(ansOfWaterLever);

    }
}
