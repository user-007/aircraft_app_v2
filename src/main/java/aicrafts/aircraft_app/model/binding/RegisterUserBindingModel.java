package aicrafts.aircraft_app.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class RegisterUserBindingModel {
    @NotEmpty
    @Size(min = 3)
    private String username;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 5, max = 20)
    private String password;
    @NotEmpty
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public RegisterUserBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RegisterUserBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterUserBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public RegisterUserBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
