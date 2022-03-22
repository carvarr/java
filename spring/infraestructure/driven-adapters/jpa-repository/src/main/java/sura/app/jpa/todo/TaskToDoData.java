package sura.app.jpa.todo;

import lombok.Data;
import lombok.NoArgsConstructor;
import sura.app.domain.todo.TaskToDo.TaskReportStatus;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class TaskToDoData {
    @Id
    private String id;
    private String name;
    private String description;
    private Date doneDate;
    private String assignedUserId;
    private TaskReportStatus reportStatus;
    private boolean done;
}
