package kh.edu.istad.homework_data_jpa.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "enrollments")
@Getter
@Setter
@NoArgsConstructor

public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "enrolled_at")
    private LocalDateTime enrolledAt;

    @Column(name = "payment_at")
    private LocalDateTime paymentAt;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_status")
    private Boolean paymentStatus;

    @ManyToOne
    private Course course;

    @ManyToOne
    private StudentProfile student;
}
