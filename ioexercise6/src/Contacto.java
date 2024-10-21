public class Contacto {
    private String nombre;
    private String email;
    private String telefono;

    public Contacto(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Email: " + email + ", Teléfono: " + telefono;
    }

    // Método para obtener el contacto en formato CSV
    public String toCSV() {
        return nombre + "," + email + "," + telefono;
    }

    // Método para crear un contacto desde una línea CSV
    public static Contacto fromCSV(String line) {
        String[] parts = line.split(",");
        return new Contacto(parts[0], parts[1], parts[2]);
    }
}
