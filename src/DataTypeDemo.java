
public class DataTypeDemo {
    public static void main(String[] args) {

        byte age = 12;
        short salary = 32767;
        int workId = 32767;
        long population = 1000000000;

        // Floating point number
        float avg = (float) 5.4;
        double avg2 = 53.42;

        // boolean -> ture | false
        boolean isFemale = true;

        // char -> 'a' , 'b' , int , ascii
        char gender = 'M';
        char unicode = '\u0051'; // Q
        char ascii = 97;

        // Wrapper class

        int value = 5; // 0101 -> 5

        System.out.println(Integer.toBinaryString(value));
    }
}
