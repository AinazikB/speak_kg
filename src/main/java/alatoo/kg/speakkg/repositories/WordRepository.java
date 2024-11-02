package alatoo.kg.speakkg.repositories;

import alatoo.kg.speakkg.entities.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}

