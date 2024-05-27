package exception;
import lombok.*;
import model.Member;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Faction{
    private static String title;
    private static String name;
    private static String requirement;
     public static void addcourse(){
        Member member = new Member();
        System.out.print("[+] Insert title:");
        title = new Scanner(System.in).next();
        System.out.print("[+] Insert instructor names:");
        name = new Scanner(System.in).next();
        System.out.print("[+] Insert Course Requirement:");
        requirement = new Scanner(System.in).next();
    }
    public static void ids(){
        Random random = new Random();
        int numberOfRandomNumbers = 1;
        int upperBound = 10000;
        for (int i = 0; i < numberOfRandomNumbers; i++) {
          random.nextInt(upperBound);
       }
    }
    public static Integer id(){
        Random random = new Random();
        int numberOfRandomNumbers = 1;
        int upperBound = 10000;
        for (int i = 0; i < numberOfRandomNumbers; i++) {
            random.nextInt(upperBound);
        }
        return random.nextInt(upperBound);
    }

}
