package jhon_moyano.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jhon_moyano.Models.Student;
import jhon_moyano.Services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentS;

	@GetMapping(value = "/")
	public List<Student> getAllStudent() {
		return studentS.findAll();
	}

	@GetMapping("/{studentNumber}")
	public Student getStudentByStudentNumber(@PathVariable("studentNumber") Long studentNumber) {
		return studentS.findByStudentNumber(studentNumber);
	}

	@GetMapping(value = "/email/{email}")
	public Student getEmail(@PathVariable("correo") String correo) {
		return studentS.findByEmail(correo);
	}

	@GetMapping(value = "/orderByGpa")
	public List<Student> findAllByOrderByGpaDesc() {
		return studentS.findByOrderByGpa();
	}

	@PostMapping(value = "/")
	public ResponseEntity<?> Save_or_Update_Student(@RequestBody Student student) {
		studentS.save_or_update_Student(student);
		return new ResponseEntity("Estudiante agregado con exito", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{studentNumber}")
	public void deleteStudent(@PathVariable Long studentNumber) {
		studentS.delete(studentS.findByStudentNumber(studentNumber).get_id());
	}

}
