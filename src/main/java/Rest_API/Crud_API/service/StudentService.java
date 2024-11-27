package Rest_API.Crud_API.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Rest_API.Crud_API.Repository.StudentRepository;
import Rest_API.Crud_API.dto.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student getStudentById(Long id) {
		return repository.findById(id).orElse(null);

	}
}
