package repository;

import exception.Faction;
import model.Member;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Courses extends Faction {
    public static void showTable(){
        Member member = new Member();
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER);
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDateTime = currentDateTime.format(formatter);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.addCell("ID",0);
        table.addCell("TITLE",0);
        table.addCell("INSTRUCTOR",0);
        table.addCell("REQUIREMENT",0);
        table.addCell("START DATE",0);
        for(int i=0; i<2; i++){
            table.addCell(id()+"",i);
            table.addCell(member.+"",i);
            table.addCell(member.getName()+"",i);
            table.addCell(member.getRequirement()+"",i);
            table.addCell(formattedDateTime,i);
        }
        System.out.println(table.render());
    }

}
