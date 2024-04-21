package Recursion;

public class PiarOfFriend {
    public static int pairFrind(int friend) {

        if (friend == 1 || friend == 2) {
            return friend;
        }

        return pairFrind(friend - 1) + (pairFrind(friend - 1) * pairFrind(friend - 2));

    }

    public static void main(String[] args) {
        int frind = 3;
        System.out.println(pairFrind(4));
    }
}
