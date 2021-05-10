package practica;

import javax.swing.*;

public class Lamina_Dialogos extends JPanel {
	
	public Lamina_Dialogos(String titulo, String [] Opciones){
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));// x_AXIS es pra poner en forma de filas
		
		 grupo=new ButtonGroup();
		
		for(int i=0; i<Opciones.length; i++){
			
			JRadioButton bot=new JRadioButton(Opciones[i]);
			
			bot.setActionCommand(Opciones[i]);//lo que hace es seleccionar lo que esta alamacenado en el bot
			
			 add(bot);
			
			 grupo.add(bot);
			 
			 bot.setSelected(i==0);
			 
		}
		
	}

	
	public String dameSeleccion(){
		
		//se puede hacer de esta manera
		/*ButtonModel miboton=grupo.getSelection();
		String s=miboton.getActionCommand();
		
		return s;*/
		
		//o simplificar codigo
		
		return grupo.getSelection().getActionCommand(); // de esta manera se puede simplificar el codigo declarado mas arriba
	}
	
	private ButtonGroup grupo;
	
}
