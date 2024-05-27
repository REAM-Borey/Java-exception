package model;
import lombok.*;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Member {
    private String[] title;
    private String[] name;
    private String[] requirement;
}

