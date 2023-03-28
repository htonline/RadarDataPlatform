package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2023-03-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer userId;

    private String username;

    private String password;

}
