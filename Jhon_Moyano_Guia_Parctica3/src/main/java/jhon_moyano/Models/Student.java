package jhon_moyano.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Document(collection = "Student")
public class Student {
	@Id
	private String _id;
	private String nombre;
	private Long studentNumber;
	private String email;
	private List<String> courseList;
	private float gpa;


}
