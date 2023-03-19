package com.eladmin.largescreen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;


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
public class Tunnel implements Serializable {

    private static final long serialVersionUID = 1L;


        @TableId(value = "tunnel_id", type = IdType.AUTO)
      private Integer tunnelId;

      private String detectLocation;

      private String detectLocationLng;


      private String detectLocationLat;

      private String province;

      private String city;

      private String district;

      private String diseaseType;


      private String diseaseDescription;

      private String repairMethod;

//      "该隧道病害的修复状态（1：紧急；2：一般；3：正在修复；4：已修复）"
      private Integer tunnelState;


      private String tunnelStartPointLng;


      private String tunnelStartPointLat;

      private String tunnelStopPointLng;


      private String tunnelStopPointLat;

      private LocalDateTime createTime;

}
