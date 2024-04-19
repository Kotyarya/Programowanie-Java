public class Main {
    public static void main(String[] args) {
        //int[] array = {10,9,8,7,6,5,4,3,2,1};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};


        int count = 0;
        boolean toSort =  true;
        for (int j = 0; j < array2.length - 1 && toSort; j++) {

            toSort = false;
            count++;


            for (int i = 0; i < array2.length - j - 1; i++) {



                count++;
                if (array2[i] > array2[i + 1]) {
                    int x = array2[i];
                    int y = array2[i + 1];
                    count++;
                    array2[i] = y;
                    array2[i + 1] = x;
                    toSort = true;
                }

            }
        }



        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }

        System.out.println("Count : " + count);
    }
}