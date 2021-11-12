package br.projeto.site.meumenu.controller;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class IndexController {

    @FXML
    private DatePicker dpData;

    @FXML
    private TextField tfTarefa;

    @FXML
    private TextField tfStatus;

    @FXML
    private TextArea tfComentario;

    @FXML
    private Button adiar;

    @FXML
    private Button salvar;

    @FXML
    private Button apagar;

    @FXML
    private Button concluir;

    @FXML
    private Button limpar;
    
    

    public DatePicker getDpData() {
		return dpData;
	}

	public void setDpData(DatePicker dpData) {
		this.dpData = dpData;
	}

	public TextField getTfTarefa() {
		return tfTarefa;
	}

	public void setTfTarefa(TextField tfTarefa) {
		this.tfTarefa = tfTarefa;
	}

	public TextField getTfStatus() {
		return tfStatus;
	}

	public void setTfStatus(TextField tfStatus) {
		this.tfStatus = tfStatus;
	}

	public TextArea getTfComentario() {
		return tfComentario;
	}

	public void setTfComentario(TextArea tfComentario) {
		this.tfComentario = tfComentario;
	}

	public Button getAdiar() {
		return adiar;
	}

	public void setAdiar(Button adiar) {
		this.adiar = adiar;
	}

	public Button getSalvar() {
		return salvar;
	}

	public void setSalvar(Button salvar) {
		this.salvar = salvar;
	}

	public Button getApagar() {
		return apagar;
	}

	public void setApagar(Button apagar) {
		this.apagar = apagar;
	}

	public Button getConcluir() {
		return concluir;
	}

	public void setConcluir(Button concluir) {
		this.concluir = concluir;
	}

	public Button getLimpar() {
		return limpar;
	}

	public void setLimpar(Button limpar) {
		this.limpar = limpar;
	}

	@FXML
    public void btAdiar() {

    }

    @FXML
    public void btConcluir() {

    }

    @FXML
    public void btExcluir() {

    }

    @FXML
    public void btLimpar() {

    }

    @FXML
    public void btSalvar() {
    	//validação de campos
    	if(dpData.getValue()== null) {
    		JOptionPane.showMessageDialog(null, "Informe a data Limite","informe", JOptionPane.ERROR_MESSAGE);
    		dpData.requestFocus();
    		
    	}else if(tfTarefa.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Informe a Descrição da Tarefa","Informe",JOptionPane.ERROR_MESSAGE);
    		tfTarefa.requestFocus();
    		
    	}else if(tfTarefa.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Informe os Comentários da Tarefa","Informe",JOptionPane.ERROR_MESSAGE);
    		tfComentario.requestFocus();
    	}
    }

}
