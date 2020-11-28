public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        DistanceBetweenBusStops d = new DistanceBetweenBusStops();
        int[] distance = new int[]{1, 2, 3, 4};
        int start = 0, destination = 3;
        System.out.println(d.distanceBetweenBusStops(distance, 0, 3));
        System.out.println(d.distanceBetweenBusStops(distance, 0, 2));
    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1 = 0;
        int sum2 = 0;
        int first = Math.min(start, destination);
        int second = Math.max(start, destination);
        int p = first;
        while (p != second) {
            sum1 += distance[p];
            p = (p + 1) % distance.length;
        }
        while (p != first) {
            sum2 += distance[p];
            p = (p + 1) % distance.length;
        }
        return Math.min(sum1, sum2);
    }
}