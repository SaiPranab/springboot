package org.jt.fianlsms.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    // @JsonIgnore
    private String id;
    private int roll;
    // @JsonAlias("firstName")
    private String name;
    private String email;
    /*
     * @JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss a")
     * private LocalDateTime createdDate;
     */
}
