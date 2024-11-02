package alatoo.kg.speakkg.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "quizzes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String options;
    @Column(nullable = false)
    private String correctAnswer;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
