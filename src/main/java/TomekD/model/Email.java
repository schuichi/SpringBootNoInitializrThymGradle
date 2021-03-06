package TomekD.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Email {


    private int id;


    @Size(min = 4, max = 50, message = "Email musi być od {min} do {max}")
    @NotNull(message = "Email nie może być pusty")
    //  @Pattern(regexp = "asdasdasdas", message = "Hasła się nie zgadzają")
    private String email;

    @NotNull(message = "Wiadomość nie może być pusta")
    @Size(min = 1, message = "Wiadomość musi być dłuższa!")
    private String message;

    public Email() { }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}