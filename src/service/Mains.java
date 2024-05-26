package service;
import exception.Faction;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;
import repository.Courses;
import view.Menus;

import java.util.List;
import java.util.Scanner;

public class Mains extends Faction {
    public static void main(){
        do {
            Menus.Option();
            //System.out.print("[+] Insert Option:");
            Integer op = new Scanner(System.in).nextInt();
            Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER);
            table.addCell("ID",0);
            table.addCell("NAME",0);
            table.addCell("TITLE",0);
            table.addCell("REQUIREMENT",0);
            table.addCell("START DATE",0);
            System.out.println(table.render());
            switch (op){
                case 0->System.exit(0);
                case 1->addcourse();
                case 2->Courses.showTable();
            }
        }while (true);
    }
}
