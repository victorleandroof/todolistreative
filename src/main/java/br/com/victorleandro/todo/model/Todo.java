package br.com.victorleandro.todo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("todo")
public class Todo implements Serializable {

    @Id
    @Field("id")
    @JsonProperty("id")
    private String id;
    @Field("title")
    @JsonProperty("title")
    @NotBlank
    @Size(max = 100,min = 8)
    private String title;
    @Field("description")
    @JsonProperty("description")
    @NotBlank
    @Size(max = 255,min = 8)
    private String description;
    @Field("deadline")
    @JsonProperty("deadline")
    private LocalDate deadline;
    @Field("startDate")
    @JsonProperty("start_date")
    private LocalDateTime startDate;
    @Field("statu")
    @JsonProperty("status")
    private String status;
    @CreatedDate
    @Builder.Default
    @JsonProperty("create_date")
    private LocalDateTime createdDate = LocalDateTime.now();

}
