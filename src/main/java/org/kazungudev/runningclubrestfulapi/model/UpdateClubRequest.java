package com.runclub.restful.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateClubRequest {

    @JsonIgnore
    @NotBlank
    private String clubId;
        
    private String title;

    private String photoUrl;

    private String content;

}
