public class max {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int M = 0;
        int i = 0;
        while(i < m.length){
            if(m[i] > M){
                M = m[i];
            }
            i++;
        }
        return M;
    }

    public static int forMax(int[] m) {
        int M = 0;
        for (int i = 0; i < m.length; i++){
            if(m[i] > M){
                M = m[i];
            }
        }
        return M;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.println(max(numbers));
       System.out.println(forMax(numbers));     
    }
}