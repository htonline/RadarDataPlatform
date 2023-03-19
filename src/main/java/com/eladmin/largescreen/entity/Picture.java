package com.eladmin.largescreen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2023-03-16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "picture_id", type = IdType.AUTO)
      private Integer pictureId;

      private String url;

      private Integer tunnelId;

}
