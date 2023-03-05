package jhon_moyano.Services;

import java.util.List;

import jhon_moyano.Models.Student;

public interface StudentService {

	List<Student> findAll();

	Student findByStudentNumber(Long studentNumber);

	//Student findByEmail(String correo);
	Student findByEmail(String email);


	List<Student> findByOrderByGpa();

	public void save_or_update_Student(Student student);

	public void delete(String id);
}
