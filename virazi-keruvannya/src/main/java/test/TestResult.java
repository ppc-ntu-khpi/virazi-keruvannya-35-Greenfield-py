package test;

/**
 * class for finding the most repeated number
 * @author Stanislav
 */
public class TestResult {


    public static void main(String[] args) {
        
        /**
         *  created array
         */
        int[] a = new int[]{6,7,4,5,6,5,6,8,0,8,8,1,23,45,7,5,5,5};
        
        /**
         *  for counting repetitions
         */
        int[] a2 = new int[a.length];
        
        /**
         * Calculations
         */
        for (int b = 0; b <= a.length -1; b++){
            for (int c = 0; c <= a.length-1; c++) {
                if (a[b] == a[c])
                    a2[b]++;
            }
        }
       
        int max = 0;
        for (int a3 = 0; a3 <= a.length-1; a3++){
            if (a2[a3] > max)
                max = a2[a3];
        }
        System.out.println("Число, що повторюється найбільшу кількість разів: " + a2[max] + "\n" + "кількість повтореннь: " + max + " разів");
    }
    
}