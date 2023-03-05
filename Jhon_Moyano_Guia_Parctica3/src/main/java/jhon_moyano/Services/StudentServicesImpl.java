package jhon_moyano.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jhon_moyano.Models.Student;
import jhon_moyano.Repositories.StudentDao;

@Service
public class StudentServicesImpl implements StudentService {

	@Autowired
	private StudentDao studentD;

	@Override
	public List<Student> findAll() {
		return studentD.findAll();
	}

	/*@Override
	public Student findByStudentNumber(Long studentnumber) {
		return studentD.findByStudentNumber(studentnumber);
	}*/
	@Override
	public Student findByStudentNumber(Long studentNumber) {
		return studentD.findByStudentNumber(studentNumber);
	}

	@Override
	public Student findByEmail(String email) {
		return studentD.findByEmail(email);
	}

	@Override
	public List<Student> findByOrderByGpa() {
		return studentD.findByOrderByGpa();
	}

	@Override
	public void save_or_update_Student(Student student) {
		studentD.save(student);
	}

	@Override
	public void delete(String id) {

		studentD.deleteById(id);
	}

}
