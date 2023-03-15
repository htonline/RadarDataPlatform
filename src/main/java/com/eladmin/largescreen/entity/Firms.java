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

public class Firms implements Serializable {

    private static final long serialVersionUID = 1L;


        private String orgId;


      private String orgName;


      private String orgType;

    
    public String getOrgId() {
        return orgId;
    }

      public void setOrgId(String orgId) {
          this.orgId = orgId;
      }
    
    public String getOrgName() {
        return orgName;
    }

      public void setOrgName(String orgName) {
          this.orgName = orgName;
      }
    
    public String getOrgType() {
        return orgType;
    }

      public void setOrgType(String orgType) {
          this.orgType = orgType;
      }

    @Override
    public String toString() {
        return "Firms{" +
              "orgId=" + orgId +
                  ", orgName=" + orgName +
                  ", orgType=" + orgType +
              "}";
    }
}
