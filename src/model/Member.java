package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Member {
    private List<Integer> list;
    private String[] title;
    private String[] name;
    private String[] requirement;

    public void setTitle(String title) {
        this.title = new String[]{title};
    }
    public String[] getTitle() {
        return title;
    }
    public void setName(String name) {
        this.name = new String[]{name};
    }
    public String[] getName() {
        return name;
    }
    public void setRequirement(String requirement) {
        this.requirement = new String[]{requirement};
    }
    public String[] getRequirement() {
        return requirement;
    }
}

