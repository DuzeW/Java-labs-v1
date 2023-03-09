public class DodawanieTab{

    public static int[] sumArrays() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        if (arr1.length != arr2.length) {
            System.out.println("Inne dlugosci");
            return new int[0];
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
            System.out.println(result[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        sumArrays();
    }

}
