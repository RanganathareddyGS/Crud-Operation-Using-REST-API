package Rest_API.Crud_API.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Rest_API.Crud_API.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Optional<Student> findById(Long id);
	//List<Student> findByName(String name);

	List<Student> findByName(String name);
	

}
