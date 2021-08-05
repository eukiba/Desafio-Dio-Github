package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
	
	public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //  dados do endere�o
        Cliente cliente = new Cliente();
        //  dados do cliente
        try {
        	cliente.adicionaEndereco(endereco);
            System.out.println("Endere�o adicionado com sucesso !");
        } catch (Exception e) {
        	System.err.println(" hove um erro ao adicionar endere�o:" + e.getMessage());
        }
    }
}