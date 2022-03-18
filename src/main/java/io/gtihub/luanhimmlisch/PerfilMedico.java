package io.gtihub.luanhimmlisch;

/**
 * Programa para dar info de un paciente utilizando el patrón Builder
 * <p>
 * 23/02/2022 01:30
 * </p>
 * 
 * @author Luis Ángel Serrano Catalá
 * @see https://github.com/LuanHimmlisch/unach-oop-java
 */
public class PerfilMedico {

    private String name;
    private String lastname;
    private int birthday;
    private String gender;
    private int birthMonth;
    private int birthYear;
    private float height;
    private float weight;

    public PerfilMedico() {
    }

    public String getName() {
        return name;
    }

    public PerfilMedico setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public PerfilMedico setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public PerfilMedico setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public int getBirthday() {
        return birthday;
    }

    public PerfilMedico setBirthday(int birthday) {
        this.birthday = birthday;
        return this;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public PerfilMedico setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public PerfilMedico setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public PerfilMedico setBirthDate(int birthday, int birthMonth, int birthYear) {
        return this.setBirthday(birthday)
                .setBirthMonth(birthMonth)
                .setBirthYear(birthYear);
    }

    public float getHeight() {
        return height;
    }

    public PerfilMedico setHeight(float height) {
        this.height = height;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public PerfilMedico setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public void output() {
        App.print("Nombre: " + name + "\n");
        App.print("Apellidos: " + lastname + "\n");
        App.print("Edad: " + this.age() + "\n");
        App.print("Genero: " + gender + "\n");
        App.print("Altura: " + height + "\n");
        App.print("Peso: " + weight + "\n");
        App.print("BMI: " + this.BMI() + "\n");
        App.print("Frecuencia Cardiaca Máxima: " + this.FrecuenciaCardiacaMaxima() + "\n");
        App.print("Frecuencia Cardiaca Esperada: " + this.FrecuenciaCardicaEsperada() + "\n");
    }

    public int age() {
        return 2022 - this.birthYear;
    }

    public float BMI() {
        return this.weight / (this.height * this.height);
    }

    public int FrecuenciaCardiacaMaxima() {
        return 220 - this.age();
    }

    public String FrecuenciaCardicaEsperada() {
        float RangoMinimo = this.FrecuenciaCardiacaMaxima() * 0.5f;
        float RangoMaximo = this.FrecuenciaCardiacaMaxima() * 0.85f;
        return RangoMinimo + "/" + RangoMaximo;
    }
}