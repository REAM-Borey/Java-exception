package repository;

import exception.Faction;
import model.Member;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class Courses extends Faction {
    public static void showTable(){
        Member member = new Member();
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.addCell("ID",0);
        table.addCell("TITLE",0);
        table.addCell("INSTRUCTOR",0);
        table.addCell("REQUIREMENT",0);
        table.addCell("START DATE",0);
    }

}
