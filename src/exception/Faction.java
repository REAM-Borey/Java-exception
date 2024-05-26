package exception;
import model.Member;
import java.util.Random;
import java.util.Scanner;

public class Faction {

     public static void addcourse(){
        Member member = new Member();
        System.out.print("[+] Insert title:");
        member.setTitle(new Scanner(System.in).next());
        System.out.print("[+] Insert instructor names:");
        member.setName(new Scanner(System.in).next());
        System.out.print("[+] Insert Course Requirement:");
        member.setRequirement(new Scanner(System.in).next());
    }
    public static int ids(){
        Random random = new Random();
        int numberOfRandomNumbers = 1;
        int upperBound = 10000;
        for (int i = 0; i < numberOfRandomNumbers; i++) {
          random.nextInt(upperBound);
       }
        return random.nextInt(upperBound);
    }

}
