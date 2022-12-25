package org.example;

import lombok.Data;
import lombok.ToString;

@Data
public class Lecturer extends ResearchAssociate {

    @Override
    public String toString() {
        return "Lecturer{" +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", ssNo=" + ssNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", counter=" + counter +
                '}';
    }
}