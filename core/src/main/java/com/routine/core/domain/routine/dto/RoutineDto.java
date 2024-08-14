package com.routine.core.domain.routine.dto;

import com.routine.core.domain.routine.entity.Routine;
import com.routine.core.domain.routine.type.DayOfWeek;

public class RoutineDto {

    public record Create(
            String name,
            String comment,
            DayOfWeek dayOfWeek
    ) { }

    public record Response(
            Long id,
            String name,
            String comment
    ) {
        public static Response of(Routine routine) {
            return new Response(routine.getId(), routine.getName(), routine.getComment());
        }
    }
}
