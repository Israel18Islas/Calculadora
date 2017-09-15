import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class VentanaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField Pantalla;
	private String cadena="";
	
	float Resultado = 0;
	int suma =0,resta=0,multiplicacion=0,division=0;
	double aux1=0,aux2=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculadora frame = new VentanaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCalculadora() {
		setTitle("Calculadora Sencilla");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Pantalla = new JTextField();
		Pantalla.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Pantalla.setText("0");
		Pantalla.setBackground(Color.DARK_GRAY);
		Pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		Pantalla.setEnabled(false);
		contentPane.add(Pantalla, BorderLayout.NORTH);
		Pantalla.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton Uno = new JButton("1");
		Uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="1";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Uno);
		
		JButton Dos = new JButton("2");
		Dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="2";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Dos);
		
		JButton Tres = new JButton("3");
		Tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="3";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Tres);
		
		JButton BorrarTodo = new JButton("CA");
		BorrarTodo.setBackground(Color.MAGENTA);
		BorrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena="";
				suma = 0;
				resta = 0;
				multiplicacion = 0;
				division = 0;
				Resultado = 0;
				aux1 = 0;
				aux2 = 0;
				Pantalla.setText("0");
			}
		});
		panel.add(BorrarTodo);
		
		JButton Cuatro = new JButton("4");
		Cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="4";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Cuatro);
		
		JButton Cinco = new JButton("5");
		Cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="5";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Cinco);
		
		JButton Seis = new JButton("6");
		Seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="6";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Seis);
		
		JButton Sumar = new JButton("+");
		Sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			suma = 1;
			aux1 = Double.parseDouble(cadena);
			cadena="";
			}
		});
		panel.add(Sumar);
		
		JButton Siete = new JButton("7");
		Siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="7";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Siete);
		
		JButton Ocho = new JButton("8");
		Ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="8";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Ocho);
		
		JButton Nueve = new JButton("9");
		Nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="9";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Nueve);
		
		JButton Restar = new JButton("-");
		Restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resta = 1;
				aux1 = Double.parseDouble(cadena);
				cadena="";
			}
		});
		panel.add(Restar);
		
		JButton Raiz = new JButton("Raiz");
		Raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aux1=Double.parseDouble(cadena);
				Resultado = (float) (Math.sqrt(aux1));
				Pantalla.setText(String.valueOf(Resultado));
				cadena="";
			}
		});
		panel.add(Raiz);
		
		JButton Cero = new JButton("0");
		Cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadena+="0";
				Pantalla.setText(cadena);
			}
		});
		panel.add(Cero);
		
		JButton Potencia = new JButton("Potencia");
		Potencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aux1=Double.parseDouble(cadena);
				Resultado = (float) (aux1*aux1);
				Pantalla.setText(String.valueOf(Resultado));
				cadena="";
			}
		});
		panel.add(Potencia);
		
		JButton Multiplicar = new JButton("*");
		Multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplicacion = 1;
				aux1 = Double.parseDouble(cadena);
				cadena="";
			}
		});
		panel.add(Multiplicar);
		
		JButton Respuesta = new JButton("ANS");
		Respuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla.setText(String.valueOf(Resultado));
				aux1 = Resultado;
			}
		});
		panel.add(Respuesta);
		
		JButton Igual = new JButton("=");
		Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aux2 = Double.parseDouble(cadena);
				if(suma == 1) {
					Resultado = (float) (aux1 + aux2);
					Pantalla.setText(String.valueOf(Resultado));
				}
				else if(resta == 1){
					Resultado = (float) (aux1 - aux2);
					Pantalla.setText(String.valueOf(Resultado));
				}
				else if(multiplicacion == 1) {
					Resultado = (float) (aux1 * aux2);
					Pantalla.setText(String.valueOf(Resultado));
				}
				else if(division == 1) {
					Resultado = (float) (aux1 / aux2);
					Pantalla.setText(String.valueOf(Resultado));
				}
				cadena = "";
				}
		});
		panel.add(Igual);
		
		JButton Borrar = new JButton("C");
		Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla.setText("0");
				aux1=0;
				aux2=0;
			}
		});
		panel.add(Borrar);
		
		JButton Dividir = new JButton("/");
		Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				division = 1;
				aux1 = Double.parseDouble(cadena);
				cadena="";
			}
		});
		panel.add(Dividir);
	}

}
