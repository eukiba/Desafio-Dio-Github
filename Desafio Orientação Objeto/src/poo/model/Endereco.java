package poo.model;
public class Endereco {
   enum TipoEndereco {
	    RESIDENCIAL,
	    ENTREGA,
	    TRABALHO
 }
   public String endere�o;
   public String numero;
   public String complemento;
   public String bairro;
   public String estado;
   public String cep;
}