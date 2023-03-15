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
 * @since 2023-03-14
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileDAO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pictureId;

    private String name;


    private String type;


    private Double size;


    private String url;

    private Integer pieceId;

}
