package org.example.data.entitry;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDate createdDate;
    @CreatedDate
    @Column(name = "last_updated_date", nullable = false)
    private LocalDate lastUpdatedDate;
}
