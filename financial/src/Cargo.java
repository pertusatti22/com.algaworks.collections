import java.math.BigDecimal;

/**
 * The type Cargo.
 */
public class Cargo {

    private String descricao;
    private BigDecimal salario;

    /**
     * Gets descricao.
     *
     * @return the descricao
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Sets descricao.
     *
     * @param descricao the descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Gets salario.
     *
     * @return the salario
     */
    public BigDecimal getSalario() {
        return this.salario;
    }

    /**
     * Sets salario.
     *
     * @param salario the salario
     */
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

}
