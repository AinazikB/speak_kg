package alatoo.kg.speakkg.repositories;

import alatoo.kg.speakkg.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
