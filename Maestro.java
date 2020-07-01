 public class Maestro {

  private String codigo;

  private String nombre;

  double tarifa;

  int horas;

  double sueldo;

       

  public Maestro () {

  }



  public void registrar(String codigo, String nombre, double tarifa, int horas, double sueldo) {

    this.codigo = codigo;

    this.nombre = nombre;

    this.tarifa = tarifa;

    this.horas = horas;

    this.sueldo = sueldo;

     

   

  }



  public String getCodigo() {

    return codigo;

  }



  public void setCodigo(String codigo) {

    this.codigo = codigo;

  }



  public String getNombre() {

    return nombre;

  }



  public void setNombre(String nombre) {

    this.nombre = nombre;

  }



  public double getTarifa() {

    return tarifa;

  }



  public void setTarifa(double tarifa) {

    this.tarifa = tarifa;

  }



  public int getHoras() {

    return horas;

  }



  public void setHoras(int horas) {

    this.horas = horas;

  }

   

   public double getSueldo() {

    return sueldo;

  }



  public void setSueldo(double sueldo) {

    this.sueldo = sueldo ;

  }

   

  public double hallarSueldo (){

    return sueldo=(tarifa * horas);

   }

  public void mostrar(){

    System.out.println("sueldo: "+hallarSueldo());

  }

  public void mostrarDatos(){

    System.out.println("\nCodigo = "+codigo);

    System.out.println("Nombre = "+nombre);

    System.out.println("Nota 1 = "+tarifa);

    System.out.println("Nota 2 = "+horas);

    System.out.println("Nota 2 = "+sueldo);

    System.out.println("Promedio = "+hallarSueldo());

  }

}