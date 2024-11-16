package com.web.primefacesexampletest.database;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request {

    Long id;

    @NonNull
    Float x;

    @NonNull
    Float y;

    @NonNull
    Float r;

    @NonNull
    Boolean hit;

    @Builder.Default
    @NonNull
    Timestamp startTime = Timestamp.valueOf(LocalDateTime.now());

    @NonNull
    Timestamp endTime;

}
