public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Fermin");
        cliente.setEdad(100);
        cliente.setTelefono(14402402);
        cliente.setCredito(400);

        System.out.println("El nombre del cliente es :" + cliente.getNombre());
        System.out.println("La edad del cliente es : "+cliente.getEdad());
        System.out.println("El telefono del cliente es "+ cliente.getTelefono());
        System.out.print("El credito disponible del cliente es : "+ cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Carlos");
        trabajador.setEdad(31);
        trabajador.setTelefono(15451254);
        trabajador.setSalario(4524.12);

        System.out.println("El nombre del trabajador es :" + trabajador.getNombre());
        System.out.println("La edad del trabajador es : "+trabajador.getEdad());
        System.out.println("El telefono del trabajador es "+ trabajador.getTelefono());
        System.out.print("El salario del trabajador es : "+ trabajador.getSalario());
    }

}

class Persona{
    private  String nombre;
    private int edad;
    private int telefono;


    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){ return this.nombre;}

    public void setEdad(int edad) {this.edad=edad;}
    public int getEdad(){return this.edad;}

    public void setTelefono(int telefono){this.telefono=telefono;}
    public int getTelefono(){return this.telefono;}
}

class Cliente extends Persona {
    int credito;
    public void setCredito(int credito){this.credito=credito;}
    public int getCredito(){return this.credito;}
}

 final class Trabajador extends Persona{
        double salario;

        public void setSalario(double salario){this.salario=salario;}
        public double getSalario(){return this.salario;}
        }

