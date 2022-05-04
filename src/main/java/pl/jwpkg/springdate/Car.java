package pl.jwpkg.springdate;

import javax.persistence.*;

@Entity
    @Table (name="MyCar")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marka;
    @Transient
    private String model;
    @Enumerated(EnumType.STRING)
    private Color kolor;

    public Car() {
    }

    public Car(String marka, String model, Color kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getKolor() {
        return kolor;
    }

    public void setKolor(Color kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor=" + kolor +
                '}';
    }

}
