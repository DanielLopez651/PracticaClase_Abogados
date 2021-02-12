package ups.edu.ec.modelo;


public class Expediente {
String fechadeinicio;    
String fechadefinalisacion;
String estado;
String cedulacliente;
String cedulaabogado;
int id;

    public Expediente(String fechadeinicio, String fechadefinalisacion, String estado, String cedulacliente, String cedulaabogado, int id) {
        this.fechadeinicio = fechadeinicio;
        this.fechadefinalisacion = fechadefinalisacion;
        this.estado = estado;
        this.cedulacliente = cedulacliente;
        this.cedulaabogado = cedulaabogado;
        this.id = id;
    }

   
    public Expediente() {
    }

    public String getCedulaabogado() {
        return cedulaabogado;
    }

    public void setCedulaabogado(String cedulaabogado) {
        this.cedulaabogado = cedulaabogado;
    }

    public String getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(String fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public String getFechadefinalisacion() {
        return fechadefinalisacion;
    }

    public void setFechadefinalisacion(String fechadefinalisacion) {
        this.fechadefinalisacion = fechadefinalisacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Expediente other = (Expediente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Expediente{" + "fechadeinicio=" + fechadeinicio + ", fechadefinalisacion=" + fechadefinalisacion + ", estado=" + estado + ", cedulacliente=" + cedulacliente + ", cedulaabogado=" + cedulaabogado + ", id=" + id + '}'+"\n";
    }

    


}
