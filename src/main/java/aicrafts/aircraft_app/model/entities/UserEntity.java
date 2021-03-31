package aicrafts.aircraft_app.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

@Entity
@Table(name = "user")
public class UserEntity {
    @Min(5)
    private String username;
    @Column(nullable = false)
    private String password;
    @Email
    private String email;
   // private Long id;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserEntity(@Min(5) String username, String password, @Email String email) {
        this.username = username;
        this.password = password;
    }
}
