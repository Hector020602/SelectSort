public class SelectSort {
    public static void main(String[] args) {
        int[] array = {3,2,1,4,9,6,8,7,5,3,4};
        int dancing;


        for (int i = 0; i < array.length;i++){
            dancing = array[i];
            for(int j = i + 1; j < array.length;j++){
                if (array[j] < dancing) {
                    int temp = array[j];
                    array[j] = dancing;
                    dancing = temp;

             }
            }
            array[i] = dancing;
        }
        for (int i = 0; i < array.length;i++) {
            System.out.print(array[i] +  " ");
        }



    }
}
