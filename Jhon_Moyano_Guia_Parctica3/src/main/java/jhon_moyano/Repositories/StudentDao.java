package jhon_moyano.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import jhon_moyano.Models.Student;
@Repository
public interface StudentDao extends MongoRepository<Student, String>{
	
	Student findByStudentNumber(Long studentNumber);
	Student findByEmail(String email);
	List<Student> findByOrderByGpa();
}
