package com.routine.core.domain.routine.entity;

import com.routine.core.common.model.BaseEntity;
import com.routine.core.domain.routine.dto.RoutineDto;
import com.routine.core.domain.routine.type.DayOfWeek;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Routine extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "comment")
    private String comment;

    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

    public static Routine toEntity(RoutineDto.Create request) {
        return Routine.builder()
                .name(request.name())
                .comment(request.comment())
                .dayOfWeek(request.dayOfWeek())
                .build();
    }
}
