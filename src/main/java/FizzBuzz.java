public class FizzBuzz {


    public String fizzbuzz(int number) {
        String fbz = "";

        if (number < 0) {
            throw new IllegalArgumentException("Threw an IllegalArgumentException");
        } else if (number == 0) {
            fbz = "0";
        } else {
            String no = Integer.toString(number);
            if (number % 15 == 0) {
                fbz = "fizzbuzz";
            } else if (number % 3 == 0) {
                fbz = "fizz";
            } else if (number % 5 == 0) {
                fbz = "buzz";
            } else {
                fbz = no;
            }
        }

        return fbz;
    }
}
