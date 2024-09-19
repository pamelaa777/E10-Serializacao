package Cliente;

import java.io.*;
import java.util.*;

public abstract class Cliente implements Serializable{

    private static final long serialVersionUID = 1L;

    protected String nome;
    protected String endereco;
    protected Date data;

    Cliente(String nome, String endereco, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }

    abstract boolean autenticar(String key);

    //Encapsulation
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public Date getData() {return data;}

}
