package com.eladmin.largescreen.entity;

import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2022-11-21
 */
public class Devices implements Serializable {

    private static final long serialVersionUID = 1L;

        private Integer deviceId;


      private String deviceType;


      private String deviceLabel;


      private String deviceModel;


      private String tip;


      private String pieceId;

    
    public Integer getDeviceId() {
        return deviceId;
    }

      public void setDeviceId(Integer deviceId) {
          this.deviceId = deviceId;
      }
    
    public String getDeviceType() {
        return deviceType;
    }

      public void setDeviceType(String deviceType) {
          this.deviceType = deviceType;
      }
    
    public String getDeviceLabel() {
        return deviceLabel;
    }

      public void setDeviceLabel(String deviceLabel) {
          this.deviceLabel = deviceLabel;
      }
    
    public String getDeviceModel() {
        return deviceModel;
    }

      public void setDeviceModel(String deviceModel) {
          this.deviceModel = deviceModel;
      }
    
    public String getTip() {
        return tip;
    }

      public void setTip(String tip) {
          this.tip = tip;
      }
    
    public String getPieceId() {
        return pieceId;
    }

      public void setPieceId(String pieceId) {
          this.pieceId = pieceId;
      }

    @Override
    public String toString() {
        return "Devices{" +
              "deviceId=" + deviceId +
                  ", deviceType=" + deviceType +
                  ", deviceLabel=" + deviceLabel +
                  ", deviceModel=" + deviceModel +
                  ", tip=" + tip +
                  ", pieceId=" + pieceId +
              "}";
    }
}
