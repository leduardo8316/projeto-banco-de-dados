package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.ControllerConsulta;
import model.Hospital;
import model.Medico;
import model.Paciente;

public class InterfaceConsulta {
	ControllerConsulta controllerConsulta = new ControllerConsulta();
	Paciente paciente = new Paciente();
	Hospital hospital = new Hospital();
	Medico medico = new Medico();
	long idtempPaciente;
	long idtempHospital;
	long idtempMedico;

	public void agendarConsulta() {
		JPanel agendarConsulta = new JPanel();
		agendarConsulta.setLayout(new GridLayout(14, 4, 2, 1));
		JFrame janelaAgendarConsulta = new JFrame("Agendar Consulta");
		janelaAgendarConsulta.setSize(700, 600);
		janelaAgendarConsulta.setLocationRelativeTo(null);
		janelaAgendarConsulta.setVisible(true);
		janelaAgendarConsulta.add(agendarConsulta);

		MaskFormatter maskcpfbusca = null;
		try {
			maskcpfbusca = new MaskFormatter("###.###.###-##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MaskFormatter maskcpfpaciente = null;
		try {
			maskcpfpaciente = new MaskFormatter("###.###.###-##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JLabel lblcpfpaciente = new JLabel("CPF Paciente: ");
		JFormattedTextField txtcpfpaciente = new JFormattedTextField(maskcpfbusca);
		JButton botaoBuscarPaciente = new JButton("Buscar Paciente");
		JLabel lblNomePaciente = new JLabel("Nome Paciente: ");
		JTextField txtNomePaciente = new JTextField(100);
		JLabel lblcpfpaciente2 = new JLabel("CPF Paciente: ");
		JFormattedTextField txtcpfpaciente2 = new JFormattedTextField(maskcpfpaciente);
		JLabel lbltelefonePaciente = new JLabel("Telefone Paciente: ");
		
		MaskFormatter masktelefone = null;
		try {
			masktelefone = new MaskFormatter("(##)####-####");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFormattedTextField txtTelefonePaciente = new JFormattedTextField(masktelefone);
		JLabel lblsexo = new JLabel("Sexo: ");
		JTextField txtsexo = new JTextField(10);

		MaskFormatter maskcnpj = null;
		try {
			maskcnpj = new MaskFormatter("##.###.###/####-##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MaskFormatter maskcnpj2 = null;
		try {
			maskcnpj2 = new MaskFormatter("##.###.###/####-##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MaskFormatter masktelefonemedico = null;
		try {
			masktelefonemedico = new MaskFormatter("(##)####-####");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JLabel lblcnpjHospital = new JLabel("CNPJ Hospital: ");
		JFormattedTextField txtcpnjHospital = new JFormattedTextField(maskcnpj);
		JButton botaoBuscarHospital = new JButton("Buscar Hospital");
		JLabel lblNomeHospital = new JLabel("Hospital: ");
		JTextField txtNomeHospital = new JTextField(100);
		JLabel lblcpnjhospital2 = new JLabel("CNPJ Hospital: ");
		JFormattedTextField txtcpnj = new JFormattedTextField(maskcnpj2);
		JLabel lbltelefoneHospital = new JLabel("Telefone Hospital: ");
		JFormattedTextField txtTelefoneHospital = new JFormattedTextField(masktelefonemedico);
		JLabel lblrua = new JLabel("Rua: ");
		JTextField txtrua = new JTextField(100);
		JTextField txtnumero = new JTextField(100);
		JLabel lblbairro = new JLabel("Bairro: ");
		JTextField txtbairro = new JTextField(100);
		JLabel lblcidade = new JLabel("Cidade: ");
		JTextField txtcidade = new JTextField(100);
		
		MaskFormatter maskcpfmedico = null;
		try {
			maskcpfmedico = new MaskFormatter("###.###.###-##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MaskFormatter maskcpfmedico2 = null;
		try {
			maskcpfmedico2 = new MaskFormatter("###.###.###-##");
		} catch (Exception e) {
			e.printStackTrace();
		}

		JLabel lblcpfmedico = new JLabel("CPF Medico: ");
		JFormattedTextField txtcpfmedico = new JFormattedTextField(maskcpfmedico);
		JButton botaobuscarMedico = new JButton("Buscar Medico");
		JLabel lblNomeMedico = new JLabel("Nome Medico: ");
		JTextField txtNomeMedico = new JTextField(100);
		JLabel lblcpfmedico2 = new JLabel("CPF Medico: ");
		JFormattedTextField txtcpfmedico2 = new JFormattedTextField(maskcpfmedico2);
		JLabel lblcrmMedico = new JLabel("CRM: ");
		JTextField txtcrmMedico = new JTextField(100);
		JLabel lblbespcialidade = new JLabel("Especialidade: ");
		JTextField txtespecialidade = new JTextField(10);
		JLabel lbldiagnostico = new JLabel("Diagnostico: ");
		JTextField txtdiagnostico = new JTextField(500);
		JButton botaoAgendarConsulta = new JButton("Agendar Consulta");
		JButton fecharjanela = new JButton("Fechar Janela");

		agendarConsulta.add(lblcpfpaciente);
		agendarConsulta.add(txtcpfpaciente);
		agendarConsulta.add(botaoBuscarPaciente);
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(lblNomePaciente);
		agendarConsulta.add(txtNomePaciente);
		agendarConsulta.add(lblcpfpaciente2);
		agendarConsulta.add(txtcpfpaciente2);
		agendarConsulta.add(lbltelefonePaciente);
		agendarConsulta.add(txtTelefonePaciente);
		agendarConsulta.add(lblsexo);
		agendarConsulta.add(txtsexo);
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(lblcnpjHospital);
		agendarConsulta.add(txtcpnjHospital);
		agendarConsulta.add(botaoBuscarHospital);
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(lblNomeHospital);
		agendarConsulta.add(txtNomeHospital);
		agendarConsulta.add(lblcpnjhospital2);
		agendarConsulta.add(txtcpnj);
		agendarConsulta.add(lbltelefoneHospital);
		agendarConsulta.add(txtTelefoneHospital);
		agendarConsulta.add(lblrua);
		agendarConsulta.add(txtrua);
		agendarConsulta.add(lblbairro);
		agendarConsulta.add(txtbairro);
		agendarConsulta.add(lblcidade);
		agendarConsulta.add(txtcidade);
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(lblcpfmedico);
		agendarConsulta.add(txtcpfmedico);
		agendarConsulta.add(botaobuscarMedico);
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(lblNomeMedico);
		agendarConsulta.add(txtNomeMedico);
		agendarConsulta.add(lblcpfmedico2);
		agendarConsulta.add(txtcpfmedico2);
		agendarConsulta.add(lblcrmMedico);
		agendarConsulta.add(txtcrmMedico);
		agendarConsulta.add(lblbespcialidade);
		txtespecialidade.setPreferredSize(new Dimension(200, 200));
		agendarConsulta.add(txtespecialidade);
		agendarConsulta.add(lbldiagnostico);
		agendarConsulta.add(txtdiagnostico);
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(new JLabel());
		agendarConsulta.add(botaoAgendarConsulta);
		agendarConsulta.add(fecharjanela);

		txtcpfpaciente2.setBorder(null);
		txtNomePaciente.setBorder(null);
		txtTelefonePaciente.setBorder(null);
		txtsexo.setBorder(null);
		txtNomeHospital.setBorder(null);
		txtTelefoneHospital.setBorder(null);
		txtcpnj.setBorder(null);
		txtTelefoneHospital.setBorder(null);
		txtrua.setBorder(null);
		txtnumero.setBorder(null);
		txtbairro.setBorder(null);
		txtcidade.setBorder(null);
		txtNomeMedico.setBorder(null);
		txtcpfmedico2.setBorder(null);
		txtcrmMedico.setBorder(null);
		txtespecialidade.setBorder(null);
		txtrua.setBorder(null);
		txtbairro.setBorder(null);
		txtcidade.setBorder(null);

		txtcpfpaciente2.setEditable(false);
		txtNomePaciente.setEditable(false);
		txtTelefonePaciente.setEditable(false);
		txtsexo.setEditable(false);
		txtNomeHospital.setEditable(false);
		txtTelefoneHospital.setEditable(false);
		txtcpnj.setEditable(false);
		txtTelefoneHospital.setEditable(false);
		txtrua.setEditable(false);
		txtnumero.setEditable(false);
		txtbairro.setEditable(false);
		txtcidade.setEditable(false);
		txtNomeMedico.setEditable(false);
		txtcpfmedico2.setEditable(false);
		txtcrmMedico.setEditable(false);
		txtespecialidade.setEditable(false);
		txtrua.setEditable(false);
		txtbairro.setEditable(false);
		txtcidade.setEditable(false);

		txtcpfpaciente2.setFont(txtcpfpaciente2.getFont().deriveFont(14f));
		txtNomePaciente.setFont(txtNomePaciente.getFont().deriveFont(14f));
		txtTelefonePaciente.setFont(txtTelefonePaciente.getFont().deriveFont(14f));
		txtsexo.setFont(txtsexo.getFont().deriveFont(14f));
		txtNomeHospital.setFont(txtNomeHospital.getFont().deriveFont(14f));
		txtTelefoneHospital.setFont(txtTelefoneHospital.getFont().deriveFont(14f));
		txtcpnj.setFont(txtcpnj.getFont().deriveFont(14f));
		txtTelefoneHospital.setFont(txtTelefoneHospital.getFont().deriveFont(14f));
		txtrua.setFont(txtrua.getFont().deriveFont(14f));
		txtnumero.setFont(txtnumero.getFont().deriveFont(14f));
		txtbairro.setFont(txtbairro.getFont().deriveFont(14f));
		txtcidade.setFont(txtcidade.getFont().deriveFont(14f));
		txtNomeMedico.setFont(txtNomeMedico.getFont().deriveFont(14f));
		txtcpfmedico2.setFont(txtcpfmedico2.getFont().deriveFont(14f));
		txtcrmMedico.setFont(txtcrmMedico.getFont().deriveFont(14f));
		txtespecialidade.setFont(txtespecialidade.getFont().deriveFont(14f));
		txtrua.setFont(txtrua.getFont().deriveFont(14f));
		txtbairro.setFont(txtbairro.getFont().deriveFont(14f));
		txtcidade.setFont(txtcidade.getFont().deriveFont(14f));

		
		botaoBuscarPaciente.addActionListener(ActionListener -> {
			paciente = controllerConsulta.buscarDadosPaciente(txtcpfpaciente.getText());
			txtNomePaciente.setText(paciente.getNome());
			txtcpfpaciente2.setText(paciente.getCpf());
			txtTelefonePaciente.setText(paciente.getTelefonePaciente().getNumero());
			txtsexo.setText(paciente.getSexo());
			idtempPaciente = paciente.getId();
			
		});

		botaoBuscarHospital.addActionListener(ActionEvent -> {
			hospital = controllerConsulta.buscarDadosHospital(txtcpnjHospital.getText());
			txtNomeHospital.setText(hospital.getNome());
			txtcpnj.setText(hospital.getCnpj());
			txtTelefoneHospital.setText(hospital.getTelefoneHospital().getNumerotelefone());
			txtrua.setText(hospital.getRua());
			txtbairro.setText(hospital.getBairro());
			txtcidade.setText(hospital.getCidade());
			idtempHospital = hospital.getIdhospital();

		});

		botaobuscarMedico.addActionListener(ActionEvent -> {
			medico = controllerConsulta.buscarDadosMedico(txtcpfmedico.getText());
			txtNomeMedico.setText(medico.getNome());
			txtcpfmedico2.setText(medico.getCpf());
			txtcrmMedico.setText(medico.getCrm());
			txtespecialidade.setText(medico.getEspecialidade());
			idtempMedico = medico.getId();
		});

		botaoAgendarConsulta.addActionListener(ActionEvent -> {
			controllerConsulta.agendarConsulta(txtdiagnostico.getText(), idtempPaciente, idtempHospital, idtempMedico);
		});
		
		fecharjanela.addActionListener(ActionEvent ->{
			janelaAgendarConsulta.dispose();
		});
	}
	
	
}
