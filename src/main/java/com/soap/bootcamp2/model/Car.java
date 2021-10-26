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
@XmlType(name = "car", propOrder = {
        "brand",
        "plateNumber",
        "price"
})
public class Car {

    @XmlElement(required = true)
    protected String brand;
    protected int plateNumber;
    protected double price;
}
