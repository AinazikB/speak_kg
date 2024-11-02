package alatoo.kg.speakkg.repositories;

import alatoo.kg.speakkg.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

