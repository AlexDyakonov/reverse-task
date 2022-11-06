import java.util.*;

public class Reverse {

    public static List<String> input() {
        Scanner input = new Scanner(System.in);
        List<String> output = new ArrayList<>();
        String temp;

        while(!((temp = input.nextLine()).equals("q"))){
            output.add(temp);
        }
        return output;
    }


    public static List<int[]> convertStringToInt(List<String> input) {
        List<int[]> output = new ArrayList<>();

        for (int i = 0; i < input.size(); i++){
            String[] arrayOfString = input.get(i).trim().split("\\s+");
            int[] arrayOfInt = new int[arrayOfString.length];
            int[] arrayOfIntEmpty = new int[0];

            try {
                for (int j = 0; j < arrayOfInt.length; j++){
                    arrayOfInt[j] = Integer.parseInt(arrayOfString[j]);
                }
                output.add(arrayOfInt);
            } catch (NumberFormatException e){
                output.add(arrayOfIntEmpty);
            }

        }
        return output;
    }

    public static List<int[]> reverse(List<int[]> input) {
        List<int[]> output = new ArrayList<>();

        for (int i = 0; i < input.size(); i++){
            int[] reverseInput = new int[input.get(i).length];
            for (int j = 0; j < input.get(i).length; j++){
                reverseInput[input.get(i).length - j - 1] = input.get(i)[j];
            }
            output.add(reverseInput);
        }
        Collections.reverse(output);
        return output;
    }

    public static void print(List<int[]> input) {
        for (int i = 0; i < input.size(); i++){
            for (int j = 0; j < input.get(i).length; j++){
                System.out.print(input.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
}
