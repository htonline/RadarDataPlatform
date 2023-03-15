package com.eladmin.largescreen.entity;

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
 * @since 2023-02-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Piece implements Serializable {

    private static final long serialVersionUID = 1L;


        private Integer pieceId;


      private Integer reportId;


      private Integer serialNum;


      private String detectMileageName;


      private Integer detectMileageNum;


      private String detectPart;


      private String detectProvince;


      private String detectPositionLng;


      private String detectPositionLat;


      private String startPointLng;


      private String startPointLat;


      private String stopPointLng;


      private String stopPointLat;


      private Double startDistance;


      private Double stopDistance;


      private String disease;


      private String diseaseDescription;


      private String detectPersonName;


      private String detectPersonPhone;


      private String dataPackAddress;


      private String dataSources;


      private LocalDateTime createTime;


      private String tip;


      private String reservationField;

}
