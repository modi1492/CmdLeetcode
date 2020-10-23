public class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));// 返回 true ，因为有 1 个空的大车位
        System.out.println(parkingSystem.addCar(2)); // 返回 true ，因为有 1 个空的中车位
        System.out.println(parkingSystem.addCar(3));// 返回 false ，因为没有空的小车位
        System.out.println(parkingSystem.addCar(1));
        // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了

    }

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big -= 1;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (this.medium > 0) {
                    this.medium -= 1;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (this.small > 0) {
                    this.small -= 1;
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }
}