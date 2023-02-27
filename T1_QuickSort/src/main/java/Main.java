public class Main {

    public static void main(String[] args) {
        Integer[] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 }; // No funciona con int[]
        Integer [] result = Utils.ordena (intVector);

        Float [] floatVector = { 19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f }; //No funciona con float[]
        Float [] result_F = Utils.ordena (floatVector);
        System.out.println("Números enteros ordenados:");
        for(Integer i : result){
            System.out.println(i);
        }
        System.out.println("Números float ordenados:");
        for(Float i : result_F){
            System.out.println(i);
        }

    }

}