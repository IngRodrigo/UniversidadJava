package practica;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class Marco_Dialogo extends JFrame {
	
	public Marco_Dialogo(){
		
		setTitle("Marco Dialogos");
		
		setBounds(600,200,400,400);
		
		JPanel Lamina_cuadricula=new JPanel();
		
		Lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		String primero[]={"Mensaje"," Confirmar ","Opcion ","Entrada "};
		
		
		 Lamina_Tipo=new Lamina_Dialogos("Tipo",primero);
		
		Tipo_Lamina_Mensaje=new Lamina_Dialogos("Tipo Mensaje", new String[]{
				
				"ERROR DE MENSAJE",
				"INFORMACION DE MENSAJE",
				"PREGUNTA DE MENSAJE",
				"MENSAJE SENCILLO"	
				
		});
		
		Lamina_Mensaje=new Lamina_Dialogos("Mensaje1", new String[]{
				
				"Cadena",
				"Icono",
				"Componente",
				"Otros",
				"Obejt[]"		
		});
		
		Lamina_Confirmar=new Lamina_Dialogos("Confirmar", new String[]{
				
				"DEFAULT_OPTION",
				"YES_NOT_OPTION",
				"YES_NOT_CANCEL_OPTION",
				"OK_CANCEL_OPTION"			
		});
		
		Lamina_Opcion=new Lamina_Dialogos("Opci�n", new String[]{
				
				"Strin[]",
				"Icon[]",
				"Option[]"			
		});
		
		Lamina_Entrada=new Lamina_Dialogos("Entrada", new String[]{
				
				"Campo de Texto",
				"Combo"
						
		});
		
		setLayout(new BorderLayout());
		
		Lamina_cuadricula.add(Lamina_Tipo);
		Lamina_cuadricula.add(Tipo_Lamina_Mensaje);
		Lamina_cuadricula.add(Lamina_Mensaje);
		Lamina_cuadricula.add(Lamina_Confirmar);
		Lamina_cuadricula.add(Lamina_Opcion);
		Lamina_cuadricula.add(Lamina_Entrada);
		
		//construimos la lamina inferior "Mostrar"
		
		
		JPanel Lamina_Mostrar=new JPanel();
		
		JButton MostrarT=new JButton("Mostrar");
		
		MostrarT.addActionListener(new AccionMostrar());
		
		Lamina_Mostrar.add(MostrarT);
		
		add(Lamina_Mostrar,BorderLayout.SOUTH);
		
		//Lamina_cuadricula.setBackground(Color.ORANGE);
		
		add(Lamina_cuadricula, BorderLayout.CENTER);
		
		//JPanel LGrid=new lamina_superior();
		//---------------------------------------
		
		
		
		
		
		
		
		
		//---------------------------------------
	}
	
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//System.out.println(Lamina_Tipo.dameSeleccion());
			String mensaje=Lamina_Tipo.dameSeleccion();
		if(Lamina_Tipo.dameSeleccion().equals("Mensaje")){
			
				JOptionPane.showMessageDialog(Marco_Dialogo.this,"Mensaje");
				
				//System.out.println("Mensaje");
			}
			
		}
	}
	
 
	private Lamina_Dialogos Lamina_Tipo, Tipo_Lamina_Mensaje,Lamina_Mensaje, Lamina_Confirmar,Lamina_Opcion, Lamina_Entrada;
	 private String cadenaMensaje="Mensaje";
	 private Icon iconoMensaje=new ImageIcon("src/bola_azul.gif");
	 private Object objectoMensaje=new Date();
	 private Component componenteMensaje=new Lamina_Ejemplo();
}

class Lamina_Ejemplo extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo=new Rectangle2D.Double(0,0,getWidth(),getHeight());
		g2.setPaint(Color.yellow);
		g2.fill(rectangulo);
	}
}

/*class lamina_superior extends JPanel{
	
	public lamina_superior(){
		
		setLayout(new GridLayout(2,3));
	}
}*/