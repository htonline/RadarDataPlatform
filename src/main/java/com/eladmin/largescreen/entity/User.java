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

      private String userId;

    private String username;

    private String password;

    
    public String getUserId() {
        return userId;
    }

      public void setUserId(String userId) {
          this.userId = userId;
      }
    
    public String getUsername() {
        return username;
    }

      public void setUsername(String username) {
          this.username = username;
      }
    
    public String getPassword() {
        return password;
    }

      public void setPassword(String password) {
          this.password = password;
      }

    @Override
    public String toString() {
        return "User{" +
              "userId=" + userId +
                  ", username=" + username +
                  ", password=" + password +
              "}";
    }
}
