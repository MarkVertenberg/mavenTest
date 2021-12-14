public class simpleProgram {

    public static void main(String[] args) {

        int[] positiveNumbers = {12, 45, 1, 5, 89};
        System.out.println(minimum(positiveNumbers));

    }

    public static int minimum(int[] arr){
        if(arr.length == 0) return -1;
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
}
