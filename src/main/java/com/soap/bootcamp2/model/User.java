package com.soap.bootcamp2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
        "name",
        "empId",
        "salary"
})
public class User {

    @XmlElement(required = true)
    protected String name;
    protected int empId;
    protected double salary;
}
