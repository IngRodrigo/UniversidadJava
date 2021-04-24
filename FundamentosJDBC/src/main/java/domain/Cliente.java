
package domain;


public class Cliente {
    private int id, idCiudad, idPais, idTipoDocumento, idUser;
    private String documento, razonSocial, nombre, apelldo, direccion, telefono, felefonoMovil, createAt, updateAt, ipServidor;

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(int idCiudad, int idPais, int idTipoDocumento, int idUser, String documento, String razonSocial, String nombre, String apelldo, String direccion, String telefono, String felefonoMovil, String createAt, String updateAt, String ipServidor) {
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.idTipoDocumento = idTipoDocumento;
        this.idUser = idUser;
        this.documento = documento;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.apelldo = apelldo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.felefonoMovil = felefonoMovil;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.ipServidor = ipServidor;
    }

    public Cliente(int id, int idCiudad, int idPais, int idTipoDocumento, int idUser, String documento, String razonSocial, String nombre, String apelldo, String direccion, String telefono, String felefonoMovil, String createAt, String updateAt, String ipServidor) {
        this.id = id;
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.idTipoDocumento = idTipoDocumento;
        this.idUser = idUser;
        this.documento = documento;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.apelldo = apelldo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.felefonoMovil = felefonoMovil;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.ipServidor = ipServidor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldo() {
        return apelldo;
    }

    public void setApelldo(String apelldo) {
        this.apelldo = apelldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFelefonoMovil() {
        return felefonoMovil;
    }

    public void setFelefonoMovil(String felefonoMovil) {
        this.felefonoMovil = felefonoMovil;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", idCiudad=" + idCiudad + ", idPais=" + idPais + ", idTipoDocumento=" + idTipoDocumento + ", idUser=" + idUser + ", documento=" + documento + ", razonSocial=" + razonSocial + ", nombre=" + nombre + ", apelldo=" + apelldo + ", direccion=" + direccion + ", telefono=" + telefono + ", felefonoMovil=" + felefonoMovil + ", createAt=" + createAt + ", updateAt=" + updateAt + ", ipServidor=" + ipServidor + '}';
    }
    
    
}
