package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {

    @Test
    public void deveAbrirConexao() {
        DatabaseConnection.getInstance().abrirConexao();
        Assertions.assertEquals("Conexão aberta", DatabaseConnection.getInstance().getStatusConexao());
    }

    @Test
    public void deveFecharConexao() {
        DatabaseConnection.getInstance().fecharConexao();
        Assertions.assertEquals("Conexão fechada", DatabaseConnection.getInstance().getStatusConexao());
    }

    @Test
    public void deveTransformarNumDados(){
        DatabaseConnection.getInstance().setNumDeDados(10);
        Assertions.assertEquals(10, DatabaseConnection.getInstance().getNumDeDados());
    }
}
