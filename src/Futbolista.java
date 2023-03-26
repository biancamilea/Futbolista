import java.util.Comparator;
import java.util.Objects;

public class Futbolista implements Comparable <Futbolista> {
    String dni;
    String nombre;
    int edad;
    int ngoles;

    public Futbolista(String dni, String nombre, int edad, int ngoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.ngoles = ngoles;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNgoles() {
        return ngoles;
    }

    public void setNgoles(int ngoles) {
        this.ngoles = ngoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ngoles=" + ngoles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Futbolista o) {
        return this.dni.compareTo(o.getDni());
    }

    public static Comparator<Futbolista> comparadorPorEdad = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return f1.edad - f2.edad;
        }
    };

    public static Comparator<Futbolista> comparadorPorNombre = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return f1.nombre.compareTo(f2.nombre);
        }
    };

    public static Comparator<Futbolista> comparadorPorEdadAndNombre = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            if (f1.edad == f2.edad) {
                return f1.nombre.compareTo(f2.nombre);
            }
            return f1.edad - f2.edad;
        }
    };
}
