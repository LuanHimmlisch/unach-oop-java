package io.gtihub.luanhimmlisch;

public class PruebaPerfilMedico {

    public static void main(String[] args) {
        final String NAME = App.input("Insertar Nombre: ");
        final String LASTNAME = App.input("Insertar Apellido: ");
        final String GENDER = App.input("Insertar Genero: ");
        final int BIRTHDAY = Integer.parseInt(App.input("Insertar dia de nacimiento: "));
        final int BIRTH_MONTH = Integer.parseInt(App.input("Insertar mes de nacimiento: "));
        final int BIRTH_YEAR = Integer.parseInt(App.input("Insertar año de nacimiento: "));
        final float HEIGHT = Float.parseFloat(App.input("Insertar altura: "));
        final float WEIGHT = Float.parseFloat(App.input("Insertar peso: "));

        PerfilMedico Paciente = new PerfilMedico()
                .setName(NAME)
                .setLastname(LASTNAME)
                .setGender(GENDER)
                .setBirthDate(BIRTHDAY, BIRTH_MONTH, BIRTH_YEAR)
                .setHeight(HEIGHT)
                .setWeight(WEIGHT);

        Paciente.output();
    }

}
