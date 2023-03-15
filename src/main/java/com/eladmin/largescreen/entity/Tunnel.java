package com.eladmin.largescreen.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2022-11-21
 */

public class Tunnel implements Serializable {

    private static final long serialVersionUID = 1L;


        private String reportId;


      private String type;


      private String projName;


      private String tunnelContent;


      private String tunnelMethod;


      private String lineName;


      private Integer projectSerialNum;


      private String orgContructName;


      private String orgSuperviseName;


      private String contructBlocks;


      private String orgContructPrincipal;


      private String orgContructPrincipalPhone;


      private String orgDetect;


      private String orgDetectPrincipal;


      private String orgDetectPrincipalPhone;


      private LocalDateTime createDate;


      private String sceneContact;


      private String sceneContactPhone;


      private String tip;


      private String reservationField;

    
    public String getReportId() {
        return reportId;
    }

      public void setReportId(String reportId) {
          this.reportId = reportId;
      }
    
    public String getType() {
        return type;
    }

      public void setType(String type) {
          this.type = type;
      }
    
    public String getProjName() {
        return projName;
    }

      public void setProjName(String projName) {
          this.projName = projName;
      }
    
    public String getTunnelContent() {
        return tunnelContent;
    }

      public void setTunnelContent(String tunnelContent) {
          this.tunnelContent = tunnelContent;
      }
    
    public String getTunnelMethod() {
        return tunnelMethod;
    }

      public void setTunnelMethod(String tunnelMethod) {
          this.tunnelMethod = tunnelMethod;
      }
    
    public String getLineName() {
        return lineName;
    }

      public void setLineName(String lineName) {
          this.lineName = lineName;
      }
    
    public Integer getProjectSerialNum() {
        return projectSerialNum;
    }

      public void setProjectSerialNum(Integer projectSerialNum) {
          this.projectSerialNum = projectSerialNum;
      }
    
    public String getOrgContructName() {
        return orgContructName;
    }

      public void setOrgContructName(String orgContructName) {
          this.orgContructName = orgContructName;
      }
    
    public String getOrgSuperviseName() {
        return orgSuperviseName;
    }

      public void setOrgSuperviseName(String orgSuperviseName) {
          this.orgSuperviseName = orgSuperviseName;
      }
    
    public String getContructBlocks() {
        return contructBlocks;
    }

      public void setContructBlocks(String contructBlocks) {
          this.contructBlocks = contructBlocks;
      }
    
    public String getOrgContructPrincipal() {
        return orgContructPrincipal;
    }

      public void setOrgContructPrincipal(String orgContructPrincipal) {
          this.orgContructPrincipal = orgContructPrincipal;
      }
    
    public String getOrgContructPrincipalPhone() {
        return orgContructPrincipalPhone;
    }

      public void setOrgContructPrincipalPhone(String orgContructPrincipalPhone) {
          this.orgContructPrincipalPhone = orgContructPrincipalPhone;
      }
    
    public String getOrgDetect() {
        return orgDetect;
    }

      public void setOrgDetect(String orgDetect) {
          this.orgDetect = orgDetect;
      }
    
    public String getOrgDetectPrincipal() {
        return orgDetectPrincipal;
    }

      public void setOrgDetectPrincipal(String orgDetectPrincipal) {
          this.orgDetectPrincipal = orgDetectPrincipal;
      }
    
    public String getOrgDetectPrincipalPhone() {
        return orgDetectPrincipalPhone;
    }

      public void setOrgDetectPrincipalPhone(String orgDetectPrincipalPhone) {
          this.orgDetectPrincipalPhone = orgDetectPrincipalPhone;
      }
    
    public LocalDateTime getCreateDate() {
        return createDate;
    }

      public void setCreateDate(LocalDateTime createDate) {
          this.createDate = createDate;
      }
    
    public String getSceneContact() {
        return sceneContact;
    }

      public void setSceneContact(String sceneContact) {
          this.sceneContact = sceneContact;
      }
    
    public String getSceneContactPhone() {
        return sceneContactPhone;
    }

      public void setSceneContactPhone(String sceneContactPhone) {
          this.sceneContactPhone = sceneContactPhone;
      }
    
    public String getTip() {
        return tip;
    }

      public void setTip(String tip) {
          this.tip = tip;
      }
    
    public String getReservationField() {
        return reservationField;
    }

      public void setReservationField(String reservationField) {
          this.reservationField = reservationField;
      }

    @Override
    public String toString() {
        return "Tunnel{" +
              "reportId=" + reportId +
                  ", type=" + type +
                  ", projName=" + projName +
                  ", tunnelContent=" + tunnelContent +
                  ", tunnelMethod=" + tunnelMethod +
                  ", lineName=" + lineName +
                  ", projectSerialNum=" + projectSerialNum +
                  ", orgContructName=" + orgContructName +
                  ", orgSuperviseName=" + orgSuperviseName +
                  ", contructBlocks=" + contructBlocks +
                  ", orgContructPrincipal=" + orgContructPrincipal +
                  ", orgContructPrincipalPhone=" + orgContructPrincipalPhone +
                  ", orgDetect=" + orgDetect +
                  ", orgDetectPrincipal=" + orgDetectPrincipal +
                  ", orgDetectPrincipalPhone=" + orgDetectPrincipalPhone +
                  ", createDate=" + createDate +
                  ", sceneContact=" + sceneContact +
                  ", sceneContactPhone=" + sceneContactPhone +
                  ", tip=" + tip +
                  ", reservationField=" + reservationField +
              "}";
    }
}
