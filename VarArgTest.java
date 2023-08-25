public class VarArgTest {

    private static double num = 0.0;
    //average method
    public static double average(double... numbers){
        

        for(double d : numbers)
            num+= d;

            return num/numbers.length;
        
    }
        // sum method
    public static double sum(double... numbers){
        double sum = 0.0;
        for(double d: numbers)
            sum = sum+d;

            return sum;
    }

    // maximum method

    public static double max(double... numbers){
        double max = 0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        return max;
    }
        // minimum method
    public static double min(double... numbers){
        double min = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }

        return min;
    } 
        //  main method
    public static void main(String[] args) {
        // assign the values for d1,d2,d3,d4,.....dn by using the command Line
        double d1 = Double.parseDouble(args[0]); // 10
        double d2 = Double.parseDouble(args[1]); // 20
        double d3 = Double.parseDouble(args[2]); // 30
        double d4 = Double.parseDouble(args[3]); // 40

        System.out.println("d1 = "+d1+ " d2 = "+d2 +" d3 = "+d3 +" d4 = "+d4);

        System.out.println("Average of d1 and d2 is: "+average(d1,d2));
        System.out.println("Average of d1,d2 and d3 is: "+average(d1,d2,d3));
        System.out.println("Average of d1,d2,d3 and d4 is: "+average(d1,d2,d3,d4));

        System.out.println("Sum of d1 and d2 is: "+sum(d1,d2));
        System.out.println("Max of d1,d2,d3 and d4 is: "+max(d1,d2,d3,d4));
        System.out.println("Min of d1,d2,d3,d4 is: "+min(d1,d2,d3,d4));

    }
}