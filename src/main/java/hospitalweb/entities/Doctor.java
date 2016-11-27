package hospitalweb.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
@DiscriminatorValue(value = "Doctor")
public class Doctor extends User{

    @Column(name="doctor_specialization")
    private String doctorSpecialization;

    public Doctor(){

    }

    public Doctor(String nickName, String name, String password, String egn, String doctorSpecialization) {
        super(nickName, name, password, egn);
        this.doctorSpecialization=doctorSpecialization;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }
}
