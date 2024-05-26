package view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menus {
    public static void Option(){
        System.out.println("=======================================");
        System.out.println("1.Add New Course:");
        System.out.println("2.List Course:");
        System.out.println("3.Find Course By Id:");
        System.out.println("4.Find Course By Title:");
        System.out.println("5.Remove Course By Id:");
        System.out.println("========================================");
    }
}
