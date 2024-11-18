package com.lokesh.compose.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    Long id;
    String name;
}
