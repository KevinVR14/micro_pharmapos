package uisrael.com.ms_inventario_factura.entity;


import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import uisrael.com.ms_inventario_factura.model.Agencia;
import uisrael.com.ms_inventario_factura.model.Cliente;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "cabecera_pedido")
public class CabeceraPedido {
    @Id
    private String idCabeceraPedido;
    private Long idAgencia;
    private Long idCliente;
    private Date fechaEmision;
    private String numeroPedido;
    private double total;
    private String imagen;
    private String estado = "C";

    @Transient
    private List<DetallePedido> detallesPedidos;
    @Transient
    private Cliente cliente = new Cliente();
    @Transient
    private Agencia agencia = new Agencia();
}
