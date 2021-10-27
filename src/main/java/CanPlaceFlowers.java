public class CanPlaceFlowers {
    public static void main(String[] args) {
        CanPlaceFlowers c = new CanPlaceFlowers();
        int[] nums = new int[] {1, 0, 0, 0, 1};
        int n = 1;
        //        System.out.println(c.canPlaceFlowers(nums, n));
        nums = new int[] {0, 0, 1, 0, 0};
        n = 1;
        System.out.println(c.canPlaceFlowers(nums, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i - 1 < 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            } else if (i + 1 >= flowerbed.length) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
