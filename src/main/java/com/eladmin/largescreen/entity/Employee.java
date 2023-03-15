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

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;


        private Integer id;


      private String name;


      private String sex;


      private String phone;


      private String email;


      private String resignation;


      private String staffOrg;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getSex() {
        return sex;
    }

      public void setSex(String sex) {
          this.sex = sex;
      }
    
    public String getPhone() {
        return phone;
    }

      public void setPhone(String phone) {
          this.phone = phone;
      }
    
    public String getEmail() {
        return email;
    }

      public void setEmail(String email) {
          this.email = email;
      }
    
    public String getResignation() {
        return resignation;
    }

      public void setResignation(String resignation) {
          this.resignation = resignation;
      }
    
    public String getStaffOrg() {
        return staffOrg;
    }

      public void setStaffOrg(String staffOrg) {
          this.staffOrg = staffOrg;
      }

    @Override
    public String toString() {
        return "Employee{" +
              "id=" + id +
                  ", name=" + name +
                  ", sex=" + sex +
                  ", phone=" + phone +
                  ", email=" + email +
                  ", resignation=" + resignation +
                  ", staffOrg=" + staffOrg +
              "}";
    }
}
