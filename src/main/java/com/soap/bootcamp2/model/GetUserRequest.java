package com.soap.bootcamp2.model;


import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name"
})
@XmlRootElement(name = "getUserRequest")
public class GetUserRequest {

    @XmlElement(required = true)
    protected String name;
}
