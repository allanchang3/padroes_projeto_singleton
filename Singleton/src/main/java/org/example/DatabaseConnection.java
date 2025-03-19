package org.example;

public class DatabaseConnection {
    private static DatabaseConnection instance = new DatabaseConnection();
    private String statusConexao;
    private int numDeDados = 0;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {return instance;}

    public String getStatusConexao() {return this.statusConexao;}

    public void fecharConexao() {this.statusConexao = "Conexão fechada";}

    public void abrirConexao() {this.statusConexao = "Conexão aberta";}

    public void setNumDeDados(int numDados) {this.numDeDados = numDados;}

    public int getNumDeDados() {return this.numDeDados;}


}
