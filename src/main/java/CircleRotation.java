public class CircleRotation {
    public static void main(String... args){
        CircleRotation circle = new CircleRotation();
        int[] A = {3, 8, 9, 7, 6};
        circle.solution(A, 3);
    }

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int arrayLength = A.length;
        if (arrayLength == 0 )
            return A;
        int rotate = K % A.length;
        if (rotate == 0)
            return A;

        int[] rotateArray = new int[arrayLength];
        int index = 0;
        for (int i= arrayLength - rotate;i<arrayLength; i++){
            rotateArray[index++] = A[i];
        }
        for (int i= 0;i<arrayLength - rotate; i++){
            rotateArray[index++] = A[i];
        }
        return rotateArray;
    }
}
