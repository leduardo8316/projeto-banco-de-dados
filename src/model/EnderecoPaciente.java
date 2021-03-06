package model;

import java.io.Serializable;

public class EnderecoPaciente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idenderecopaciente;
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	

	public EnderecoPaciente() {
	}

	public EnderecoPaciente(String rua, String numero, String bairro, String cidade) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Long getIdenderecopaciente() {
		return idenderecopaciente;
	}

	public void setIdenderecopaciente(Long idenderecopaciente) {
		this.idenderecopaciente = idenderecopaciente;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
