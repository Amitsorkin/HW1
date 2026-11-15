public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        double mechane = 1.0;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                approxPi += 1/mechane;
                mechane += 2;
            }
            if (i%2 == 1) {
                approxPi -= 1/mechane;
                mechane += 2;
            }

        }
        approxPi = approxPi * 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
