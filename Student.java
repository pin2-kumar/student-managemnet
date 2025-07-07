package com.publicmanegementsystem;

    import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

@Entity

@Table (name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column (name = "firstname", nullable =false,length=45)
    private String firstname ;

    @Column(name = "lastname", nullable = false , length=45)
    private String lastname;

    @Column (name = "emailId", nullable =false, length=255,unique =true)
    private String emailId;

    @Column(name = "Mobile" ,unique= true )
    private String mobile;



    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmailId(String emailId) {
        this. emailId = emailId;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }




}



