package reserva_cliente_mesa_1_6;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void mostrarReserva(){
        System.out.println("Reserva para el cliente " + cliente.getNombre()+ 
                    ", el dia " + fecha + " a la hora " + hora + ", para "+ 
                    mesa.getCapacidad() + " personas");
    }
}
