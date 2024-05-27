package service;
import exception.Faction;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;
import repository.Courses;
import view.Menus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Mains extends Faction {
    public static void main(){
        Integer[] op = new Integer[100];
        Integer i=0;
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE);
        do {
            Menus.Option();
            System.out.print("[+] Insert Option:");
            op[i] = new Scanner(System.in).nextInt();
            i++;
            switch (op[i]){
                case 0->System.exit(0);
                case 1->addcourse();
                case 2->Courses.showTable();
            }
        }while (true);
    }
}
