
public class ShoetesPath {

    public static float shortesDis(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {

            char dis = path.charAt(i);
            if (dis == 'S') {
                y--;
            } else if (dis == 'N') {
                y++;
            } else if (dis == 'W') {
                x--;
            } else {
                x++;
            }

        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {

        // String path = "WNEENESENNN";
        String path = "NS";
        float dis = shortesDis(path);
        System.out.println(dis);

    }

}
