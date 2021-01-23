import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws InterruptedException {
    //Possible chord options. (Just the ones that I know)
    String[] chords = {"C", "G", "A", "A minor", "E", "E minor", "D"};

    int randomChord;
    int randomWait;

    Scanner scan = new Scanner(System.in);

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nWelcome to guitar training.\nSimply strum along to the chord on screen\nand try to change chords when the next chord comes on screen.\nTo begin, press enter.");
    //Countdown
    String continueLesson = scan.nextLine();
    System.out.println("Starting up...");
    Thread.sleep(500);
    System.out.println("Get Ready!");
    Thread.sleep(1000);
    System.out.println("3");
    Thread.sleep(1000);
    System.out.println("2");
    Thread.sleep(1000);
    System.out.println("1\n");
    Thread.sleep(1000);

    //Start randomly giving chords now.
    while(1==1)
    {
      randomWait = (int)(Math.random() * 4000) + 4500;
      randomChord = (int)(Math.random() * chords.length);
      System.out.println(chords[randomChord]);
      Thread.sleep(randomWait);
    }
  }
}