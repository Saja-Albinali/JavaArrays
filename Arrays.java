public class Arrays {
    public static void main(String[] args) {
        int[] temperatures = new int[5];
        temperatures[0] = 40;
        temperatures[1] = 30;
        temperatures[2] = 25;
        temperatures[3] = 18;
        temperatures[4] = 20;

        temperatures[2]=45;

        for (int temp:temperatures){
            System.out.println(temp);
        }
    }
}
