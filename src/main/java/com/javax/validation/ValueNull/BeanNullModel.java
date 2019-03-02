package com.javax.validation.ValueNull;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class BeanNullModel implements Serializable {

    @NotNull
    private String name;




}
