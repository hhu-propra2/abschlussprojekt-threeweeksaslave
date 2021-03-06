package propra2.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class Message implements Serializable {
    private String message;
    private String author;
    private Date date;
}
