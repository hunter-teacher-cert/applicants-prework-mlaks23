public class Time {

  public static void main(String[] args) {

    int hour = 22;
    int minute = 11;
    int second = 45;
    int beginTime = 21 * 60 * 60 + 32 * 60 + 45;
    //int sinceMidnight = hour * 60 * 60 + minute * 60 + second;

//I started writng the program at 21:32:45.

    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.print(":");
    System.out.print(second);
    System.out.println(".");

    System.out.print("Time elapsed since I began working on this program: ");
    System.out.print(hour * 60 * 60 + minute * 60 + 45 - beginTime);
    System.out.println(" seconds ");


    //System.out.print("Number of seconds since midnight: ");
    //System.out.println(sinceMidnight);

    //System.out.print("Number of seconds remaining in day: ");
    //System.out.println(86400 - sinceMidnight);

    //System.out.print("Percentage of day that has passed: ");
    //System.out.println(sinceMidnight * 100 / 86400);
  }
}
